package br.com.gerenciador.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciador.entity.Usuario;
import br.com.gerenciador.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario criaUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> buscaUsuario(Long id) {

		return usuarioRepository.findById(id);

	}

}
