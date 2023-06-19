package br.edu.ifms.gerentshow.reserva;

import java.time.LocalDate;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "local_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Reserva extends BaseObject {

 private LocalDate diaMarcado;
 private double valor;
}
