package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cliente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String cedula;

    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name="estado", length = 1, nullable = false)
    private String estado;

    @Column(name="email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name="password", length = 50, nullable = false)
    private String password;

    @Column(name = "fechaRegistro", nullable = false)
    private LocalDate fechaRegistro;

    @Builder
    public Cliente (String nombre, LocalDate fechaNacimiento, String email, String password,
                    Ciudad ciudad, Imagen imagen){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = "I";
        this.email = email;
        this.password = password;
        this.fechaRegistro = LocalDate.now();
        this.ciudad = ciudad;
        this.imagen = imagen;
    }

    @OneToMany(mappedBy = "cliente")
    private List<Telefono> telefonos;

    @ManyToOne
    private Ciudad ciudad;

    @OneToOne(mappedBy = "cliente")
    private Tarjeta tarjeta;

    @OneToOne
    private Imagen imagen;

    @OneToMany(mappedBy = "cliente")
    List<Factura> facturas;

    @OneToMany(mappedBy = "cliente")
    List<Cupon> cupones;
}
