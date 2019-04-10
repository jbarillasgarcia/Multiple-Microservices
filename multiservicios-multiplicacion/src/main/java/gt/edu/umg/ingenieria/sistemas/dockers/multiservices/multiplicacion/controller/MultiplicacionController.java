package gt.edu.umg.ingenieria.sistemas.dockers.multiservices.multiplicacion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
public class MultiplicacionController {

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }
    
}
