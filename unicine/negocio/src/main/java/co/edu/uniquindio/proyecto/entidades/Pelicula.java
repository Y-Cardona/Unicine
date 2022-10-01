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
public class Pelicula implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "trailer", nullable = false)
    private String trailer;

    @Column(name = "sinopsis", nullable = false)
    private String sinopsis;

    @Column(name = "estado", length = 10, nullable = false)
    private String estado;

    @Column(name = "reparto", length = 255, nullable = false)
    private String reparto;

    @ElementCollection
    private List<Genero> generos;

    @OneToMany(mappedBy = "pelicula")
    private List<Funcion> funciones;

    @OneToOne
    private Imagen imagen;

    @Builder
    public Pelicula(String nombre, String trailer, String sinopsis, String estado, String reparto,
                    List<Genero> generos, Imagen imagen) {
        this.nombre = nombre;
        this.trailer = trailer;
        this.sinopsis = sinopsis;
        this.estado = estado;
        this.reparto = reparto;
        this.generos = generos;
        this.imagen = imagen;
    }
}
