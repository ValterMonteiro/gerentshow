package br.edu.ifms.gerentshow.model.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.gerentshow.model.dto.ShowDto;
import br.edu.ifms.gerentshow.model.entities.Show;
import br.edu.ifms.gerentshow.model.mapper.ShowMapper;
import br.edu.ifms.gerentshow.model.repositories.ShowRepository;



@Service
public class ShowService {

private final ShowRepository repository;
	
	public ShowService(ShowRepository repository) {
		this.repository = repository;
	}

	public ShowDto create(ShowDto ShowDto) {
		
		
		ShowDto.setNome( ShowDto.getNome().toUpperCase() );
		ShowDto.setLocal( ShowDto.getLocal().toLowerCase() );
	
		
		if(repository.existsByNome(ShowDto.getNome())) {
			throw new RuntimeException("Show ja cadastrado");
			
		}
		
		Show Show = ShowMapper.dtoToEntity(ShowDto);
		repository.save(Show);
		return ShowMapper.entityToDto(Show);
	}
	
}
