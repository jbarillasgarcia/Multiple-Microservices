package gt.edu.umg.ingenieria.sistemas.dockers.multiservices.raizcuadrada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
public class RaizCuadradaController {
    
    @GetMapping("/raizcuadrada")
    public double raizcuadrada(@RequestParam int a) {
        return Math.sqrt(a);
    }

}
