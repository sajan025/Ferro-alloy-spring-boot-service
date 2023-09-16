package com.jsp.ferro.alloy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


/**
 * @author Sajan
 *
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "FERRO-ALLOY API", version = "2.0", description = "FERRO-ALLOY Information"))
public class FerroAlloyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FerroAlloyApplication.class, args);
	}

}
