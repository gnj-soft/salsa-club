package gnj.soft.salsa.club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Salsa-club management!
 */
@EnableAutoConfiguration
@ComponentScan("gnj.soft.salsa.club")
public class App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
