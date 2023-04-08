package br.edu.ifms.gerentshow.controller.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ReservaRequest {
	@NotBlank
	@Size(message = "Informe a data")
	private Date data;

	@NotBlank
	@Size(max = 11, message = "Informe o valor")
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
