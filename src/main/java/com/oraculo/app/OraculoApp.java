package com.oraculo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OraculoApp {

	public static void main(String[] args) {
		SpringApplication.run(OraculoApp.class, args);
		System.out.println("Bem-vindo ao Oráculo!");
	}

}
