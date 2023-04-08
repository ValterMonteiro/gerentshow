package br.edu.ifms.gerentshow.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class MusicaRequest {

	@NotBlank
	@Size(max = 80, message = "Informe o nome")
	private String nome;
	
	@NotBlank
	@Size(max = 80, message = "Informe o autor")
	private String autor;

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
	
	
}
