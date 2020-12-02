package com.avalicaofinal.afpoo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControl {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello Spring Boot";
    }
    @GetMapping("/Cliente/{codigo}")
    public String pegaCliente(@PathVariable int codigo)
    {
        return "pegando o cliente " + codigo;
    }
}
