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

import br.com.qintess.api.model.Usuario;
import br.com.qintess.api.repository.UsuarioRepository;



@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repo;
	
	
	@PostMapping("/usuarios")
	public void cadastro(@RequestBody Usuario usuario) {
		repo.save(usuario);
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuario() {
		return repo.findAll();
		
	}
	
	@GetMapping("/usuarios/{id}")
    public Usuario listId(@PathVariable("id")Long id) {
        return repo.findById(id).get();
    }
	
	@PutMapping("/usuarios/{id}")
	public void EditarUsuario(@PathVariable("id") Long id, @RequestBody Usuario usuario){
		
		Optional<Usuario> Usuario = repo.findById(id);
		usuario.setId(id);
		repo.save(usuario);
		
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void RemoveUsuario(@PathVariable("id") Long id) {
		repo.deleteById(id);		
	}

	
	
}
