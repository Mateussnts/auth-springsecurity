package com.challenge.quotation.DTO;

public class UserRegistroDTO {

    private Long id;

    private String nome;
    private String email;
    private String password;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRegistroDTO(Long id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public UserRegistroDTO(String nome, String email, String password) {
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public UserRegistroDTO(String email) {
        this.email = email;
    }

    public UserRegistroDTO() {
    }
}
