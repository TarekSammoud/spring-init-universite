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
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private typeC TypeChambre;

  /* @ManyToOne
    @JoinColumn(name = "idBloc", nullable = false)
    private Bloc bloc;*/

   /* @OneToMany
    @JoinColumn(name = "idReservation", nullable = false)
    private List<Reservation> reservations;*/
}
