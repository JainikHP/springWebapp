package guru.springframework.springWebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Spring5WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5WebappApplication.class, args);
	}
}
