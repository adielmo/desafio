package com.example.demo.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PlacaCarroValidation implements ConstraintValidator<PlacaCarro, String>{

	@Override
	public void initialize(PlacaCarro constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
String placa = value == null ? "": value;

return placa.matches("[a-zA-Z]{3}[0-9][A-Za-z0-9][0-9]{2}");
                      //BRA3R54 OR GTR6541
	}

	

}
