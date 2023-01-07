package com.example.dockerotus.controller;

import com.example.dockerotus.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey_Kostyukov
 */
@RestController
public class Controller {

    @GetMapping("/health")
    public HealthResponse test(){
        return  new HealthResponse("OK");
    }
}
