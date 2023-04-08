package br.edu.ifms.gerentshow.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class InstrumentoRequest {
	
	@NotBlank
	@Size(max = 80, message = "Informe o nome do Instrumento")
	private String nome;

	@NotBlank
	@Size(min = 11, message = "Informe o nome do especificacao do evento")
	private String especificacao;
	
	
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
