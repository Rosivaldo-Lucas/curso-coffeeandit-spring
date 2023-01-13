package br.com.rosivaldolucas.coffeeandit.limitessvc.api;

import br.com.rosivaldolucas.coffeeandit.limitessvc.entity.LimiteDiario;
import br.com.rosivaldolucas.coffeeandit.limitessvc.service.LimiteDiarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/limite-diario")
public class LimiteDiarioController {

    private final LimiteDiarioService limiteDiarioService;

    public LimiteDiarioController(final LimiteDiarioService limiteDiarioService) {
        this.limiteDiarioService = limiteDiarioService;
    }

    @GetMapping("/{id}")
    public LimiteDiario buscarPorId(final @PathVariable Long id) {
        final Optional<LimiteDiario> limiteDiarioOp = this.limiteDiarioService.busacrPorId(id);

        if (limiteDiarioOp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Limite diário não encontrado.");
        }

        return limiteDiarioOp.get();
    }

}
