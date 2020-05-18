package br.com.qintess.api.dao;

import java.util.List;

import br.com.qintess.api.model.CasaShow;


public interface CasaShowDao {
	
	public void save(CasaShow casaShow);

	
	public void update(CasaShow casaShow); 
		
	
	public void delete(Long id); 
	
	CasaShow findById(Long id);
	
	List<CasaShow> findAll();
	
	
	
	
}
