package com.bravo.avaliacao_2_estoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication server_2 = SpringApplication(DemoApplication.class);

		server_2.setDefaultProperties(Collections.singletonMap("porta", "8088"));
		server_2.run(args);
	}
}
