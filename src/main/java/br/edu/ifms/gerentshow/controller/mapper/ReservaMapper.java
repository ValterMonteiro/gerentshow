package br.edu.ifms.gerentshow.controller.mapper;

import br.edu.ifms.gerentshow.controller.dto.ReservaRequest;
import br.edu.ifms.gerentshow.controller.dto.ReservaResponse;
import br.edu.ifms.gerentshow.model.dto.ReservaDto;

public class ReservaMapper {

	public static ReservaDto requestToDto( ReservaRequest reservaRequest ) {
		ReservaDto instrumentoDto = new ReservaDto();
		instrumentoDto.setData(reservaRequest.getData());
		ReservaDto reservaDto = new ReservaDto();
		reservaDto.setValor(reservaRequest.getValor());
		return reservaDto;
	}
	
	public static ReservaResponse dtoToResponse(ReservaDto reservaDto ) {
		ReservaResponse reservaResponse = new ReservaResponse();
		reservaResponse.setData( reservaDto.getData() );
		reservaResponse.setValor( reservaDto.getValor() );
		return reservaResponse;
	}
}
