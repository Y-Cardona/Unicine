package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Pelilcula implements Serializable {

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
}
