package br.com.rosivaldolucas.coffeeandit.transactionbff.redis;

import br.com.rosivaldolucas.coffeeandit.transactionbff.dto.TransacaoDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRedisRepository extends CrudRepository<TransacaoDto, String> {

}
