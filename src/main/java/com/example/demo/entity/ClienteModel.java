package com.example.demo.entity;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CPF;

import com.example.demo.service.PlacaCarro;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ClienteModel {

	private Long id;
	@Pattern(regexp = "^[A-Z]+(.)*", message = "Primeira Letra Maiúscula")
	@NotBlank(message = "Campo não pode ser Vázio")
	private String nome;
	@Email
	private String email;
	@CPF
	private String cpf;

	@NotBlank
	@PlacaCarro(message = "Formato da Placa inválida! BRA3R54 OR GTR6541")
	private String placaCarro;
	
	@Min(value = 1940, message = "Idade maior que 1940.")
	private Integer idade;

	public ClienteModel() {

	}

	public ClienteModel(Long id, @NotBlank String nome, @Email String email, @CPF String cpf,
			@NotBlank String placaCarro, @Min(1940) Integer idade) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.placaCarro = placaCarro;
		this.idade = idade;
	}
	

	public ClienteModel(Long id, @NotBlank String nome, @Email String email, @CPF String cpf,
			@NotBlank String placaCarro) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.placaCarro = placaCarro;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}
		

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteModel other = (ClienteModel) obj;
		return Objects.equals(id, other.id);
	}

}
