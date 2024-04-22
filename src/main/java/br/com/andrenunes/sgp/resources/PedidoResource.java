package br.com.andrenunes.sgp.resources;

import br.com.andrenunes.sgp.domain.Cliente;
import br.com.andrenunes.sgp.domain.Pedido;
import br.com.andrenunes.sgp.services.ClienteService;
import br.com.andrenunes.sgp.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
    private final PedidoService pedidoService;

    @Autowired
    public PedidoResource(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    @GetMapping()
    public List<Pedido> listar(){
        return pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarId(@PathVariable Integer id){
        Pedido obj = pedidoService.bucar(id);
        return ResponseEntity.ok().body(obj);
    }
}
