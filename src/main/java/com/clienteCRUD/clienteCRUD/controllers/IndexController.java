package com.clienteCRUD.clienteCRUD.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Mostrando ao Spring que a class será um Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
