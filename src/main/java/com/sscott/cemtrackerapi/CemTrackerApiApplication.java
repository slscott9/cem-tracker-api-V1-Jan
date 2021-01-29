package com.sscott.cemtrackerapi;

import com.sscott.cemtrackerapi.dao.CemeteryRepository;
import com.sscott.cemtrackerapi.dao.GraveRepository;
import com.sscott.cemtrackerapi.dao.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserRepository.class, CemeteryRepository.class, GraveRepository.class})
public class CemTrackerApiApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(CemTrackerApiApplication.class, args);
	}

}
