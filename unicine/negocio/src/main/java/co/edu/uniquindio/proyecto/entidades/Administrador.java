package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Administrador implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name="password", length = 50, nullable = false)
    private String password;

    @Builder
    public Administrador (String email, String password){
        this.email = email;
        this.password = password;
    }
}
