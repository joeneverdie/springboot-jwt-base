package io.joeneverdie.springsecurityconfig;

import io.joeneverdie.springsecurityconfig.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityConfigApplication.class, args);
	}

}
