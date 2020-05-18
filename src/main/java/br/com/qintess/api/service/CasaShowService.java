package br.com.qintess.api.service;




import java.util.List;

import br.com.qintess.api.model.CasaShow;

public interface CasaShowService {
	
	void salvar(CasaShow casaShow);
	
	void editar(CasaShow casaShow);
	
	void excluir (Long id);
	
	CasaShow buscarPorId(Long id);
	
	List<CasaShow> buscarTodos();

	boolean casaShowTemEventos(Long id);


	
	
	
}
