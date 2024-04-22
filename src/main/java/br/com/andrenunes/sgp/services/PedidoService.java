package br.com.andrenunes.sgp.services;

import br.com.andrenunes.sgp.domain.Cliente;
import br.com.andrenunes.sgp.domain.Pedido;
import br.com.andrenunes.sgp.exceptions.ObjectNotFoundException;
import br.com.andrenunes.sgp.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> findAll(){
        return repository.findAll();
    }

    public Pedido bucar(Integer id){
        Optional<Pedido> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Pedido não encontrada! Id: " + id +
                        ", Tipo: " + Pedido.class.getName())
        );
    }
}
