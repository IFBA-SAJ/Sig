package com.projeto.sigback.repository;

import com.projeto.sigback.entity.Morador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoradorRepository extends JpaRepository<Morador, String> {

    /**
     * SQL query: SELECT * FROM moradores WHERE id =
     *
     * @param id as long
     * @return Morador
     */
    Morador getMoradorById(long id);

    /**
     * SQL query: SELECT * FROM moradores WHERE email =
     *
     * @param email as String
     * @return Morador
     */
    Morador getMoradorByEmail(String email);
}