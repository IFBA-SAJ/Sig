package com.projeto.sigback.repository;

import com.projeto.sigback.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {

    /**
     * SQL query: SELECT * FROM funcionarios WHERE id =
     *
     * @param id as long
     * @return Funcionario
     */
    Funcionario getFuncionarioById(long id);

    /**
     * SQL query: SELECT * FROM funcionarios WHERE email =
     *
     * @param email as String
     * @return Funcionario
     */
    Funcionario getFuncionarioByEmail(String email);
}