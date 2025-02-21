package com.oraculo.app.service;

import org.springframework.stereotype.Service;

@Service
public class OraculoService {

    public String obterMensagem() {
        return "Esta é uma mensagem do Oráculo!";
    }
}
