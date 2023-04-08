package br.edu.ifms.gerentshow.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.gerentshow.model.entities.Show;



@Repository
public interface ShowRepository
extends JpaRepository<Show, UUID> {

	Boolean existsByNome(String nome);
	
}
