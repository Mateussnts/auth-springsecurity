package com.challenge.quotation.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuarios_roles",
            joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id")
    )
    private Collection<Rol> roles;

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

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> rols) {
        this.roles = rols;
    }

    public Usuario(Long id, String nome, String email, String password, Collection<Rol> rols) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.roles = rols;
    }

    public Usuario(String nome, String email, String password, Collection<Rol> rols) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.roles = rols;
    }

    public Usuario() {
    }
}
