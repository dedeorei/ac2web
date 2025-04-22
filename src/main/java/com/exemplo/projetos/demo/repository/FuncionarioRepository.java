package com.exemplo.projetos.repository;

import com.exemplo.projetos.entity.Funcionario;
import com.exemplo.projetos.entity.Projeto;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    @Query("SELECT f.projetos FROM Funcionario f WHERE f.id = :id")
    List<Projeto> buscarProjetosPorFuncionario(@Param("id") Integer id);
}
