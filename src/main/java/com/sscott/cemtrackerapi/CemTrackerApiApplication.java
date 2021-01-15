package com.sscott.cemtrackerapi;

import com.sscott.cemtrackerapi.dao.CemeteryRepository;
import com.sscott.cemtrackerapi.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserRepository.class, CemeteryRepository.class})
public class CemTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CemTrackerApiApplication.class, args);
	}

}
