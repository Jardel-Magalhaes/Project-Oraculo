package com.oraculo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oraculo")
public class OraculoController {

    @GetMapping("/status")
    public String status() {
        return "Oráculo está funcionando!";
    }
}
