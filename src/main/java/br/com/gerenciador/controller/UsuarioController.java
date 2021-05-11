package br.com.gerenciador.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciador.entity.Usuario;
import br.com.gerenciador.service.UsuarioService;

@RestController
@RequestMapping("/gerenciador")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/{id}")
	public Optional<Usuario> buscaUsuarioPorId(@PathVariable Long id) {
		return this.usuarioService.buscaUsuario(id);
	}

	@PostMapping
	public Usuario insereUsuario(@RequestBody Usuario usuario) {
		return this.usuarioService.criaUsuario(usuario);
	}

}
