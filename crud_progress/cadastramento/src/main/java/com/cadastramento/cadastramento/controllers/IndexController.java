package com.cadastramento.cadastramento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Mostrando ao Spring
public class IndexController {
	//Método index que irá retornar a classe Index, quando receber "/"]
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

//Essa Classe não será usar POR ENQUANTO !