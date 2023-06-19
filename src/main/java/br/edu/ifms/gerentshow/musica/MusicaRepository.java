package br.edu.ifms.gerentshow.musica;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author 07041626105
 */
@Repository
public interface MusicaRepository  extends IArchRepository<Musica, Long>{
    
}