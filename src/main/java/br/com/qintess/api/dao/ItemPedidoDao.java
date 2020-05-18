package br.com.qintess.api.dao;

import java.util.List;

import br.com.qintess.api.model.ItemPedido;

public interface ItemPedidoDao {
	
	public void save(ItemPedido itemPedido);

	
	public void update(ItemPedido itemPedido); 
		
	
	public void delete(Long id); 
	
	ItemPedido findById(Long id);
	
	List<ItemPedido> findAll();
	
	
	
	
}
