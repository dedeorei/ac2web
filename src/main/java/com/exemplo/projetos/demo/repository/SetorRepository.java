package com.exemplo.projetos.repository;

import com.exemplo.projetos.entity.Setor;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface SetorRepository extends JpaRepository<Setor, Integer> {
    @Query("SELECT s FROM Setor s LEFT JOIN FETCH s.funcionarios")
    List<Setor> listarSetoresComFuncionarios();
}
