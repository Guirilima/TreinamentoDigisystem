package com.projectOne.projectOne.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Considerando a Classe como Controller
public class OneController {

    //Por padrão será GET (method = RequestMethod.GET)
    @RequestMapping//estou mapeando uma requisição com esse método
    //OU
    //@RequestMapping(method = RequestMethod.GET, path = "/ola") // é retornaremos no http:localhost:8080/ola
    //OU
    //@RequestMapping(value="/index", method=RequestMethod.GET)
    //OU simplesmente
    //@GetMapping(/path = "/ola") é retornaremos no http:localhost:8080/ola
    //@GetMapping("/") é retornaremos no http:localhost:8080/
    //Método ola, que retonará uma String
    public String ola(){
        return "Olá Spring Boot!";
    }
}

