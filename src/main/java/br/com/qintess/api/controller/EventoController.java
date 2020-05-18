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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.api.model.CasaShow;
import br.com.qintess.api.model.Evento;
import br.com.qintess.api.repository.CasaShowRepository;
import br.com.qintess.api.repository.EventoRepository;
import br.com.qintess.api.service.CasaShowService;
import br.com.qintess.api.service.ItemPedidoService;

@RestController
@RequestMapping("/")
public class EventoController {
	
	@Autowired
	private EventoRepository repo;
	
	@Autowired
	private CasaShowService casaShow;
	
	@Autowired
	private ItemPedidoService serviceItem;
	
	
	@Autowired
	private CasaShowRepository repository;


	@PostMapping("/eventos")
	public void cadastro(@RequestBody Evento evento) {
		repo.save(evento);
	}

	@GetMapping("/eventos")
	public List<Evento> getEvento() {
		return repo.findAll();

	}

	@GetMapping("/eventos/{id}")
	public Evento listId(@PathVariable("id")Long id) {
		return repo.findById(id).get();
	}

	@PutMapping("/eventos/{id}")
	public void EditarEvento(@PathVariable("id") Long id, @RequestBody Evento evento){

		Optional<Evento> Evento = repo.findById(id);
		evento.setId(id);
		repo.save(evento);

	}

	@DeleteMapping("/eventos/{id}")
	public void RemoveEvento(@PathVariable("id") Long id) {
			repo.deleteById(id);		
		}
	}
	


