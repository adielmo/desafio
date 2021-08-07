package com.example.demo.requestDto;

import com.example.demo.entity.TipoEmprestimo;

public class PossibilidadeEmprestimoResponse {

	private int taxa;
	private TipoEmprestimo tipo;
	
	public PossibilidadeEmprestimoResponse() {
		
	}

	public PossibilidadeEmprestimoResponse(TipoEmprestimo tipo, int taxa) {
		this.taxa = taxa;
		this.tipo = tipo;
	}

	public int getTaxa() {
		return taxa;
	}

	public TipoEmprestimo getTipo() {
		return tipo;
	}

}
