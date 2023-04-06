package br.edu.ifms.gerentshow.controller.mapper;

import br.edu.ifms.gerentshow.controller.dto.ShowRequest;
import br.edu.ifms.gerentshow.controller.dto.ShowResponse;
import br.edu.ifms.gerentshow.model.dto.ShowDto;

public class ShowMapper {

	public static ShowDto requestToDto( ShowRequest showRequest ) {
		ShowDto showDto = new ShowDto();
		showDto.setNome( showRequest.getNome() );
		showDto.setLocal( showRequest.getLocal() );
		return showDto;
	}
	
	public static ShowResponse dtoToResponse(ShowDto showDto ) {
		ShowResponse showResponse = new ShowResponse();
		showResponse.setId( showDto.getId() );
		showResponse.setNome( showDto.getNome() );
		showResponse.setLocal( showDto.getLocal() );
		return showResponse;
	}
}
