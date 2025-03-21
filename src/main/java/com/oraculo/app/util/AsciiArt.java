package com.oraculo.app.util;

public class AsciiArt {

    /**
     * Exibe a logo do Oráculo com efeito de digitação.
     *
     * @throws InterruptedException caso a thread seja interrompida durante o efeito.
     */
    public static void logoOraculo() throws InterruptedException {
        ConsoleUtil.limparTela();

        String logo = "\n      ▒█████   ██▀███   ▄▄▄       ▄████▄   █    ██  ██▓     ▒█████  \n" +
                "     ▒██▒  ██▒▓██ ▒ ██▒▒████▄    ▒██▀ ▀█   ██  ▓██▒▓██▒    ▒██▒  ██▒\n" +
                "     ▒██░  ██▒▓██ ░▄█ ▒▒██  ▀█▄  ▒▓█    ▄ ▓██  ▒██░▒██░    ▒██░  ██▒\n" +
                "     ▒██   ██░▒██▀▀█▄  ░██▄▄▄▄██ ▒▓▓▄ ▄██▒▓▓█  ░██░▒██░    ▒██   ██░\n" +
                "     ░ ████▓▒░░██▓ ▒██▒ ▓█   ▓██▒▒ ▓███▀ ░▒▒█████▓ ░██████▒░ ████▓▒░\n" +
                "     ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░ ▒▒   ▓▒█░░ ░▒ ▒  ░░▒▓▒ ▒ ▒ ░ ▒░▓  ░░ ▒░▒░▒░ \n" +
                "       ░ ▒ ▒░   ░▒ ░ ▒░  ▒   ▒▒ ░  ░  ▒   ░░▒░ ░ ░ ░ ░ ▒  ░  ░ ▒ ▒░ \n" +
                "     ░ ░ ░ ▒    ░░   ░   ░   ▒   ░         ░░░ ░ ░   ░ ░   ░ ░ ░ ▒  \n" +
                "         ░ ░     ░           ░  ░░ ░         ░         ░  ░    ░ ░  \n" +
                "                                 ░                                  \n" +
                "                                                       por: Jardel M \n";

        ConsoleUtil.digitarTexto(logo, 1);
    }

    /**
     * Exibe a logo do Oráculo instantaneamente, sem efeito de digitação.
     */
    public static void logoMenu() {

        System.out.println("\n      ▒█████   ██▀███   ▄▄▄       ▄████▄   █    ██  ██▓     ▒█████  \n" +
                "     ▒██▒  ██▒▓██ ▒ ██▒▒████▄    ▒██▀ ▀█   ██  ▓██▒▓██▒    ▒██▒  ██▒\n" +
                "     ▒██░  ██▒▓██ ░▄█ ▒▒██  ▀█▄  ▒▓█    ▄ ▓██  ▒██░▒██░    ▒██░  ██▒\n" +
                "     ▒██   ██░▒██▀▀█▄  ░██▄▄▄▄██ ▒▓▓▄ ▄██▒▓▓█  ░██░▒██░    ▒██   ██░\n" +
                "     ░ ████▓▒░░██▓ ▒██▒ ▓█   ▓██▒▒ ▓███▀ ░▒▒█████▓ ░██████▒░ ████▓▒░\n" +
                "     ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░ ▒▒   ▓▒█░░ ░▒ ▒  ░░▒▓▒ ▒ ▒ ░ ▒░▓  ░░ ▒░▒░▒░ \n" +
                "       ░ ▒ ▒░   ░▒ ░ ▒░  ▒   ▒▒ ░  ░  ▒   ░░▒░ ░ ░ ░ ░ ▒  ░  ░ ▒ ▒░ \n" +
                "     ░ ░ ░ ▒    ░░   ░   ░   ▒   ░         ░░░ ░ ░   ░ ░   ░ ░ ░ ▒  \n" +
                "         ░ ░     ░           ░  ░░ ░         ░         ░  ░    ░ ░  \n" +
                "                                 ░                                  \n" +
                "                                                                     \n");
    }
}
