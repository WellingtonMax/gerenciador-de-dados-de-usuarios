package br.com.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciador.entity.Endereco;
import br.com.gerenciador.service.EnderecoService;

@RestController
@RequestMapping("/adicao")
public class EnderecoController {

	@Autowired
	EnderecoService enderecoService;

	@PostMapping
	public ResponseEntity<Endereco> insereEnderecoUsuario(@RequestBody Endereco endereco) {
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.insereEndereco(endereco));

	}

}
