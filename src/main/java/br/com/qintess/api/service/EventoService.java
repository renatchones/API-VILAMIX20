package br.com.qintess.api.service;


import java.util.List;

import br.com.qintess.api.model.Evento;

public interface EventoService {
	
	void salvar(Evento evento);
	
	void editar(Evento evento);
	
	void excluir (Long id);
	
	Evento buscarPorId(Long id);
	
	List<Evento> buscarTodos();

	

	
	
	
}
