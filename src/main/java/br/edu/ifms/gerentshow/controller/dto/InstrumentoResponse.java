package br.edu.ifms.gerentshow.controller.dto;



import java.time.Instant;
import java.util.UUID;

public class InstrumentoResponse {
	
	private String nome;
	private String especificacao;
	
	private UUID id;
	private Instant dtCadastro;
	private Instant dtAtualizacao;
	
	
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
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Instant getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Instant dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public Instant getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(Instant dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}
	
}
