package com.exemplo.projetos.repository;

import com.exemplo.projetos.entity.Projeto;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.*;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
    @Query("SELECT p FROM Projeto p LEFT JOIN FETCH p.funcionarios WHERE p.id = :id")
    Optional<Projeto> buscarProjetoComFuncionarios(@Param("id") Integer id);
    
    List<Projeto> findByDataInicioBetween(LocalDate dataInicio, LocalDate dataFim);
}
