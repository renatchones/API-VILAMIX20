package br.com.qintess.api.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.qintess.api.model.ItemPedido;

@Repository
@Transactional
public interface ItemPedidoRepository extends CrudRepository<ItemPedido, Long> {

	
	
}
