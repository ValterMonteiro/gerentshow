package br.edu.ifms.gerentshow.controller.mapper;

import br.edu.ifms.gerentshow.controller.dto.MusicaRequest;
import br.edu.ifms.gerentshow.controller.dto.MusicaResponse;
import br.edu.ifms.gerentshow.model.dto.MusicaDto;

public class MusicaMapper {

	public static MusicaDto requestToDto( MusicaRequest musicaRequest ) {
		MusicaDto musicaDto = new MusicaDto();
		musicaDto.setNome( musicaRequest.getNome() );
		musicaDto.setAutor( musicaRequest.getAutor() );
		return musicaDto;
	}
	
	public static MusicaResponse dtoToResponse(MusicaDto musicaDto ) {
		MusicaResponse musicaResponse = new MusicaResponse();
		musicaResponse.setId( musicaDto.getId() );
		musicaResponse.setNome( musicaDto.getNome() );
		musicaResponse.setAutor( musicaDto.getAutor() );
		return musicaResponse;
	}
}
