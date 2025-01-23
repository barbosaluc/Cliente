package com.example.Cliente;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@SpringBootApplication
public class ClienteApplication {

	@Configuration
	public class AppConfig {
		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}
	}

	public void modelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setSkipNullEnabled(true);
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

}
