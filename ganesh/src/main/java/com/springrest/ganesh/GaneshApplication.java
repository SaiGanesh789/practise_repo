package com.springrest.ganesh;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GaneshApplication {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mm = new ModelMapper();
		return mm;
	}

	public static void main(String[] args) {

		SpringApplication.run(GaneshApplication.class, args);
	}

}
