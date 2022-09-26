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
public class ConfiFactura implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="cantidad", columnDefinition = "int default 0", nullable = false)
    private Integer cantidad;

    @Column(name="precio", columnDefinition = "int default 0", nullable = false)
    private Integer precio;

}
