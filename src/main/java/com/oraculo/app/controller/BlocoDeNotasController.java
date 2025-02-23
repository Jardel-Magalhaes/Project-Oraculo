package com.oraculo.app.controller;

import com.oraculo.app.model.Nota;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador do Bloco de Notas, gerencia as operações de criação, edição e exclusão de notas.
 */
public class BlocoDeNotasController {
    private static final String ARQUIVO_NOTAS = "notas.txt";
    private List<Nota> notas;
    private int contadorNotas;

    public BlocoDeNotasController() {
        this.notas = new ArrayList<>();
        this.contadorNotas = 1; // Inicia o contador
        carregarNotas(); // Carrega notas do arquivo ao iniciar
    }

    public void adicionarNota(String titulo, String conteudo) {
        Nota novaNota = new Nota(contadorNotas++, titulo, conteudo);
        notas.add(novaNota);
        salvarNotas(); // Salva no arquivo
    }

    public List<Nota> listarNotas() {
        return notas;
    }

    public boolean removerNota(int id) {
        boolean removida = notas.removeIf(nota -> nota.getId() == id);
        if (removida) {
            salvarNotas(); // Atualiza o arquivo
        }
        return removida;
    }

    /**
     * Salva todas as notas no arquivo.
     */
    private void salvarNotas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_NOTAS))) {
            for (Nota nota : notas) {
                writer.write(nota.getId() + "|" + nota.getTitulo() + "|" + nota.getConteudo());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar notas: " + e.getMessage());
        }
    }

    /**
     * Carrega as notas do arquivo ao iniciar o programa.
     */
    private void carregarNotas() {
        File arquivo = new File(ARQUIVO_NOTAS);
        if (!arquivo.exists()) return; // Se não houver arquivo, não há nada para carregar

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_NOTAS))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split("\\|");
                if (partes.length == 3) {
                    int id = Integer.parseInt(partes[0]);
                    notas.add(new Nota(id, partes[1], partes[2]));
                    if (id >= contadorNotas) {
                        contadorNotas = id + 1; // Garante que o contador continue de onde parou
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar notas: " + e.getMessage());
        }
    }
}
