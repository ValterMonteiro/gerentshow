package br.edu.ifms.gerentshow.model.mapper;

import br.edu.ifms.gerentshow.model.dto.ShowDto;
import br.edu.ifms.gerentshow.model.entities.Show;

public class ShowMapper {
	
	public static Show dtoToEntity( ShowDto showDto ) {
		Show show = new Show();
		show.setNome( showDto.getNome() );
		show.setLocal( showDto.getLocal() );
		
		return show;
	}
	
	public static ShowDto entityToDto(Show show) {
		ShowDto showDto = new ShowDto();
		showDto.setId( show.getId() );
		showDto.setNome( show.getNome() );
		showDto.setLocal( show.getLocal() );
		
		return showDto;
	}
	
}
