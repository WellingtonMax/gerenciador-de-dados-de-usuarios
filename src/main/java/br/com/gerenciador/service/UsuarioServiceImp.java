package br.com.gerenciador.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciador.entity.Usuario;
import br.com.gerenciador.repository.UsuarioRepository;
import br.com.gerenciador.service.interfaces.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {

	public static final String MENSAGEM = "OPS! NÃO FOI POSSIVEL FAZER SEU REGISTRO: CPF OU EMAIL JÁ ESTÁ CADASTRADO!";
	public static final String MENSAGEMUSUARIO = "OPS! NÃO FOI POSSIVEL FAZER A SUA BUSCA: USUÁRIO NÃO ENCONTRADO!";

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario criaUsuario(Usuario usuario) throws Exception {

		if (!this.verificaSeUsuarioExiste(usuario.getCpf(), usuario.getEmail())) {

			throw new Exception(MENSAGEM);
		}
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> buscaUsuario(Long id) throws Exception {
		Optional<Usuario> usuarioBuscado = usuarioRepository.findById(id);
		if (!usuarioBuscado.isPresent()) {

			throw new Exception(MENSAGEMUSUARIO);

		}
		return usuarioBuscado;

	}

	public boolean verificaSeUsuarioExiste(String cpf, String email) {
		Usuario usuarioBuscado = usuarioRepository.findByCpfOrEmail(cpf, email);
		if (usuarioBuscado == null) {
			return true;
		}

		return false;
	}
}
