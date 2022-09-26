package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
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
}
