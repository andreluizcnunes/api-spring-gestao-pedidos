package br.com.andrenunes.sgp.services;

import br.com.andrenunes.sgp.domain.Categoria;
import br.com.andrenunes.sgp.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Optional<Categoria> bucar(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj;
    }
}
