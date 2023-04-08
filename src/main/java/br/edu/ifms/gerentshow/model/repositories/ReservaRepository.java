package br.edu.ifms.gerentshow.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.gerentshow.model.entities.Reserva;

@Repository
public interface ReservaRepository
extends JpaRepository<Reserva, UUID>{
	
	Boolean existsByNome(String nome);

}
