package org.example;

public class Curso {
    private String titulo;
    private String categoria;
    private int vagasDisponiveis;

    public Curso(String titulo, String categoria, int vagasDisponiveis) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public boolean matricular() {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
            return true;
        }
        return false;
    }

    public boolean cancelarMatricula() {
        vagasDisponiveis++;
        return true;
    }
}
