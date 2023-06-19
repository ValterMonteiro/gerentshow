package br.edu.ifms.gerentshow.instrumento;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author 07041626105
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Instrumento não encontrada")

public class InstrumentoNotFoundException extends ResponseStatusException {

      public InstrumentoNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}
