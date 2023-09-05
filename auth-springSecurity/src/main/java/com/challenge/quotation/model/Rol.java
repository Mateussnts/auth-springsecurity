package com.challenge.quotation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Rol(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Rol() {
    }

    public Rol(String nome) {
        this.nome = nome;
    }
}
