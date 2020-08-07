package edu.es.eoi.mundobancario;

import org.apache.catalina.mapper.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "edu.es.eoi.mundobancario")
public class MundoBancarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundoBancarioApplication.class, args);
	}
	
	@Bean
	public Mapper getMapper() {		
		return new Mapper();
	}

}
