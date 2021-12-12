package br.com.digitalinovation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;


@SpringBootApplication
@EnableDynamoDBRepositories
public class SuperHeroiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperHeroiApiApplication.class, args);
	}

}
