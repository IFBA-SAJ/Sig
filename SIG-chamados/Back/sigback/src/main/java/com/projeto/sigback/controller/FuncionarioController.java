package com.projeto.sigback.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.sigback.model.ManipulaResposta;
import com.projeto.sigback.repository.FuncionarioRepository;
import com.projeto.sigback.entity.Funcionario;
import com.projeto.sigback.model.FuncionarioModel;
import com.projeto.sigback.service.FuncionarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/funcionario")
public class FuncionarioController {
    private final FuncionarioService service;

    @PostMapping
    public ResponseEntity<Object> salvaFuncionario(@RequestBody FuncionarioModel model) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(model.getNome());
        funcionario.setEmail(model.getEmail());
        funcionario.setSenha(model.getSenha());
        return ManipulaResposta.response(HttpStatus.OK, service.salvar(funcionario), true);
    }

    @GetMapping
    public ResponseEntity<Object> getFuncionarios() {
        return ManipulaResposta.response(HttpStatus.OK, service.buscarTudo(), true);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getFuncionario(@PathVariable("id") long id) {
        return ManipulaResposta.response(HttpStatus.OK, service.getById(id), true);
    }
}
