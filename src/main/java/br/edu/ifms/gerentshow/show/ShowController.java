package br.edu.ifms.gerentshow.show;

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
@RequestMapping("/api/show")
public class ShowController 
        extends AbstractSimpleController<Show, Long, ShowDto, ShowForm, ShowRepository, ShowService>  {

    @Autowired
    @Override
    public void setService(ShowService service) {
        super.service = service;
        super.setMapper(ShowMapper.INSTANCE);
    }

    @Override
    public URI createUri(Show entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/show/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}