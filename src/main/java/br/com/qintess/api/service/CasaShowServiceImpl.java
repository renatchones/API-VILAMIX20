package br.com.qintess.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qintess.api.dao.CasaShowDao;
import br.com.qintess.api.model.CasaShow;


@Service
@Transactional(readOnly = false)
public class CasaShowServiceImpl implements CasaShowService {

	@Autowired
	private CasaShowDao dao; 
	
	
	@Override 
	public void salvar(CasaShow casaShow) {
		dao.save(casaShow);
		
	}

	@Override
	public void editar(CasaShow casaShow) {
		dao.update(casaShow);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public CasaShow buscarPorId(Long id) {
		
		return dao.findById(id);
	}	

	@Override @Transactional(readOnly = true)
	public List<CasaShow> buscarTodos() {
		
		return dao.findAll();
	}

	@Override
	public boolean casaShowTemEventos(Long id) {
		if (buscarPorId(id).getEventos().isEmpty()) {
			return false;
		}
		return true;
	}


	

	
}
