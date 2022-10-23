package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class SillaSala implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Silla silla;

    @OneToMany(mappedBy = "sillaSala")
    private List<Entrada> entradas;

    @Builder
    public SillaSala(Sala sala, Silla silla) {
        this.sala = sala;
        this.silla = silla;
    }
}
