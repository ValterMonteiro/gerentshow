package br.edu.ifms.gerentshow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.edu.ifms.gerentshow.controller.dto.ReservaRequest;
import br.edu.ifms.gerentshow.controller.dto.ReservaResponse;
import br.edu.ifms.gerentshow.controller.mapper.ReservaMapper;
import br.edu.ifms.gerentshow.model.dto.ReservaDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/Reserva")
@Tag(name = "Reserva", description = "Gerenciamento de Reserva")
public class ReservaController {

		
		private final ReservaService ReservaService;
		
		public ReservaController(ReservaService ReservaService) {
			this.ReservaService = ReservaService;
		}
		
		@GetMapping
		public ResponseEntity<String> olamundo() {
			return ResponseEntity.ok("Ola mundo");
		}
		
		@Operation(summary = "Novo recurso", description = "Serviço para cadastrar um recurso")
		@ApiResponses(value = {
	      @ApiResponse(responseCode = "200", description = "Operação de sucesso",
	          content = @Content(mediaType = "application/json",
	          schema = @Schema(implementation = ReservaResponse.class))),
	      @ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content)
		})
		@PostMapping
		public ResponseEntity<ReservaResponse> create(
				@RequestBody @Valid ReservaRequest ReservaRequest ) {
			
			
			ReservaDto ReservaDto = ReservaMapper.requestToDto(ReservaRequest);
			ReservaDto ReservaDto2 = ReservaService.create(ReservaDto);
			
			ReservaResponse InstrumentoResponse = ReservaMapper.dtoToResponse(ReservaDto2);
			return ResponseEntity.ok(ReservaResponse);
		}
}
