package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.List;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin ;
    private String ecole;
    private Date dateNaissance;

    /*@ManyToMany
    @JoinColumn(name = "idReservation", nullable = false)
    private List<Reservation> reservations;*/

}
