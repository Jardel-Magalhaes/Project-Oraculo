package com.oraculo.app.util;

public class AsciiArt {
    public static String logoOraculo() throws InterruptedException {
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

        ConsoleUtil.digitarTexto(logo, 3);


        return logo;
    }
}

