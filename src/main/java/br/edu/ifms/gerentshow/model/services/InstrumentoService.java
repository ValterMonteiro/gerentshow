package br.edu.ifms.gerentshow.model.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.gerentshow.model.dto.InstrumentoDto;
import br.edu.ifms.gerentshow.model.entities.Instrumento;
import br.edu.ifms.gerentshow.model.mapper.InstrumentoMapper;
import br.edu.ifms.gerentshow.model.repositories.InstrumentoRepository;



@Service
public class InstrumentoService {

private final InstrumentoRepository repository;
	
	public InstrumentoService(InstrumentoRepository repository) {
		this.repository = repository;
	}

	public InstrumentoDto create(InstrumentoDto instrumentoDto) {
		
		
		instrumentoDto.setNome( instrumentoDto.getNome().toUpperCase() );
		instrumentoDto.setEspecificacao( instrumentoDto.getEspecificacao().toLowerCase() );
	
		
		if(repository.existsByNome(instrumentoDto.getNome())) {
			throw new RuntimeException("Instrumento ja cadastrado");
			
		}
		
		Instrumento Instrumento = InstrumentoMapper.dtoToEntity(instrumentoDto);
		repository.save(Instrumento);
		return InstrumentoMapper.entityToDto(Instrumento);
	}
	
}
