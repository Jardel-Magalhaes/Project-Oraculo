package com.oraculo.app.view;

import com.oraculo.app.controller.BlocoDeNotasController;
import com.oraculo.app.model.Nota;
import com.oraculo.app.util.AsciiArt;
import com.oraculo.app.util.ConsoleUtil;

import java.util.List;
import java.util.Scanner;

/**
 * Interface do usuário para o Bloco de Notas.
 */
public class BlocoDeNotasView {
    private BlocoDeNotasController controller;
    private Scanner scanner;

    public BlocoDeNotasView() {
        this.controller = new BlocoDeNotasController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuNotas() {
        while (true) {

            AsciiArt.logoMenu();
            System.out.println("---BLOCO DE NOTAS---");
            System.out.println("1. Adicionar Nota");
            System.out.println("2. Listar Notas");
            System.out.println("3. Remover Nota");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    ConsoleUtil.limparTela();
                    adicionarNota();
                    break;
                case 2:
                    ConsoleUtil.limparTela();
                    listarNotas();
                    break;
                case 3:
                    removerNota();
                    break;
                case 4:
                    ConsoleUtil.limparTela();
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private void adicionarNota() {
        System.out.println("-------------------------");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Conteúdo: ");
        String conteudo = scanner.nextLine();
        controller.adicionarNota(titulo, conteudo);
        System.out.println("Nota adicionada com sucesso!");
        System.out.println("-------------------------");
    }

    private void listarNotas() {
        List<Nota> notas = controller.listarNotas();
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota disponível.");
        } else {
            for (Nota nota : notas) {
                System.out.println("-------------------------");
                System.out.println(nota);
                System.out.println("-------------------------");
            }
        }
    }

    private void removerNota() {
        System.out.print("Digite o ID da nota a remover: ");

        try {
            int id = Integer.parseInt(scanner.nextLine()); // Converte entrada para inteiro


            if (controller.removerNota(id)) {

                System.out.println("Presione ENTER para confirmar a remoção.");
                ConsoleUtil.pressioneParaContinuar();
                System.out.println("Nota removida com sucesso!");
            } else {
                System.out.println("Nota não encontrada.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: O ID deve ser um número válido.");
        }
    }
}
