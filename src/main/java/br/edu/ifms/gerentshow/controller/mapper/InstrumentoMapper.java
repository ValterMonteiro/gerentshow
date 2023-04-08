package br.edu.ifms.gerentshow.controller.mapper;

import br.edu.ifms.gerentshow.controller.dto.InstrumentoRequest;
import br.edu.ifms.gerentshow.controller.dto.InstrumentoResponse;
import br.edu.ifms.gerentshow.controller.dto.ShowRequest;
import br.edu.ifms.gerentshow.controller.dto.ShowResponse;
import br.edu.ifms.gerentshow.model.dto.InstrumentoDto;
import br.edu.ifms.gerentshow.model.dto.ShowDto;

public class InstrumentoMapper {

	public static InstrumentoDto requestToDto( InstrumentoRequest instrumentoRequest ) {
		InstrumentoDto instrumentoDto = new InstrumentoDto();
		instrumentoDto.setNome( instrumentoRequest.getNome() );
		instrumentoDto.setEspecificacao( instrumentoRequest.getEspecificacao() );
		return instrumentoDto;
	}
	
	public static InstrumentoResponse dtoToResponse(InstrumentoDto instrumentoDto ) {
		InstrumentoResponse instrumentoResponse = new InstrumentoResponse();
		instrumentoResponse.setId( instrumentoDto.getId() );
		instrumentoResponse.setNome( instrumentoDto.getNome() );
		instrumentoResponse.setEspecificacao( instrumentoDto.getEspecificacao() );
		return instrumentoResponse;
	}
}
