package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Cliente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer cedula;

    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "fechaNacimiento", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaNacimiento;

    @Column(name="estado", length = 1, nullable = false)
    private String estado;

    @Column(name="email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name="password", length = 50, nullable = false)
    private String password;

    @Column(name = "fechaRegistro", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaRegistro;

    @Column(name = "imagen", nullable = false)
    private String imagen;

    @ElementCollection
    private List<String> telefonos;

    @Builder
    public Cliente (Integer cedula, String nombre, LocalDateTime fechaNacimiento, String email, String password,
                    Ciudad ciudad, String imagen, List<String> telefonos){
        this.cedula= cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = "I";
        this.email = email;
        this.password = password;
        this.fechaRegistro = LocalDateTime.now();
        this.ciudad = ciudad;
        this.imagen = imagen;
        this.telefonos = telefonos;
    }

    @ManyToOne
    private Ciudad ciudad;

    @OneToOne(mappedBy = "cliente")
    private Tarjeta tarjeta;

    @OneToMany(mappedBy = "cliente")
    List<Factura> facturas;

    @OneToMany(mappedBy = "cliente")
    List<Cupon> cupones;
}
