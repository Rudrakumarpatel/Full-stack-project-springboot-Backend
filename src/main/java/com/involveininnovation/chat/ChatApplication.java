package com.involveininnovation.chat;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {
	public static void main(String[] args){

		Dotenv dotenv = Dotenv.load();
		System.setProperty("spring.datasource.url", dotenv.get("DATABASE_URL"));
		System.setProperty("spring.datasource.username", dotenv.get("DATABASE_USER"));
		System.setProperty("spring.datasource.password", dotenv.get("DATABASE_PASSWORD"));

		SpringApplication.run(ChatApplication.class, args);
	}
}
