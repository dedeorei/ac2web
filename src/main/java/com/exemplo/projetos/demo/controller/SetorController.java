package com.exemplo.projetos.controller;

import com.exemplo.projetos.dto.*;
import com.exemplo.projetos.service.SetorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setores")
@RequiredArgsConstructor
public class SetorController {
    private final SetorService setorService;

    @PostMapping
    public void adicionar(@RequestBody SetorDTO dto) {
        setorService.adicionar(dto.toEntity());
    }

    @GetMapping("/{id}")
    public DadosSetorDTO buscarPorId(@PathVariable Integer id) {
        return DadosSetorDTO.from(setorService.buscarPorId(id).orElseThrow());
    }
}
