package com.mentorama.Mod03Atividade;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private final HelloWorldService helloWorldService = new HelloWorldService();

    @GetMapping
    public ResponseEntity<String> helloWorld() {

        return new ResponseEntity<>(helloWorldService.show(),HttpStatus.OK);

    }

}
