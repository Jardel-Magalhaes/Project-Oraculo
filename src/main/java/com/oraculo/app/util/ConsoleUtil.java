package com.oraculo.app.util;

import java.util.Scanner;

public class ConsoleUtil {

    /**
     * Limpa o terminal, simulando o comando de limpeza da tela.
     */
    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela.");
        }
    }


    /**
     * Exibe um texto caractere por caractere com um efeito de digitação.
     *
     * @param texto      Texto a ser exibido.
     * @param velocidade Tempo de espera entre os caracteres (em milissegundos).
     * @throws InterruptedException Se a thread for interrompida durante a exibição do texto.
     */
    public static void digitarTexto(String texto, int velocidade) throws InterruptedException {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            Thread.sleep(velocidade);
        }
        System.out.println();
    }


    /**
     * Exibe um efeito de "Carregando..." com pontos pulsando.
     *
     * @param duracao Tempo total da animação em milissegundos.
     * @throws InterruptedException Se a thread for interrompida durante a execução.
     */
    public static void carregamentoTexto(int duracao) throws InterruptedException {
        String base = "                         Iniciando aplicação";
        ;
        int ciclos = duracao / 500;

        for (int i = 0; i < ciclos; i++) {
            System.out.print("\r" + base + ".  ");
            Thread.sleep(166);
            System.out.print("\r" + base + ".. ");
            Thread.sleep(166);
            System.out.print("\r" + base + "... ");
            Thread.sleep(168);
        }
        System.out.print("\r" + " ".repeat(base.length() + 5) + "\r");
        System.out.flush();
    }


    /**
     * Exibe uma barra de carregamento no terminal de 0% a 100%.
     * Cada atualização ocorre a cada 20ms, resultando em um carregamento total de 2 segundos.
     *
     * @throws InterruptedException se a thread for interrompida durante a execução
     */
    public static void carregamentoNumeros() throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r                                   " + i + "%");
            Thread.sleep(20);
        }
        System.out.println("\r" + " ".repeat(68));
        System.out.flush();
    }
        /**
         * Exibe uma mensagem de boas-vindas com efeito de digitação.
         */
        public static void mensagemBoasVindas() throws InterruptedException {
            String mensagem = "\n                    Bem-vindo ao Projeto Oráculo                    ";
            String instrucoes = "\n       Pressione qualquer tecla para exibir o menu de funções       ";


            try {
                digitarTexto(mensagem, 3); // Exibe com efeito de digitação

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Mantém o status de interrupção da thread
                System.out.println("\nA execução foi interrompida.");
            }
            System.out.println(instrucoes);
        }

        /**
         * Aguarda o usuário pressionar qualquer tecla antes de continuar.
         */
        public static void pressioneParaContinuar() {
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine(); // Aguarda o usuário pressionar Enter
        }
    }


