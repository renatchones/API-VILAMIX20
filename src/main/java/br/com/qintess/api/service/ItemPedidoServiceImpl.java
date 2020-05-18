package br.com.qintess.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qintess.api.dao.ItemPedidoDao;
import br.com.qintess.api.model.ItemPedido;


@Service
@Transactional(readOnly = false)
public class ItemPedidoServiceImpl implements ItemPedidoService {

	@Autowired
	private ItemPedidoDao dao; 
	
	
	@Override 
	public void salvar( ItemPedido itemPedido) {
		dao.save(itemPedido);
		
	}

	@Override
	public void editar(ItemPedido itemPedido) {
		dao.update(itemPedido);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public ItemPedido buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<ItemPedido> buscarTodos() {
		
		return dao.findAll();
	}


	
	

	
}
