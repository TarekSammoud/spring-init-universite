package com.example.demo.entities;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.mapping.List;

@Entity
        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;



}
