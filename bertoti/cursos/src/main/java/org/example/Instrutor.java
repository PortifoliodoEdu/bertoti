package org.example;

public class Instrutor {
    private String nome;
    private String especialidade;

    public Instrutor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
