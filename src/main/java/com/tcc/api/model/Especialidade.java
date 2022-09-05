package com.tcc.api.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_especialidades")
public class Especialidade {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String campus;
    private String icon;
    private String color;


    @ManyToMany(mappedBy = "especialidades")
    private Set<Faculdade> faculdades = new HashSet<>();



}
