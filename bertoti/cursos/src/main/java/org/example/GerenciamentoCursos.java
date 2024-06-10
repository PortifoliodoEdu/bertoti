package org.example;

import java.util.ArrayList;

public class GerenciamentoCursos {
    private ArrayList<Curso> cursos;

    public GerenciamentoCursos() {
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void matricularAluno(String titulo) {
        for (Curso curso : cursos) {
            if (curso.getTitulo().equalsIgnoreCase(titulo) && curso.getVagasDisponiveis() > 0) {
                curso.matricular();
                System.out.println("Aluno matriculado no curso " + titulo + " com sucesso!");
                return;
            }
        }
        System.out.println("Desculpe, o curso " + titulo + " não tem vagas disponíveis.");
    }

    public void cancelarMatricula(String titulo) {
        for (Curso curso : cursos) {
            if (curso.getTitulo().equalsIgnoreCase(titulo)) {
                curso.cancelarMatricula();
                System.out.println("Matrícula no curso " + titulo + " foi cancelada com sucesso!");
                return;
            }
        }
        System.out.println("Você não está matriculado no curso " + titulo + ".");
    }

    public void listarCursosDisponiveis() {
        System.out.println("Cursos disponíveis para matrícula:");
        for (Curso curso : cursos) {
            if (curso.getVagasDisponiveis() > 0) {
                System.out.println(curso.getTitulo() + " - Categoria: " + curso.getCategoria() + " - Vagas Disponíveis: " + curso.getVagasDisponiveis());
            }
        }
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
