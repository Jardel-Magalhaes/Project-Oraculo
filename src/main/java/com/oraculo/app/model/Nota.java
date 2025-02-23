package com.oraculo.app.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Representa uma nota no Bloco de Notas.
 */
@Getter
@Setter
public class Nota {
    private int id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataCriacao;

    public Nota(int id, String titulo, String conteudo) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCriacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return "ID: " + id + "\n" +
                "Data de Criação: " + dataCriacao.format(formatter) + "\n" +
                "Título: " + titulo + "\n" +
                "Conteúdo: " + conteudo;
    }
}
