package com.exemplo.projetos.controller;

import com.exemplo.projetos.dto.*;
import com.exemplo.projetos.entity.Projeto;
import com.exemplo.projetos.service.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/projetos")
@RequiredArgsConstructor
public class ProjetoController {
    private final ProjetoService projetoService;

    @PostMapping
    public void adicionar(@RequestBody ProjetoDTO projetoDTO) {
        projetoService.adicionar(projetoDTO.toEntity());
    }

    @GetMapping("/{id}")
    public DadosProjetoDTO buscarProjetoPorId(@PathVariable Integer id) {
        return DadosProjetoDTO.from(projetoService.buscarProjetoPorId(id));
    }

    @PostMapping("/{idProjeto}/vincular/{idFuncionario}")
    public void vincularFuncionario(@PathVariable Integer idProjeto, @PathVariable Integer idFuncionario) {
        projetoService.vincularFuncionario(idProjeto, idFuncionario);
    }
}
