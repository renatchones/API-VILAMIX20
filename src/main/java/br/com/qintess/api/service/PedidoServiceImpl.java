package br.com.qintess.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qintess.api.dao.PedidoDao;
import br.com.qintess.api.model.Pedido;


@Service
@Transactional(readOnly = false)
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoDao dao; 
	
	
	@Override 
	public void salvar( Pedido pedido) {
		dao.save(pedido);
		
	}

	@Override
	public void editar(Pedido pedido) {
		dao.update(pedido);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Pedido buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Pedido> buscarTodos() {
		
		return dao.findAll();
	}


	
}
