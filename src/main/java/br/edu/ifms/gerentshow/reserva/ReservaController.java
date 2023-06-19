package br.edu.ifms.gerentshow.reserva;

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
public class ReservaController 
        extends AbstractSimpleController<Reserva, Long, ReservaDto, ReservaForm, ReservaRepository, ReservaService>  {

    @Autowired
    @Override
    public void setService(ReservaService service) {
        super.service = service;
        super.setMapper(ReservaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Reserva entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/Local/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
