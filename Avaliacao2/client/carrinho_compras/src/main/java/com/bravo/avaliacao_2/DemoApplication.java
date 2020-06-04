package com.bravo.avaliacao_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(final String[] args) {

		carrinho carrinho = new carrinho();
		
		// Relacionado ao SKU
		String[] lista = { "Produto_1", "Produto_2", "Produto_3", "Produto_4", "Produto_5" };
		String[] localhost = { "http://localhost:8087/", "http://localhost:8088/", "http://localhost:8089/" };
		carrinho.setemail("local@mail.com");
		carrinho.setcep("000.000.000-01");
		carrinho.setvalor(200);
		carrinho.setsku(lista);

		SpringApplication.run(DemoApplication.class);
	}
}
