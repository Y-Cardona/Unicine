package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Cupon implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="dcto", columnDefinition = "int default 0", nullable = false)
    private Integer dcto;

    @Column(name="vencimiento", nullable = false)
    private LocalDate vencimiento;

    @Column(name="estado", length = 1, nullable = false)
    private String estado;

    @Enumerated(EnumType.STRING)
    @Column(name="criterio", nullable = false)
    private Criterio criterio;

    @ManyToOne
    private Cliente cliente;

    @OneToOne(mappedBy = "cupon")
    private Factura factura;

    @Builder
    public Cupon (Integer dcto, LocalDate vencimiento, Criterio criterio, Cliente cliente){
        this.dcto = dcto;
        this.vencimiento = vencimiento;
        this.estado = "A";
        this.criterio = criterio;
        this.cliente = cliente;
    }
}
