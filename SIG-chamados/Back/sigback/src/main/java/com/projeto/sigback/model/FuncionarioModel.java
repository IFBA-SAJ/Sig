package com.projeto.sigback.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioModel {
    private long id;
    private String nome;
    private String email;
    private String senha;
}
