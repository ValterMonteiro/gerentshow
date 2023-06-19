package br.edu.ifms.gerentshow.instrumento;

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
@RequestMapping("/api/Local")
public class InstrumentoController 
        extends AbstractSimpleController<Instrumento, Long, InstrumentoDto, InstrumentoForm, InstrumentoRepository, InstrumentoService>  {

    @Autowired
    @Override
    public void setService(InstrumentoService service) {
        super.service = service;
        super.setMapper(InstrumentoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Instrumento entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/Local/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}