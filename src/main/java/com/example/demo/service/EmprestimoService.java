package com.example.demo.service;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TipoEmprestimo;
import com.example.demo.requestDto.ModalidadeEmprestimoResponse;
import com.example.demo.requestDto.NewClienteRequest;
import com.example.demo.requestDto.PossibilidadeEmprestimoResponse;

@Service
public class EmprestimoService {

	public ModalidadeEmprestimoResponse toServicos(NewClienteRequest cliente) {

		if (soAceitaEmprestimoPessoal(cliente)) {
			return toEmprestimoPessoal(cliente);
		}
		
		if (temSalarioLimeteMoraSp(cliente)) {
			return salarioAteMoraSp(cliente);
		}
		
		
		 if (temSalarioFaixaLimeteMoraSp(cliente)) {
		  return salarioFaixaSp(cliente);
		 }
		
		throw new IllegalArgumentException("Error !!");
	}

	
	private ModalidadeEmprestimoResponse salarioFaixaSp(NewClienteRequest cliente) {
		return new ModalidadeEmprestimoResponse(cliente,
				  Set.of(new PossibilidadeEmprestimoResponse(TipoEmprestimo.Pessoal, 4),
				         new PossibilidadeEmprestimoResponse(TipoEmprestimo.com_Garantia, 3)));
	}


	private boolean temSalarioFaixaLimeteMoraSp(NewClienteRequest cliente) {

		return cliente.getSalario().compareTo(new BigDecimal("3000")) > 0
			&& cliente.getSalario().compareTo(new BigDecimal("5000")) <= 0
			&& cliente.getEstado().equals("SP")
			&& cliente.getIdade() < 30;
	}


	private boolean temSalarioLimeteMoraSp(NewClienteRequest cliente) {
		return cliente.getSalario().compareTo(new BigDecimal("3000")) <= 0 
			&& cliente.getEstado().toUpperCase().equals("SP")
			&& cliente.getIdade() < 30;
	}

	public boolean soAceitaEmprestimoPessoal(NewClienteRequest cliente) {
		return cliente.getSalario().compareTo(new BigDecimal("3000")) <= 0
				&& !cliente.getEstado().toUpperCase().equals("SP");
	}

	public ModalidadeEmprestimoResponse toEmprestimoPessoal(NewClienteRequest cliente) {

		return new ModalidadeEmprestimoResponse(cliente,
				Set.of(new PossibilidadeEmprestimoResponse(TipoEmprestimo.Pessoal, 4)));
	}
	
	private ModalidadeEmprestimoResponse salarioAteMoraSp(NewClienteRequest cliente) {
		return new ModalidadeEmprestimoResponse(cliente, 
				Set.of(new PossibilidadeEmprestimoResponse(TipoEmprestimo.Pessoal, 3),
						new PossibilidadeEmprestimoResponse(TipoEmprestimo.com_Garantia, 4)));
	}


}
