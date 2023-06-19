package br.edu.ifms.gerentshow.reserva;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class ReservaService 
        extends AbstractService<Reserva, Long, ReservaForm, ReservaRepository> {

    @Autowired
    @Override
    public void setRepository(ReservaRepository repository) {
        super.repository = repository;
        super.setMapper(ReservaMapper.INSTANCE);
    }
    
    
}
