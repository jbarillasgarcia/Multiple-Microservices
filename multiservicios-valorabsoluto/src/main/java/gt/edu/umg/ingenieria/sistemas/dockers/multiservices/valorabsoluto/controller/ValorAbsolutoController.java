package gt.edu.umg.ingenieria.sistemas.dockers.multiservices.valorabsoluto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
public class ValorAbsolutoController {

    @GetMapping("/valorabsoluto")
    public int valorAbsoluto(@RequestParam int a) {
        return Math.abs(a);
    }
    
}
