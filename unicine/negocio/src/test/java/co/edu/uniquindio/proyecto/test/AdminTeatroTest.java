package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.AdminTeatro;
import co.edu.uniquindio.proyecto.repositorios.AdminTeatroRepo;
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
public class AdminTeatroTest {

    @Autowired
    private AdminTeatroRepo adminTeatroRepo;

    @Test
    @Sql("classpath:dataset.sql")
    public void registrar(){
        AdminTeatro admin = new AdminTeatro("admint6@gmail.com", "1332");
        AdminTeatro guardado = adminTeatroRepo.save(admin);
        Assertions.assertNotNull(guardado);
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void eliminar(){
        AdminTeatro buscado = adminTeatroRepo.findById(4).orElse(null);
        adminTeatroRepo.delete(buscado);
        Assertions.assertNull(adminTeatroRepo.findById(4).orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void actualizar(){
        AdminTeatro buscado = adminTeatroRepo.findById(2).orElse(null);
        buscado.setEmail("carlos_nuevo@email.com");
        AdminTeatro nuevo = adminTeatroRepo.save(buscado);
        Assertions.assertEquals("carlos_nuevo@email.com", nuevo.getEmail());
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void obtener(){
        Optional<AdminTeatro> buscado = adminTeatroRepo.findById(1);
        Assertions.assertNotNull(buscado.orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listar(){
        List<AdminTeatro> lista = adminTeatroRepo.findAll();
        lista.forEach(System.out::println);
    }
}
