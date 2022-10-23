package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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

    @Column(name = "fecha", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha;

    @ManyToOne
    private Tarjeta tarjeta;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "factura")
    private List<ConfiFactura> confiFacturaList;

    @OneToMany(mappedBy = "factura")
    private List<Entrada> entradas;

    @OneToOne
    private Cupon cupon;

    @Builder
    public Factura(Integer precioTotal, String qr, Tarjeta tarjeta,
                   Cliente cliente, Cupon cupon) {
        this.precioTotal = precioTotal;
        this.qr = qr;
        this.fecha = LocalDateTime.now();
        this.tarjeta = tarjeta;
        this.cliente = cliente;
        this.cupon = cupon;
    }
}
