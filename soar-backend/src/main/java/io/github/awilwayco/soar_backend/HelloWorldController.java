package io.github.awilwayco.soar_backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    
    @GetMapping("/")
    public String sayHello() {
        return new String("Hello World!");
    }
    
}
