package com.projeto.sigback.service;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.sigback.entity.Funcionario;
import com.projeto.sigback.repository.FuncionarioRepository;

@Service
@RequiredArgsConstructor
public class FuncionarioService implements IService<Funcionario> {

    @Autowired
    private final FuncionarioRepository repository;

    @Override
    public Funcionario getById(long id) {
        return repository.getFuncionarioById(id);
    }

    @Override
    public Funcionario salvar(Funcionario obj) {
        return repository.save(obj);
    }

    @Override
    public void apagar(Funcionario obj) {
        repository.delete(obj);
    }
    @Override
    public List<Funcionario> buscarTudo() {
        return repository.findAll();
    }

    @Override
    public long contaTotal() {
        return repository.count();
    }
}
