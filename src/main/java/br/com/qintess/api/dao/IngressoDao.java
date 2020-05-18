package br.com.qintess.api.dao;
import java.util.List;

import br.com.qintess.api.model.Evento;

public interface IngressoDao {
	
	public void save(Evento evento);

	
	public void update(Evento evento); 
		
	
	public void delete(Long id); 
	
	Evento findById(Long id);
	
	List<Evento> findAll();
	
	
	
	
}
