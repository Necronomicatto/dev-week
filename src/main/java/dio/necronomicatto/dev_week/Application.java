package dio.necronomicatto.dev_week.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dio.necronomicatto.dev_week")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
