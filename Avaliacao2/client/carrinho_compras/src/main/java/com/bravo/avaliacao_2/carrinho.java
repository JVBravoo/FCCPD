package main.java.com.bravo.avaliacao_2;

import org.springframework.http.ResponseEntity;

@Getters
@Setters
public class carrinho {
    
    public String email;
    public String cep;
    public int valor;
    public String[] sku;

    public void buy(carrinho carrinho, final String[] localhostArray){
        Rest rest = new Rest();

        try {
            ResponseEntity<String> response = rest.postForEntity(localhost, carrinho);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}