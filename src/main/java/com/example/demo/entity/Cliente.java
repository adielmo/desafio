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


}
