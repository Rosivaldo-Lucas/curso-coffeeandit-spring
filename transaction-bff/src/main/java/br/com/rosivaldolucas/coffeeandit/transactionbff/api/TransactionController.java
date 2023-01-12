package br.com.rosivaldolucas.coffeeandit.transactionbff.api;

import br.com.rosivaldolucas.coffeeandit.transactionbff.dto.TransacaoDto;
import br.com.rosivaldolucas.coffeeandit.transactionbff.dto.TransacaoRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transacoes")
@Tag(name = "/transacoes", description = "Grupo de API´s para manipulação de transações financeiras.")
public class TransactionController {


    @Operation(description = "API para buscar as transações persistidas por id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorno OK com a transação."),
            @ApiResponse(responseCode = "401", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "403", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "404", description = "Recurso não encontrado.")
    })
    @Parameters(value = {
            @Parameter(name = "id", in = ParameterIn.PATH)
    })
    @GetMapping(value = "/{id}",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> buscarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @Operation(description = "API para criar uma transação financeira.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Retorno OK com a transação criada."),
            @ApiResponse(responseCode = "401", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "403", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "404", description = "Recurso não encontrado.")
    })
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> enviarTransacao(@RequestBody final TransacaoRequestDto transacaoRequestDto) {
        return Mono.empty();
    }

    @Operation(description = "API para confirmar a transação financeira.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorno OK da confirmação da transação."),
            @ApiResponse(responseCode = "401", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "403", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "404", description = "Recurso não encontrado.")
    })
    @Parameters(value = {
            @Parameter(name = "id", in = ParameterIn.PATH)
    })
    @PatchMapping(value = "/{id}/confirmar",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> confirmarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @Operation(description = "API para remover as transações persistidas por id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Retorno OK da remoção da transação."),
            @ApiResponse(responseCode = "401", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "403", description = "Erro de autorização dessa API."),
            @ApiResponse(responseCode = "404", description = "Recurso não encontrado.")
    })
    @Parameters(value = {
            @Parameter(name = "id", in = ParameterIn.PATH)
    })
    @DeleteMapping(value = "/{id}",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> removerTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

}
