package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Confiteria implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="precio", columnDefinition = "int default 0", nullable = false)
    private Integer precio;

    @Column(name="nombre", length = 50, nullable = false, unique = true)
    private String nombre;

    @OneToMany(mappedBy = "confiteria")
    private List<ConfiFactura> confiFacturaList;

    @Column(name = "imagen", nullable = false)
    private String imagen;

    @Builder
    public Confiteria(String nombre, Integer precio, String imagen){
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

}
