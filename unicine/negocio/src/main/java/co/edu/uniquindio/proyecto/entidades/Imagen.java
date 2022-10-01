package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Imagen implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ruta", nullable = false)
    private String ruta;

    @OneToOne(mappedBy = "imagen")
    private Cliente cliente;

    @OneToOne(mappedBy = "imagen")
    private Confiteria confiteria;

    @OneToOne(mappedBy = "imagen")
    private Pelicula pelicula;

    @Builder
    public Imagen(String ruta, Cliente cliente, Confiteria confiteria, Pelicula pelicula) {
        this.ruta = ruta;
        this.cliente = cliente;
        this.confiteria = confiteria;
        this.pelicula = pelicula;
    }

    @Builder
    public Imagen(String ruta, Cliente cliente) {
        this.ruta = ruta;
        this.cliente = cliente;
    }

    @Builder
    public Imagen(String ruta, Confiteria confiteria) {
        this.ruta = ruta;
        this.confiteria = confiteria;
    }

    @Builder
    public Imagen(String ruta, Pelicula pelicula) {
        this.ruta = ruta;
        this.pelicula = pelicula;
    }
}
