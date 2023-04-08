package br.edu.ifms.gerentshow.controller.dto;

import java.sql.Date;

public class ReservaResponse {

	private Date data;
	
	private double valor;

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
