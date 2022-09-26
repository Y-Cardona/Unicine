package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Factura implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "precioTotal", columnDefinition = "int default 0", nullable = false)
    private Integer precioTotal;

    @Column(name = "qr", nullable = false)
    private String qr;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

}
