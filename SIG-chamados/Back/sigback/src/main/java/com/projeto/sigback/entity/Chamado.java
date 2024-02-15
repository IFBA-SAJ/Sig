package com.projeto.sigback.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chamados")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "criador_id", nullable = false)
    private Morador criador;

    @Column(name = "status", nullable = false)
    private StatusChamado status;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;
}