package com.bravo.atividade_2_cobranca;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication server_1 = new SpringApplication(DemoApplication.class);

		server_1.setDefaultProperties(Collections.singletonMap("porta", "8087"));
		server_1.run(args);
	}
}
