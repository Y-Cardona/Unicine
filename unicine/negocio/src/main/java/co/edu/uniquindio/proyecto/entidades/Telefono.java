package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Telefono implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero", length = 10, nullable = false)
    private String numero;

    @ManyToOne
    private Cliente cliente;

    @Builder
    public Telefono(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }
}
