package monitoring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class ActuatorApplication extends SpringBootServletInitializer {
	@CrossOrigin(origins="http://localhost:8081")
	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
		
	}
}
