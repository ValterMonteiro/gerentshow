package br.edu.ifms.gerentshow.reserva;

import java.time.LocalDate;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author 07041626105
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ReservaForm extends AdapterBaseObjectForm {
    
	private LocalDate diaMarcado;
	 private double valor;
}
