package br.com.qintess.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.qintess.api.model.Evento;

@Repository
@Transactional
public interface EventoRepository extends JpaRepository<Evento, Long> {

	
	
}
