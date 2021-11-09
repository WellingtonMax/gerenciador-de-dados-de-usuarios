package br.com.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciador.dto.EnderecoResponse;
import br.com.gerenciador.entity.Endereco;
import br.com.gerenciador.viacepconfig.ViaCep;

@RestController
public class CepController {

    @Autowired
    private ViaCep viaCep;

    @GetMapping("/{cep}")
    public ResponseEntity<EnderecoResponse> getCep(@PathVariable String cep) {

        EnderecoResponse endereco = viaCep.buscaEnderecoPorCep(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
    }

}