package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.Ciudad;
import co.edu.uniquindio.proyecto.repositorios.CiudadRepo;
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
public class CiudadTest {

    @Autowired
    private CiudadRepo ciudadRepo;

    @Test
    @Sql("classpath:dataset.sql")
    public void registrar(){
        Ciudad ciudad = new Ciudad("Manizales");
        Ciudad guardado = ciudadRepo.save(ciudad);
        Assertions.assertNotNull(guardado);
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void eliminar(){
        Ciudad buscado = ciudadRepo.findById(4).orElse(null);
        ciudadRepo.delete(buscado);
        Assertions.assertNull(ciudadRepo.findById(4).orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void actualizar(){
        Ciudad buscado = ciudadRepo.findById(2).orElse(null);
        buscado.setNombre("Barranquilla");
        Ciudad nuevo = ciudadRepo.save(buscado);
        Assertions.assertEquals("Barranquilla", nuevo.getNombre());
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void obtener(){
        Optional<Ciudad> buscado = ciudadRepo.findById(1);
        Assertions.assertNotNull(buscado.orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listar(){
        List<Ciudad> lista = ciudadRepo.findAll();
        lista.forEach(System.out::println);
    }
}
