package br.edu.ifms.gerentshow.musica;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class MusicaService 
        extends AbstractService<Musica, Long, MusicaForm, MusicaRepository> {

    @Autowired
    @Override
    public void setRepository(MusicaRepository repository) {
        super.repository = repository;
        super.setMapper(MusicaMapper.INSTANCE);
    }
    
    
}
