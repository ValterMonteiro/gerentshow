package br.edu.ifms.gerentshow.musica;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 07041626105
 */
@RestController
@RequestMapping("/api/musica")
public class MusicaController 
        extends AbstractSimpleController<Musica, Long, MusicaDto, MusicaForm, MusicaRepository, MusicaService>  {

    @Autowired
    @Override
    public void setService(MusicaService service) {
        super.service = service;
        super.setMapper(MusicaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Musica entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/musica/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
