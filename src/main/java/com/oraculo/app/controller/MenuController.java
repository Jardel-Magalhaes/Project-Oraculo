package com.oraculo.app.controller;

import com.oraculo.app.util.AsciiArt;
import com.oraculo.app.util.ConsoleUtil;
import com.oraculo.app.view.BlocoDeNotasView;

import java.util.Scanner;

public class MenuController {

    /**
     * Exibe o menu principal do Oráculo.
     * @throws InterruptedException Caso a thread seja interrompida durante a execução.
     */
    public static void exibirMenu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            ConsoleUtil.limparTela();
            AsciiArt.logoMenu();
            System.out.println("\nSelecione uma opção:\n");
            System.out.println("1 - Bloco de Notas Rápido");
            System.out.println("2 - Cronômetro Pomodoro");
            System.out.println("3 - Atalhos para comandos frequentes");
            System.out.println("4 - Gerenciador de tarefas");
            System.out.println("5 - Conversor de texto para Markdown");
            System.out.println("6 - Snippet Manager");
            System.out.println("7 - Gerador de arquivos de projeto");
            System.out.println("8 - Conversor de unidades");
            System.out.println("9 - Monitor de uso da CPU e memória");
            System.out.println("0 - Sair");
            System.out.print("\nDigite sua opção: ");

            opcao = scanner.nextInt();
            processarOpcao(opcao);

        } while (opcao != 0);

        System.out.println("\nAté breve");
        scanner.close();
    }

    /**
     * Processa a opção selecionada pelo usuário no menu principal.
     * @param opcao Opção escolhida pelo usuário.
     * @throws InterruptedException Caso a thread seja interrompida durante a execução.
     */
    private static void processarOpcao(int opcao) throws InterruptedException {
        ConsoleUtil.limparTela();
        switch (opcao) {
            case 1 -> {
                BlocoDeNotasView blocoDeNotasView = new BlocoDeNotasView();
                blocoDeNotasView.exibirMenuNotas();
            }
            case 2 -> System.out.println("Cronômetro Pomodoro em desenvolvimento...");
            case 3 -> System.out.println("Atalhos para comandos frequentes em desenvolvimento...");
            case 4 -> System.out.println("Gerenciador de tarefas em desenvolvimento...");
            case 5 -> System.out.println("Conversor de texto para Markdown em desenvolvimento...");
            case 6 -> System.out.println("Snippet Manager em desenvolvimento...");
            case 7 -> System.out.println("Gerador de arquivos de projeto em desenvolvimento...");
            case 8 -> System.out.println("Conversor de unidades em desenvolvimento...");
            case 9 -> System.out.println("Monitor de uso da CPU e memória em desenvolvimento...");
            case 0 -> System.out.println("Encerrando aplicação...");
            default -> System.out.println("Opção inválida! Tente novamente.");
        }
        Thread.sleep(1000);
    }
}
