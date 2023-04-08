package br.edu.ifms.gerentshow.model.dto;

import java.util.UUID;

public class InstrumentoDto {
	
	private UUID id;
	private String nome;
	private String especificacao;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
	
}
