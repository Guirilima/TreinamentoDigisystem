package com.cadastramento.cadastramento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.cadastramento.repository")
@EntityScan(basePackages = {"com.cadastramento.cadastramento.models"})
@ComponentScan({"com.cadastramento.cadastramento"})
public class CadastramentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastramentoApplication.class, args);
	}

}
