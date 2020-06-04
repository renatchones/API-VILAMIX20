package br.com.qintess.api.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.api.model.CasaShow;
import br.com.qintess.api.repository.CasaShowRepository;


;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200")
public class CasaShowController {

	@Autowired
	private CasaShowRepository repo;


	@PostMapping("/casas")
	public void cadastro(@RequestBody CasaShow casaShow) {
		repo.save(casaShow);
	}

	@GetMapping("/casas")
	public List<CasaShow> getCasaShow() {
		return repo.findAll();

	}

	@GetMapping("/casas/{id}")
	public CasaShow listId(@PathVariable("id")Long id) {
		return repo.findById(id).get();
	}

	@PutMapping("/casas/{id}")
	public void EditarCasaShow(@PathVariable("id") Long id, @RequestBody CasaShow casaShow){

		Optional<CasaShow> CasaShow = repo.findById(id);
		casaShow.setId(id);
		repo.save(casaShow);

	}

	@DeleteMapping("/casas/{id}")
	public void RemoveCasaShow(@PathVariable("id") Long id, CasaShow casaShow) throws Exception {
		casaShow = repo.findById(id).get();
		if(!casaShow.getEventos().isEmpty()) {
			throw new Exception ("Casa tem eventos vinculados");
		}else {
			repo.deleteById(id);		
		}
	}

	









}
