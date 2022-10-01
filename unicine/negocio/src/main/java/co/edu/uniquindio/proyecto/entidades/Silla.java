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
public class Silla implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fila", columnDefinition = "int default 0", nullable = false)
    private Integer fila;

    @Column(name = "numSilla", columnDefinition = "int default 0", nullable = false)
    private Integer numSilla;

    @OneToMany(mappedBy = "silla")
    private List<SillaSala> distribucion;

    @Builder
    public Silla(Integer fila, Integer numSilla) {
        this.fila = fila;
        this.numSilla = numSilla;
    }
}
