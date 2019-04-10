package gt.edu.umg.ingenieria.sistemas.dockers.multiservices.resta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
public class RestaController {

    @GetMapping("/restar")
    public int restar(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }
    
}
