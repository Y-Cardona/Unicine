package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Administrador;
import co.edu.uniquindio.proyecto.repositorios.AdministradorRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AdministradorTest {

    @Autowired
    private AdministradorRepo administradorRepo;

    @Test
    @Sql("classpath:dataset.sql")
    public void registrar(){
        Administrador admin = new Administrador(6,"admin6@gmail.com", "1332");
        Administrador guardado = administradorRepo.save(admin);
        Assertions.assertNotNull(guardado);
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void eliminar(){
        Administrador buscado = administradorRepo.findById(4).orElse(null);
        administradorRepo.delete(buscado);
        Assertions.assertNull(administradorRepo.findById(4).orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void actualizar(){
        Administrador buscado = administradorRepo.findById(2).orElse(null);
        buscado.setEmail("carlos_nuevo@email.com");
        Administrador nuevo = administradorRepo.save(buscado);
        Assertions.assertEquals("carlos_nuevo@email.com", nuevo.getEmail());
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void obtener(){
        Optional<Administrador> buscado = administradorRepo.findById(1);
        Assertions.assertNotNull(buscado.orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listar(){
        List<Administrador> lista = administradorRepo.findAll();
        lista.forEach(System.out::println);
    }
}
