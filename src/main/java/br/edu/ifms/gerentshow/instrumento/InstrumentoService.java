package br.edu.ifms.gerentshow.instrumento;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class InstrumentoService 
        extends AbstractService<Instrumento, Long, InstrumentoForm, InstrumentoRepository> {

    @Autowired
    @Override
    public void setRepository(InstrumentoRepository repository) {
        super.repository = repository;
        super.setMapper(InstrumentoMapper.INSTANCE);
    }
    
    
}
