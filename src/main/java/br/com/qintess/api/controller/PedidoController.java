package br.com.qintess.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.api.model.Evento;
import br.com.qintess.api.model.Pedido;
import br.com.qintess.api.repository.EventoRepository;
import br.com.qintess.api.repository.PedidoRepository;
import br.com.qintess.api.repository.UsuarioRepository;

@RestController
public class PedidoController {

	@Autowired
	private PedidoRepository repo;
	
	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private EventoRepository eventorepo;
	
	
	
	@PostMapping("/pedidos")
	public void cadastro(@RequestBody Pedido pedido, Evento evento)throws Exception {
		if (pedido.getQuantidade() > 4) {
			throw new Exception("Quantidade Maxima de ingresso limitada a 4 por pessoa");
			
		} else {
			evento = eventorepo.findById(pedido.getEvento().getId()).get();
			evento.setIngressos(evento.getIngressos() - pedido.getQuantidade());
			repo.save(pedido);
			
		}
		
	}
		
	
	@GetMapping("/pedidos")
	public List<Pedido> getPedido() {
		return (List<Pedido>) repo.findAll();
		
	}
	
	@GetMapping("/pedidos/{id}")
    public Pedido listId(@PathVariable("id")Long id) {
        return repo.findById(id).get();
    }
	
	@PutMapping("/pedidos/{id}")
	public void EditarUsuario(@PathVariable("id") Long id, @RequestBody Pedido pedido){
		
		Optional<Pedido> Pedido = repo.findById(id);
		pedido.setId(id);
		repo.save(pedido);
		
	}
	
	@DeleteMapping("/pedidos/{id}")
	public void RemovePedido(@PathVariable("id") Long id) {
		repo.deleteById(id);		
	}

	
	

}