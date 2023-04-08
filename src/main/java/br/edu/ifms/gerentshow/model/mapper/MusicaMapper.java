package br.edu.ifms.gerentshow.model.mapper;

import br.edu.ifms.gerentshow.model.dto.MusicaDto;
import br.edu.ifms.gerentshow.model.entities.Musica;

public class MusicaMapper {

	public static Musica dtoToEntity( MusicaDto musicaDto ) {
		Musica musica = new Musica();
		musica.setNome( musicaDto.getNome() );
		musica.setAutor( musicaDto.getAutor() );
		
		return musica;
	}
	
	public static MusicaDto entityToDto(Musica musica) {
		MusicaDto musicaDto = new MusicaDto();
		musicaDto.setId( musica.getId() );
		musicaDto.setNome( musica.getNome() );
		musicaDto.setAutor( musica.getAutor() );
		
		return musicaDto;
	}
}
