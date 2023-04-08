package br.edu.ifms.gerentshow.model.mapper;

import br.edu.ifms.gerentshow.model.dto.ReservaDto;
import br.edu.ifms.gerentshow.model.entities.Reserva;

public class ReservaMapper {

	public static Reserva dtoToEntity( ReservaDto reservaDto ) {
		Reserva reserva = new Reserva();
		reserva.setData( reservaDto.getData() );
		reserva.setValor( reservaDto.getValor() );
		
		return reserva;
	}
	
	public static ReservaDto entityToDto(Reserva reserva) {
		ReservaDto reservaDto = new ReservaDto();
		reservaDto.setId( reserva.getId() );
		reservaDto.setData( reserva.getData() );
		reservaDto.setValor( reserva.getValor() );
		
		return reservaDto;
	}
}
