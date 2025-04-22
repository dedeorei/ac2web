package com.exemplo.projetos.service;

import com.exemplo.projetos.entity.Funcionario;
import com.exemplo.projetos.entity.Projeto;
import com.exemplo.projetos.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public Funcionario adicionar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public List<Projeto> buscarProjetos(Integer idFuncionario) {
        return funcionarioRepository.buscarProjetosPorFuncionario(idFuncionario);
    }
}
