package com.projeto.sigback.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "moradores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Morador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @JsonProperty("numero_apt")
    @Column(name = "numero_apt", nullable = false)
    private String numeroApt;

    @Column(name = "bloco", nullable = false)
    private String bloco;

    @Column(name = "senha", nullable = false)
    private String senha;

    @JsonIgnore
    public String getSenha() {
        return senha;
    }
}