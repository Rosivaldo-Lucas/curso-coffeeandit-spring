package br.com.rosivaldolucas.coffeeandit.transactionbff.api;

import br.com.rosivaldolucas.coffeeandit.transactionbff.dto.TransacaoDto;
import br.com.rosivaldolucas.coffeeandit.transactionbff.dto.TransacaoRequestDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transacoes")
public class TransactionController {

    @GetMapping(value = "/{id}",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> buscarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> enviarTransacao(@RequestBody final TransacaoRequestDto transacaoRequestDto) {
        return Mono.empty();
    }

    @PatchMapping(value = "/{id}/confirmar",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> confirmarTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransacaoDto> removerTransacao(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

}
