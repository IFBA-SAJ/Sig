package com.projeto.sigback.service;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.sigback.entity.Chamado;
import com.projeto.sigback.repository.ChamadoRepository;

@Service
@RequiredArgsConstructor
public class ChamadoService implements IService<Chamado> {
    @Autowired
    private final ChamadoRepository repository;

    @Override
    public Chamado getById(long id) {
        return repository.getChamadoById(id);
    }

    @Override
    public Chamado salvar(Chamado obj) {
        return repository.save(obj);
    }

    @Override
    public void apagar(Chamado obj) {
        repository.delete(obj);
    }

    @Override
    public List<Chamado> buscarTudo() {
        return repository.findAll();
    }

    @Override
    public long contaTotal() {
        return repository.count();
    }
}
