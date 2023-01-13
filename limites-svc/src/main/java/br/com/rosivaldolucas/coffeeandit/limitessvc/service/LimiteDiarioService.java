package br.com.rosivaldolucas.coffeeandit.limitessvc.service;

import br.com.rosivaldolucas.coffeeandit.limitessvc.entity.LimiteDiario;
import br.com.rosivaldolucas.coffeeandit.limitessvc.repository.LimiteDiarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LimiteDiarioService {

    private final LimiteDiarioRepository limiteDiarioRepository;

    public LimiteDiarioService(final LimiteDiarioRepository limiteDiarioRepository) {
        this.limiteDiarioRepository = limiteDiarioRepository;
    }

    public Optional<LimiteDiario> busacrPorId(final Long id) {
        final Optional<LimiteDiario> limiteDiarioOp = this.limiteDiarioRepository.findById(id);

        return limiteDiarioOp;
    }

}
