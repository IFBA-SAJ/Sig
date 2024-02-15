package com.projeto.sigback.model;

import java.time.LocalDateTime;

import com.projeto.sigback.entity.Morador;
import com.projeto.sigback.entity.StatusChamado;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChamadoModel {
    private Morador criador;
    private String descricao;
    private StatusChamado status;
    private LocalDateTime data;
}
