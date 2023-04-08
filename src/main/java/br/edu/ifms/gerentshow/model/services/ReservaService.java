package br.edu.ifms.gerentshow.model.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.gerentshow.model.dto.ReservaDto;
import br.edu.ifms.gerentshow.model.entities.Reserva;
import br.edu.ifms.gerentshow.model.mapper.ReservaMapper;
import br.edu.ifms.gerentshow.model.repositories.ReservaRepository;



@Service
public class ReservaService {

private final ReservaRepository repository;
	
	public ReservaService(ReservaRepository repository) {
		this.repository = repository;
	}

	public ReservaDto create(ReservaDto reservaDto) {
		
		
		reservaDto.setData( reservaDto.getData());
		reservaDto.setValor( reservaDto.getValor());
	
		
		Reserva Reserva = ReservaMapper.dtoToEntity(reservaDto);
		repository.save(Reserva);
		return ReservaMapper.entityToDto(Reserva);
	}
}
