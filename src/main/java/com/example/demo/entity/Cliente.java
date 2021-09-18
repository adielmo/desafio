package com.example.demo.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.br.CPF;

public class Cliente {
	
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
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(@NotBlank @CPF String cpf, @NotBlank String name, @NotNull int idade, @NotBlank String estado,
			@Positive @NotNull BigDecimal salario) {
		this.cpf = cpf;
		this.name = name;
		this.idade = idade;
		this.estado = estado;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
}
