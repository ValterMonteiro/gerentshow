package br.edu.ifms.gerentshow.controller.dto;

import java.util.UUID;

public class MusicaResponse {

	private String nome;
	private String autor;	
	private UUID id;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	
	
}
