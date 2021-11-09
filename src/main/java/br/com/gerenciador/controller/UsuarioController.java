package br.com.gerenciador.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciador.entity.Usuario;
import br.com.gerenciador.service.interfaces.UsuarioService;

@RestController
@RequestMapping("/gerenciador")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Usuario>> buscaUsuarioPorId(@PathVariable Long id) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscaUsuario(id));
	}

	@PostMapping
	public ResponseEntity<Usuario> insereUsuario(@RequestBody Usuario usuario) throws Exception {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.criaUsuario(usuario));
	}
	

}
