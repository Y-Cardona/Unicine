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
public class Sala implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 90, nullable = false)
    private String nombre;

    @Column(name = "cantFilas", columnDefinition = "int default 0", nullable = false)
    private Integer cantFilas;

    @Column(name = "cantSillas", columnDefinition = "int default 0", nullable = false)
    private Integer cantSillas;

    @ManyToOne
    private Teatro teatro;

    @OneToMany(mappedBy = "sala")
    private List<SillaSala> distribucion;

    @OneToMany(mappedBy = "sala")
    private List<Funcion> funciones;

    @Builder
    public Sala(String nombre, Integer cantFilas, Integer cantSillas, Teatro teatro) {
        this.nombre = nombre;
        this.cantFilas = cantFilas;
        this.cantSillas = cantSillas;
        this.teatro = teatro;
    }
}
