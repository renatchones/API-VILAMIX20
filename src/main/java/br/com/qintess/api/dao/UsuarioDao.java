package br.com.qintess.api.dao;

import java.util.List;

import br.com.qintess.api.model.Usuario;

public interface UsuarioDao {
	
	public void save(Usuario usuario);

	
	public void update(Usuario usuario); 
		
	
	public void delete(Long id); 
	
	Usuario findById(Long id);
	
	List<Usuario> findAll();
	
	
	
	
}
