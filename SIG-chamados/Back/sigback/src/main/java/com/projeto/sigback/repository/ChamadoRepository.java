package com.projeto.sigback.repository;

import com.projeto.sigback.entity.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, String> {

    /**
     * SQL query: SELECT * FROM chamados WHERE id =
     *
     * @param id as long
     * @return Chamado
     */
    Chamado getChamadoById(long id);
}