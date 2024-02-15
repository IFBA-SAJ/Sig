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

import com.projeto.sigback.entity.Morador;
import com.projeto.sigback.model.ManipulaResposta;
import com.projeto.sigback.model.MoradorModel;
import com.projeto.sigback.service.MoradorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/morador")
public class MoradorController {
    private final MoradorService service;

    @PostMapping
    public ResponseEntity<Object> salvarMorador(@RequestBody MoradorModel model) {
        Morador morador = new Morador();
        morador.setNome(model.getNome());
        morador.setEmail(model.getEmail());
        morador.setNumeroApt(model.getNumeroApt());
        morador.setBloco(model.getBloco());
        morador.setSenha(model.getSenha());
        return ManipulaResposta.response(HttpStatus.OK, service.salvar(morador), true);
    }

    @GetMapping
    public ResponseEntity<Object> getMoradores() {
        return ManipulaResposta.response(HttpStatus.OK, service.buscarTudo(), true);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getMorador(@PathVariable("id") long id) {
        return ManipulaResposta.response(HttpStatus.OK, service.getById(id), true);
    }
}
