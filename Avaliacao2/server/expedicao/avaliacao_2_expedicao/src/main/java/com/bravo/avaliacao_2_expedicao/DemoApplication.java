package com.bravo.avaliacao_2_expedicao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication server_3 = SpringApplication(DemoApplication.class);

		server_3.setDefaultProperties(Collections.singletonMap("porta", "8089"));
		server_3.run(args);
	}
}
