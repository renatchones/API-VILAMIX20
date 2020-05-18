package br.com.qintess.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.qintess.api.model.Pedido;

@Repository
@Transactional
public interface PedidoRepository extends CrudRepository<Pedido, Long> {

	
	
}
