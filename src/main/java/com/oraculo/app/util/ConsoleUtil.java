package com.oraculo.app.util;

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
    public static void barraDeCarregamento(int duracao) throws InterruptedException {
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
    public static void carregamentoTexto() throws InterruptedException {
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r                                   " + i + "%");
            Thread.sleep(20);
        }
        System.out.println("\r" + " ".repeat(68));
        System.out.flush();

    }
}