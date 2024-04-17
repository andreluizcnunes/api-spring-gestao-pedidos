package br.com.andrenunes.sgp.resources;

import br.com.andrenunes.sgp.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping()
    public List<Categoria> listar(){

        Categoria cat = new Categoria(1, "Informática");
        Categoria catTwo = new Categoria(2, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat);
        lista.add(catTwo);

        return lista;
    }
}
