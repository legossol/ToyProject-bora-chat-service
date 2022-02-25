package kr.legossol.borachat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BorachatApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorachatApplication.class, args);
	}

}
