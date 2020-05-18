package br.com.qintess.api.service;
import java.util.List;

import br.com.qintess.api.model.Pedido;


public interface PedidoService {

	
	void salvar(Pedido pedido);
	
	void editar(Pedido pedido);
	
	void excluir (Long id);
	
	Pedido buscarPorId(Long id);
	
	List<Pedido> buscarTodos();





	
	
}
