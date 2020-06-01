package com.cadastramento.cadastramento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cadastramento.cadastramento.models.Cliente;
import com.cadastramento.cadastramento.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository er;
	
	//método que irá retornar um form
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String form() {
		return "formCliente";
	}
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
	public String form(Cliente evento) {
		
//		er.save(evento);
		System.out.println(er);
		return "redirect:/cadastrarCliente";
	}
}

//AQUI ESTAREMOS PEGANDO O QUE O USUÁRIO DIGITAR NOS FORMS.
//JÁ CONSIGO PEGAR O EVENTO (O VALOR INSERIDO PELO USUÁRIO NA LINHA 26)
//PROBLEMA EM SALVAR O EVENTO(VALORES INSERIDOS), DENTRO DA TABELA.