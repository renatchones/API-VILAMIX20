package br.com.qintess.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.qintess.api.model.CasaShow;

@Repository
public interface CasaShowRepository extends JpaRepository<CasaShow, Long> {

	
	
}
