package br.com.rosivaldolucas.coffeeandit.limitessvc.repository;

import br.com.rosivaldolucas.coffeeandit.limitessvc.entity.LimiteDiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LimiteDiarioRepository extends JpaRepository<LimiteDiario, Long> {

    Optional<LimiteDiario> findByAgenciaAndConta(final Long agencia, final Long conta);

}
