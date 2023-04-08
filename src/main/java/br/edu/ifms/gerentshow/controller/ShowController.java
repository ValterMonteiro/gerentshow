package br.edu.ifms.gerentshow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.gerentshow.controller.dto.ShowResponse;
import br.edu.ifms.gerentshow.model.services.ShowService;
import br.edu.ifms.gerentshow.controller.dto.ShowRequest;
import br.edu.ifms.gerentshow.controller.mapper.ShowMapper;
import br.edu.ifms.gerentshow.model.dto.ShowDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Show")
@Tag(name = "Show", description = "Gerenciamento de Shows")
public class ShowController {
	
	private final ShowService ShowService;
	
	public ShowController(ShowService ShowService) {
		this.ShowService = ShowService;
	}
	
	@GetMapping
	public ResponseEntity<String> olamundo() {
		return ResponseEntity.ok("Ola mundo");
	}
	
	@Operation(summary = "Novo recurso", description = "Serviço para cadastrar um recurso")
	@ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Operação de sucesso",
          content = @Content(mediaType = "application/json",
          schema = @Schema(implementation = ShowResponse.class))),
      @ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content)
	})
	@PostMapping
	public ResponseEntity<ShowResponse> create(
			@RequestBody @Valid ShowRequest ShowRequest ) {
		
		
		ShowDto ShowDto = ShowMapper.requestToDto(ShowRequest);
		ShowDto ShowDto2 = ShowService.create(ShowDto);
		
		ShowResponse ShowResponse = ShowMapper.dtoToResponse(ShowDto2);
		return ResponseEntity.ok(ShowResponse);
	}

}