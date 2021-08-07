package com.example.demo.requestDto;

import java.util.Set;

public class ModalidadeEmprestimoResponse {

	private Set<PossibilidadeEmprestimoResponse> emprestimo;
	private String name;

	public ModalidadeEmprestimoResponse() {

	}

	public ModalidadeEmprestimoResponse(NewClienteRequest newClienteRequest,
			Set<PossibilidadeEmprestimoResponse> emprestimo) {
		this.emprestimo = emprestimo;
		this.name = newClienteRequest.getName();

	}
	
	public Set<PossibilidadeEmprestimoResponse> getEmprestimo() {
		return emprestimo;
	}
	public String getName() {
		return name;
	}

}
