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
public class Sala implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 90, nullable = false)
    private String nombre;

    @Column(name = "cantFilas", columnDefinition = "int default 0", nullable = false)
    private Integer cantFilas;

    @Column(name = "cantSillas", columnDefinition = "int default 0", nullable = false)
    private Integer cantSillas;
}
