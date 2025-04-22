package com.exemplo.projetos.service;

import com.exemplo.projetos.entity.*;
import com.exemplo.projetos.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class ProjetoService {
    private final ProjetoRepository projetoRepository;
    private final FuncionarioRepository funcionarioRepository;

    public Projeto adicionar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public Projeto buscarProjetoPorId(Integer id) {
        return projetoRepository.buscarProjetoComFuncionarios(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));
    }

    public void vincularFuncionario(Integer idProjeto, Integer idFuncionario) {
        Projeto projeto = buscarProjetoPorId(idProjeto);
        Funcionario funcionario = funcionarioRepository.findById(idFuncionario)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
        projeto.getFuncionarios().add(funcionario);
        projetoRepository.save(projeto);
    }

    public List<Projeto> buscarPorDataInicioFim(LocalDate inicio, LocalDate fim) {
        return projetoRepository.findByDataInicioBetween(inicio, fim);
    }
}
