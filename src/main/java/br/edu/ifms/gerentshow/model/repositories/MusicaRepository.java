package br.edu.ifms.gerentshow.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.gerentshow.model.entities.Musica;


@Repository
public interface MusicaRepository 
extends JpaRepository<Musica, UUID>{

	Boolean existsByNome(String nome);

}
