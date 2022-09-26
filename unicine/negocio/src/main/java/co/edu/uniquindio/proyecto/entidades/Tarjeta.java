package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Tarjeta implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "vigencia", nullable = false)
    private LocalDate vigencia;

    @Column(name = "estado", length = 1, nullable = false)
    private String estado;

    @Column(name = "porcentaje", columnDefinition = "int default 5", nullable = false)
    private Integer porcentaje;
}
