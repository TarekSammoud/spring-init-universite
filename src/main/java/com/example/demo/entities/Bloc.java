package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc ;
    private String nomBloc;
    private long capaciteBloc;

   /* @ManyToOne
    @JoinColumn(name = "idFoyer", nullable = false)
    private Foyer foyer;*/

   /* @OneToMany
    @JoinColumn(name = "idChambre", nullable = false)
    private List<Chambre> chambres;*/


}
