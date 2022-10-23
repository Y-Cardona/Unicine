package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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

    @OneToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "tarjeta")
    private List<Factura> facturas;

    @Builder
    public Tarjeta(LocalDate vigencia, String estado, Integer porcentaje, Cliente cliente) {
        this.vigencia = vigencia;
        this.estado = estado;
        this.porcentaje = porcentaje;
        this.cliente = cliente;
    }
}
