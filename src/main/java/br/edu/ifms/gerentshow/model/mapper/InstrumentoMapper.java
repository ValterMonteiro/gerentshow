package br.edu.ifms.gerentshow.model.mapper;

import br.edu.ifms.gerentshow.model.dto.InstrumentoDto;

import br.edu.ifms.gerentshow.model.entities.Instrumento;


public class InstrumentoMapper {
	
	public static Instrumento dtoToEntity( InstrumentoDto instrumentoDto ) {
		Instrumento instrumento = new Instrumento();
		instrumento.setNome( instrumentoDto.getNome() );
		instrumento.setEspecificacao( instrumentoDto.getEspecificacao() );
		
		return instrumento;
	}
	
	public static InstrumentoDto entityToDto(Instrumento instrumento) {
		InstrumentoDto instrumentoDto = new InstrumentoDto();
		instrumentoDto.setId( instrumento.getId() );
		instrumentoDto.setNome( instrumento.getNome() );
		instrumentoDto.setEspecificacao( instrumento.getEspecificacao() );
		
		return instrumentoDto;
	}
	
}
