package org.example;

public class CadastrarAluno {
    private String nome;
    private int idade;

    public CadastrarAluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
