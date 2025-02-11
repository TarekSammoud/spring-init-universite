package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.List;

@Entity
@Getter
@Setter
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer ;
    private String nomFoyer;
    private long capaciteFoyer;

   /* @OneToOne
    @JoinColumn(name = "idUniversite", nullable = false)
    private Universite associatedUniv ;*/

  /*  @OneToMany
    @JoinColumn(name = "idBloc", nullable = false)
    private List<Bloc> blocs;*/
}
