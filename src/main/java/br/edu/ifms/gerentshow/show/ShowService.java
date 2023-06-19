package br.edu.ifms.gerentshow.show;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class ShowService 
        extends AbstractService<Show, Long, ShowForm, ShowRepository> {

    @Autowired
    @Override
    public void setRepository(ShowRepository repository) {
        super.repository = repository;
        super.setMapper(ShowMapper.INSTANCE);
    }
    
    
}
