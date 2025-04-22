package com.exemplo.projetos.service;

import com.exemplo.projetos.entity.Setor;
import com.exemplo.projetos.repository.SetorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class SetorService {
    private final SetorRepository setorRepository;

    public Setor adicionar(Setor setor) {
        return setorRepository.save(setor);
    }

    public List<Setor> listarTodosComFuncionarios() {
        return setorRepository.listarSetoresComFuncionarios();
    }

    public Optional<Setor> buscarPorId(Integer id) {
        return setorRepository.findById(id);
    }
}
