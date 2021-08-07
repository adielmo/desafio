package com.example.demo.requestDto;

import java.math.BigDecimal;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.br.CPF;

import com.example.demo.entity.TipoEmprestimo;

public class NewClienteRequest {
	
	@NotBlank
	@CPF
	private String cpf;
	@NotBlank
	private String name;
	@NotNull
	private int idade;
	@NotBlank
	private String estado;
	@Positive
	@NotNull
	private BigDecimal salario;
	
	public NewClienteRequest() {
		
	}
	

	public String getCpf() {
		return cpf;
	}	
	public String getName() {
		return name;
	}
	
	public int getIdade() {
		return idade;
	}

	public String getEstado() {
		return estado;
	}
	public BigDecimal getSalario() {
		return salario;
	}



}
