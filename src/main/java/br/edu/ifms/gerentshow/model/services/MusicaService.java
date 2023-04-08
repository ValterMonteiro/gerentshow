package br.edu.ifms.gerentshow.model.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.gerentshow.model.dto.MusicaDto;
import br.edu.ifms.gerentshow.model.entities.Musica;
import br.edu.ifms.gerentshow.model.mapper.MusicaMapper;
import br.edu.ifms.gerentshow.model.repositories.MusicaRepository;


@Service
public class MusicaService {

private final MusicaRepository repository;
	
	public MusicaService(MusicaRepository repository) {
		this.repository = repository;
	}

	public MusicaDto create(MusicaDto musicaDto) {
		
		
		musicaDto.setNome( musicaDto.getNome().toUpperCase() );
		musicaDto.setAutor( musicaDto.getAutor().toLowerCase() );
	
		
		if(repository.existsByNome(musicaDto.getNome())) {
			throw new RuntimeException("Musica ja cadastrada");
			
		}
		
		Musica Musica = MusicaMapper.dtoToEntity(musicaDto);
		repository.save(Musica);
		return MusicaMapper.entityToDto(Musica);
	}
}
