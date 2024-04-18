package br.com.andrenunes.sgp.services;

import br.com.andrenunes.sgp.domain.Categoria;
import br.com.andrenunes.sgp.exceptions.ObjectNotFoundException;
import br.com.andrenunes.sgp.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria bucar(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Categoria não encontrada! Id: " + id +
                        ", Tipo: " + Categoria.class.getName())
        );
    }
}
