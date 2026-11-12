package br.com.gerenciador.viacepconfig;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.gerenciador.dto.EnderecoResponse;

@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface ViaCep {
	
	@GetMapping("{cep}/json")
    EnderecoResponse buscaEnderecoPorCep(@PathVariable("cep") String cep);

}
