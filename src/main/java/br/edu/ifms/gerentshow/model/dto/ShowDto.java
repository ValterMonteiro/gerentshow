package br.edu.ifms.gerentshow.model.dto;

import java.util.UUID;

public class ShowDto {
	
	private UUID id;
	private String nome;
	private String local;
	
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
}
