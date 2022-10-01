package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Funcion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Sala sala;

    @OneToMany(mappedBy = "funcion")
    private List<Entrada> entradas;

    @ManyToOne
    private Horario horario;

    @ManyToOne
    private Pelicula pelicula;

    @Builder
    public Funcion(Sala sala, Horario horario, Pelicula pelicula) {
        this.sala = sala;
        this.horario = horario;
        this.pelicula = pelicula;
    }
}
