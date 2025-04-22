package com.exemplo.projetos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;

    @ManyToMany(mappedBy = "funcionarios")
    private List<Projeto> projetos;
}
