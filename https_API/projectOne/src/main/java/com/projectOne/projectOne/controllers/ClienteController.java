package com.projectOne.projectOne.controllers;

import com.projectOne.projectOne.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    //Ja que declaramos acima que TODA a classe pertence a /clientes
    //abaixo só precisamos colocar /qualquer que será igual a = /clientes/qualquer
    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28,"Pedro","123.456.789-00");
    }
    @GetMapping("/{id}") //Id será modificado.
    public Cliente obterClientePorId1(@PathVariable int id) {//pegando variavel e jogando aqui
        return new Cliente(id,"Guilherme","233.433.223-00");
    }
}
