package com.clienteCRUD.clienteCRUD.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {
	@RequestMapping("/cadastrarCliente")
	public String form() {
		return "Evento/formNewCliente";
	}
}
