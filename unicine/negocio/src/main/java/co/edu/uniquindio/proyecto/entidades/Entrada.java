package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Entrada implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private SillaSala sillaSala;

    @ManyToOne
    private Funcion funcion;

    @ManyToOne
    private Factura factura;

    @Builder
    public Entrada(SillaSala sillaSala, Funcion funcion, Factura factura) {
        this.sillaSala = sillaSala;
        this.funcion = funcion;
        this.factura = factura;
    }
}
