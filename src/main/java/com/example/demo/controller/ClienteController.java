package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ClienteModel;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	
	@PostMapping(value = "path")
	public ResponseEntity<ClienteModel> getMethodName(@RequestBody @Valid ClienteModel clienteModel) {
		
		
		
		return new ResponseEntity<>(clienteModel, HttpStatus.OK);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationException(MethodArgumentNotValidException exception){
		Map<String, String> mapErros = new HashMap<>();
		
		exception.getBindingResult().getAllErrors().forEach((error)-> {
			String fieldName = ((FieldError)error).getField();
			String errorMessage = error.getDefaultMessage();
			
			mapErros.put(fieldName, errorMessage);
			
		});
		
		return mapErros;
		
	}


}
