package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cupcake {
    private Long id;
    private String nome;

    public Cupcake() {
    }

    public Cupcake(String name) {
        this.nome = name;
    }

    public Cupcake(Long id, String name) {
        this.id = id;
        this.nome = name;
    }
}
