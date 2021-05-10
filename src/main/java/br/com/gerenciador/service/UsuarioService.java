package br.com.gerenciador.service;

import java.util.Optional;

import br.com.gerenciador.entity.Usuario;

public interface UsuarioService {
	
	Usuario criaUsuario(Usuario usuario);
	
	Optional<Usuario> buscaUsuario(Long id);
	
}
