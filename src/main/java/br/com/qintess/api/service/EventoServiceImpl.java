package br.com.qintess.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qintess.api.dao.EventoDao;
import br.com.qintess.api.model.Evento;


@Service
@Transactional(readOnly = false)
public class EventoServiceImpl implements EventoService {

	@Autowired
	private EventoDao dao; 
	
	
	@Override 
	public void salvar( Evento evento) {
		dao.save(evento);
		
	}

	@Override
	public void editar(Evento evento) {
		dao.update(evento);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Evento buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Evento> buscarTodos() {
		
		return dao.findAll();
	}


	
	

	
}
