package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.List;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date anneeUniversitaire ;
    private boolean estValide;

 /*   @ManyToOne
    @JoinColumn(name = "idChambre", nullable = false)
    private Chambre chambre;

    @ManyToMany
    @JoinColumn(name = "idEtudiant", nullable = false)
    private List<Etudiant> etudiants;*/


}
