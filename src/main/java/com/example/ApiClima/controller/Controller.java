package com.example.ApiClima.controller;

import com.example.ApiClima.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Service service = new Service();

    @GetMapping("/temperatura")
    public String consultarTemperaturaBH(){
        return service.consultarTemperaturaBH();
    }

    @GetMapping("/temperatura/{cidade}")
    public String consultarTemperatura(@PathVariable String cidade){
        return service.consultarTemperatura(cidade);
    }
}
