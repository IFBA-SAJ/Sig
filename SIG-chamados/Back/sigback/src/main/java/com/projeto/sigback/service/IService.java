package com.projeto.sigback.service;

import java.util.List;

public interface IService<T> {
     /**
     * Get T by id
     *
     * @param id as String
     * @return T
     */
    public T getById(long id);
    public List<T> buscarTudo();

    public T salvar(T obj);
    public void apagar(T obj);

    public long contaTotal();
    //public T modificar(T obj);
}
