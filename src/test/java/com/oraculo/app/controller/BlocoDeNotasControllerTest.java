package com.oraculo.app.controller;

import com.oraculo.app.model.Nota;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BlocoDeNotasControllerTest {
    private BlocoDeNotasController controller;
    private static final String ARQUIVO_NOTAS = "notas.txt";

    @BeforeEach
    void setUp() {
        limparArquivoNotas();  // Remove o arquivo antes de cada teste para evitar interferências
        controller = new BlocoDeNotasController();
    }

    @Test
    void testAdicionarNota() {
        controller.adicionarNota("Título Teste", "Conteúdo da nota");
        List<Nota> notas = controller.listarNotas();

        assertEquals(1, notas.size(), "A lista deve conter exatamente 1 nota.");
        assertEquals("Título Teste", notas.get(0).getTitulo(), "O título da nota está incorreto.");
    }

    @Test
    void testListarNotas() {
        controller.adicionarNota("Nota 1", "Conteúdo 1");
        controller.adicionarNota("Nota 2", "Conteúdo 2");

        List<Nota> notas = controller.listarNotas();

        assertEquals(2, notas.size(), "A lista deve conter 2 notas.");
    }

    @Test
    void testRemoverNota() {
        controller.adicionarNota("Nota a remover", "Conteúdo");

        List<Nota> notasAntes = controller.listarNotas();
        assertFalse(notasAntes.isEmpty(), "A lista de notas não deve estar vazia antes da remoção.");

        int id = notasAntes.get(0).getId(); // Obtém o ID da nota recém-criada
        boolean removida = controller.removerNota(id);

        List<Nota> notasDepois = controller.listarNotas();
        assertTrue(removida, "A nota deveria ter sido removida.");
        assertEquals(0, notasDepois.size(), "A lista de notas deveria estar vazia após a remoção.");
    }

    /**
     * Método auxiliar para limpar o arquivo de notas antes de cada teste,
     * garantindo um ambiente de teste limpo.
     */
    private void limparArquivoNotas() {
        File arquivo = new File(ARQUIVO_NOTAS);
        if (arquivo.exists()) {
            arquivo.delete();
        }
    }
}
