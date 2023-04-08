package br.edu.ifms.gerentshow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Musica")
@Tag(name = "Musica", description = "Gerenciamento de Musica")
public class MusicaController {
	
private final MusicaService MusicaService;
	
	public MusicaController(MusicaService MusicaService) {
		this.MusicaService = MusicaService;
	}
	
	@GetMapping
	public ResponseEntity<String> olamundo() {
		return ResponseEntity.ok("Ola mundo");
	}
	
	@Operation(summary = "Novo recurso", description = "Serviço para cadastrar um recurso")
	@ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Operação de sucesso",
          content = @Content(mediaType = "application/json",
          schema = @Schema(implementation = MusicaResponse.class))),
      @ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content)
	})
	@PostMapping
	public ResponseEntity<MusicaResponse> create(
			@RequestBody @Valid MusicaRequest MusicaRequest ) {
		
		
		MusicaDto MusicaDto = MusicaMapper.requestToDto(MusicaRequest);
		MusicaDto MusicaDto2 = MusicaService.create(MusicaDto);
		
		MusicaResponse MusicaResponse = MusicaMapper.dtoToResponse(MusicaDto2);
		return ResponseEntity.ok(MusicaResponse);
	}


}
