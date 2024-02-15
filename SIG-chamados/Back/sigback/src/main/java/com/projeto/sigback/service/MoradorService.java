package com.projeto.sigback.service;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.sigback.entity.Morador;
import com.projeto.sigback.repository.MoradorRepository;

@Service
@RequiredArgsConstructor
public class MoradorService implements IService<Morador> {

    @Autowired
    private final MoradorRepository repository;

    @Override
    public Morador getById(long id) {
        return repository.getMoradorById(id);
    }

    @Override
    public Morador salvar(Morador obj) {
        return repository.save(obj);
    }

    @Override
    public void apagar(Morador obj) {
        repository.delete(obj);
    }

    @Override
    public List<Morador> buscarTudo() {
        return repository.findAll();
    }

    @Override
    public long contaTotal() {
        return repository.count();
    }

    // @Override
    // public Morador modificar(Morador obj) {
    //     Morador m = repository.findById(obj.getId());
    //     repository.save(obj);
    // }
}