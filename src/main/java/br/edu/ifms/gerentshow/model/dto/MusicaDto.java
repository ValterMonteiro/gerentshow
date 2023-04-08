package br.edu.ifms.gerentshow.model.dto;

import java.util.UUID;

public class MusicaDto {

	private UUID id;
	private String nome;
	private String Autor;
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
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	
}
