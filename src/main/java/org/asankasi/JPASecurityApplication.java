package org.asankasi;

import org.asankasi.security.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JPASecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JPASecurityApplication.class, args);
	}

}
