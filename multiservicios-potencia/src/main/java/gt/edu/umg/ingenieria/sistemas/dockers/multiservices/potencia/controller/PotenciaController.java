package gt.edu.umg.ingenieria.sistemas.dockers.multiservices.potencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
public class PotenciaController {

    @GetMapping("/potencia")
    public int potencia(@RequestParam int base, @RequestParam int exponente) {
        return (int) Math.pow(base, exponente);
    }
    
}
