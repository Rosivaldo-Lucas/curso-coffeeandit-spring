package br.com.rosivaldolucas.coffeeandit.transactionbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableRedisRepositories(basePackages = {"br.com.rosivaldolucas.coffeeandit.transactionbff.redis"})
@SpringBootApplication
public class TransactionBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionBffApplication.class, args);
	}

}
