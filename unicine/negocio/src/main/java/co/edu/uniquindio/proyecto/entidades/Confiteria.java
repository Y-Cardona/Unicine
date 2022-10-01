package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
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

    @OneToOne
    private Imagen imagen;

    @Builder
    public Confiteria(String nombre, Integer precio, Imagen imagen){
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

}
