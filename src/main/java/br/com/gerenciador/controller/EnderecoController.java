package br.com.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void insereEnderecoUsuario(@RequestBody Endereco endereco, Long idUsuario) {
	enderecoService.insereEndereco(endereco);	
		
	}

}
