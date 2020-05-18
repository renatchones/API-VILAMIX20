package br.com.qintess.api.service;


import java.util.List;

import br.com.qintess.api.model.ItemPedido;

public interface ItemPedidoService {
	
	void salvar(ItemPedido itemPedido);
	
	void editar(ItemPedido itemPedido);
	
	void excluir (Long id);
	
	ItemPedido buscarPorId(Long id);
	
	List<ItemPedido> buscarTodos();

	

	
	
	
}
