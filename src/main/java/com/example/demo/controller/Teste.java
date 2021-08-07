package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.requestDto.ModalidadeEmprestimoResponse;
import com.example.demo.requestDto.NewClienteRequest;
import com.example.demo.service.EmprestimoService;

@RestController
@RequestMapping(value = "/teste", produces="application/json")
public class Teste {
	
	@Autowired
	private EmprestimoService emprestimoService; 
	
	
	@PostMapping
	public ModalidadeEmprestimoResponse postMethodName(@Valid @RequestBody NewClienteRequest newCliente) {

		return emprestimoService.toServicos(newCliente);
		
	}

	

}
