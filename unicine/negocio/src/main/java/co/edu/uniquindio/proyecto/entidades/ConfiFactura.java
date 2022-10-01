package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
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

    @ManyToOne
    private Confiteria confiteria;

    @ManyToOne
    private Factura factura;

    @Builder
    public ConfiFactura (Integer cantidad, Integer precio, Confiteria confiteria,
                         Factura factura){
        this.cantidad = cantidad;
        this.precio = precio;
        this.factura = factura;
        this.confiteria = confiteria;
    }

}
