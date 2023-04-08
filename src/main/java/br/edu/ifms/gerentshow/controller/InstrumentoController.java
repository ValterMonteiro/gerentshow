package br.edu.ifms.gerentshow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.gerentshow.controller.dto.InstrumentoResponse;
import br.edu.ifms.gerentshow.model.services.InstrumentoService;
import br.edu.ifms.gerentshow.controller.dto.InstrumentoRequest;
import br.edu.ifms.gerentshow.controller.mapper.InstrumentoMapper;
import br.edu.ifms.gerentshow.model.dto.InstrumentoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Instrumento")
@Tag(name = "Instrumento", description = "Gerenciamento de Instrumentos")
public class InstrumentoController {
	
	private final InstrumentoService InstrumentoService;
	
	public InstrumentoController(InstrumentoService InstrumentoService) {
		this.InstrumentoService = InstrumentoService;
	}
	
	@GetMapping
	public ResponseEntity<String> olamundo() {
		return ResponseEntity.ok("Ola mundo");
	}
	
	@Operation(summary = "Novo recurso", description = "Serviço para cadastrar um recurso")
	@ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Operação de sucesso",
          content = @Content(mediaType = "application/json",
          schema = @Schema(implementation = InstrumentoResponse.class))),
      @ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content)
	})
	@PostMapping
	public ResponseEntity<InstrumentoResponse> create(
			@RequestBody @Valid InstrumentoRequest InstrumentoRequest ) {
		
		
		InstrumentoDto InstrumentoDto = InstrumentoMapper.requestToDto(InstrumentoRequest);
		InstrumentoDto InstrumentoDto2 = InstrumentoService.create(InstrumentoDto);
		
		InstrumentoResponse InstrumentoResponse = InstrumentoMapper.dtoToResponse(InstrumentoDto2);
		return ResponseEntity.ok(InstrumentoResponse);
	}

}