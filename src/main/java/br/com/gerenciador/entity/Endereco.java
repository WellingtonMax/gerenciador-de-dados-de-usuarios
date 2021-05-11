package br.com.gerenciador.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long idEndereco;

	@Column(nullable = false)
	private String numero;

	@Column(name = "complemento")
	private String complemento;

	@Column(nullable = false)
	private String bairro;

	@Column(nullable = false)
	private String estado;

	@Column(nullable = false)
	private String cep;
	
	//TODO adicionar logradouro
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
	@JsonIgnore
	private Usuario usuario;

	@Column(name = "id_usuario")
	private Long idUsuario;
		
	public Endereco(Long id, String numero, String complemento, String bairro, String estado, String cep) {
		this.idEndereco = id;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco(String numero, String complemento, String bairro, String estado, String cep) {
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco() {

	}

	public Long getId() {
		return idEndereco;
	}

	public void setId(Long id) {
		this.idEndereco = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	
}
