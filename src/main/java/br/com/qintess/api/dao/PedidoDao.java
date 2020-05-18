package br.com.qintess.api.dao;

import java.util.List;

import br.com.qintess.api.model.Evento;
import br.com.qintess.api.model.Pedido;

public interface PedidoDao {
	
	public void save(Pedido pedido);

	
	public void update(Pedido pedido); 
		
	
	public void delete(Long id); 
	
	Pedido findById(Long id);
	
	List<Pedido> findAll();
	
	
	
	
}
