package br.com.andrenunes.sgp.resources;

import br.com.andrenunes.sgp.domain.Categoria;
import br.com.andrenunes.sgp.domain.Cliente;
import br.com.andrenunes.sgp.services.CategoriaService;
import br.com.andrenunes.sgp.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
    private final ClienteService clienteService;

    @Autowired
    public ClienteResource(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping()
    public List<Cliente> listar(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable Integer id){
        Cliente obj = clienteService.bucar(id);
        return ResponseEntity.ok().body(obj);
    }
}
