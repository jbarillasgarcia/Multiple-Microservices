package gt.edu.umg.ingenieria.sistemas.dockers.multiservices.division.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
public class DivisionController {

    @GetMapping("/dividir")
    public int dividir(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }
    
}
