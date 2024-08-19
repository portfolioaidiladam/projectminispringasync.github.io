package programmerzamannow.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@SpringBootApplication
public class BelajarSpringAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringAsyncApplication.class, args);
	}

}
