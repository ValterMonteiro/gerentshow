package br.edu.ifms.gerentshow.model.dto;

import java.sql.Date;
import java.util.UUID;

public class ReservaDto {

	private UUID id;
	
	private Date data;
	
	private double valor;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
