package manson112.github.chimhahademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ChimhahademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChimhahademoApplication.class, args);
	}

}
