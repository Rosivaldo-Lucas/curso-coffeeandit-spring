package br.com.rosivaldolucas.coffeeandit.transactionbff.domain;

import br.com.rosivaldolucas.coffeeandit.transactionbff.dto.TransacaoDto;
import br.com.rosivaldolucas.coffeeandit.transactionbff.dto.TransacaoRequestDto;
import br.com.rosivaldolucas.coffeeandit.transactionbff.redis.TransacaoRedisRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TransacaoService {

    private final TransacaoRedisRepository transacaoRedisRepository;

    public TransacaoService(final TransacaoRedisRepository transacaoRedisRepository) {
        this.transacaoRedisRepository = transacaoRedisRepository;
    }

    public Optional<TransacaoDto> buscar(final String id) {
        return this.transacaoRedisRepository.findById(id);
    }

    public Optional<TransacaoDto> salvar(final TransacaoRequestDto transacaoRequestDto) {
        transacaoRequestDto.setData(LocalDateTime.now());

        final TransacaoDto transacao = this.transacaoRedisRepository.save(transacaoRequestDto);

        return Optional.of(transacao);
    }

}
