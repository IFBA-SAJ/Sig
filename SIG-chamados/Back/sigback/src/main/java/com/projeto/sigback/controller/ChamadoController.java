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
import com.projeto.sigback.entity.Chamado;
import com.projeto.sigback.model.ChamadoModel;
import com.projeto.sigback.service.ChamadoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chamado")
public class ChamadoController {
    private final ChamadoService service;

    @PostMapping
    public ResponseEntity<Object> salvaChamado(@RequestBody ChamadoModel model) {
        Chamado chamado = new Chamado();
        chamado.setDescricao(model.getDescricao());
        chamado.setStatus(model.getStatus());
        chamado.setCriador(model.getCriador());
        chamado.setData(model.getData());
        return ManipulaResposta.response(HttpStatus.OK, service.salvar(chamado), true);
    }

    @GetMapping
    public ResponseEntity<Object> getChamados() {
        return ManipulaResposta.response(HttpStatus.OK, service.buscarTudo(), true);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getChamado(@PathVariable("id") long id) {
        return ManipulaResposta.response(HttpStatus.OK, service.getById(id), true);
    }
}
