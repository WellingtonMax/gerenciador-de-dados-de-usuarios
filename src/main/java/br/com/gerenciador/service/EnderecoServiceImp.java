package br.com.gerenciador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciador.entity.Endereco;
import br.com.gerenciador.repository.EnderecoRepository;

@Service
public class EnderecoServiceImp implements EnderecoService {

	@Autowired
	EnderecoRepository enderecoRepository;

	@Override
	public Endereco insereEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

}
