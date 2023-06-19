package br.edu.ifms.gerentshow.reserva;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author 07041626105
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Local não encontrada")

public class ReservaNotFoundException extends ResponseStatusException {

      public ReservaNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}
