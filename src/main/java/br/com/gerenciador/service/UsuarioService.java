package br.com.gerenciador.service;

import java.util.Optional;

import br.com.gerenciador.entity.Usuario;

public interface UsuarioService {
	
	Usuario criaUsuario(Usuario usuario) throws Exception;
	
	Optional<Usuario> buscaUsuario(Long id) throws Exception;
	
}
