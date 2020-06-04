package main.java.com.bravo.atividade_2_cobranca;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DemoController {

    @PostMapping("/")
    public String buy(@RequestBody final String buy){
        return buy;
    }
}