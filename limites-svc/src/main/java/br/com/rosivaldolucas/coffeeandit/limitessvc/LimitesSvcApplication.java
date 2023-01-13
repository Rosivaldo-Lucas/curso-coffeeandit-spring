package br.com.rosivaldolucas.coffeeandit.limitessvc;

import br.com.rosivaldolucas.coffeeandit.limitessvc.entity.LimiteDiario;
import br.com.rosivaldolucas.coffeeandit.limitessvc.repository.LimiteDiarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = LimiteDiarioRepository.class)
@EntityScan(basePackageClasses = LimiteDiario.class)
@SpringBootApplication
public class LimitesSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitesSvcApplication.class, args);
	}

}
