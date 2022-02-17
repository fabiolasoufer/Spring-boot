package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "As mentalidades usadas para realizar esse exercício foram:"
				+ " \nPersistência e Orientação ao Futuro."
				+ "\nA habilidade usada para realizar esse exercício foi:"
				+ " \nAtenção aos detalhes.";
	}

}
