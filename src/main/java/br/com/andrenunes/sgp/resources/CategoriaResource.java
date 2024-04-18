package br.com.andrenunes.sgp.resources;

import br.com.andrenunes.sgp.domain.Categoria;
import br.com.andrenunes.sgp.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaResource(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @GetMapping()
    public List<Categoria> listar(){

        Categoria cat = new Categoria(1, "Informática");
        Categoria catTwo = new Categoria(2, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat);
        lista.add(catTwo);

        return lista;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable Integer id){
        Categoria obj = categoriaService.bucar(id);
        return ResponseEntity.ok().body(obj);
    }
}
