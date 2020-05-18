package br.com.qintess.api.service;
import java.util.List;

import br.com.qintess.api.model.Usuario;


public interface UsuarioService {

	
	void salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir (Long id);
	
	Usuario buscarPorId(Long id);
	
	List<Usuario> buscarTodos();





	
	
}
