package com.oraculo.app;

import com.oraculo.app.util.AsciiArt;
import com.oraculo.app.util.ConsoleUtil;
import com.oraculo.app.controller.MenuController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OraculoApp {

	public static void main(String[] args)  throws InterruptedException {
		ConsoleUtil.limparTela();

		AsciiArt.logoOraculo();

		ConsoleUtil.carregamentoTexto(2000);

		ConsoleUtil.limparTela();

		AsciiArt.logoMenu();

		ConsoleUtil.mensagemBoasVindas();

		ConsoleUtil.pressioneParaContinuar();

		ConsoleUtil.limparTela();

		AsciiArt.logoMenu();

		MenuController.exibirMenu();



	}
}