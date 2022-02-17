package com.helloworld2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloap")
public class HelloController2 {
	
	@GetMapping
	public String helloap() {
		return "Objetivos de aprendizagem da semana:"
				+"\n Usar a persistência para aprender mais sobre Spring e suas aplicações!";
	}

}
