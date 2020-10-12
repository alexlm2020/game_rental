package com.pruebamatrix.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GameRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameRentalApplication.class, args);
	}

}
