package br.edu.ifms.gerentshow.reserva;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 07041626105
 */
@Repository
public interface ReservaRepository  extends IArchRepository<Reserva, Long>{
    
}
