package br.com.andrenunes.sgp.services;

import br.com.andrenunes.sgp.domain.Cliente;
import br.com.andrenunes.sgp.exceptions.ObjectNotFoundException;
import br.com.andrenunes.sgp.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Cliente bucar(Integer id){
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Cliente não encontrada! Id: " + id +
                        ", Tipo: " + Cliente.class.getName())
        );
    }
}
