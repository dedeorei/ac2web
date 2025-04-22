package com.exemplo.projetos.controller;

import com.exemplo.projetos.dto.*;
import com.exemplo.projetos.entity.Funcionario;
import com.exemplo.projetos.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/funcionarios")
@RequiredArgsConstructor
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    @PostMapping
    public void adicionar(@RequestBody FuncionarioDTO dto) {
        funcionarioService.adicionar(dto.toEntity());
    }

    @GetMapping("/{id}/projetos")
    public List<DadosProjetoDTO> buscarProjetos(@PathVariable Integer id) {
        return funcionarioService.buscarProjetos(id).stream()
                .map(DadosProjetoDTO::from)
                .collect(Collectors.toList());
    }
}
