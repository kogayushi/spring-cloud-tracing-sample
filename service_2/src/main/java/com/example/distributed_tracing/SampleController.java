package com.example.distributed_tracing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class SampleController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/service-2")
    public String sample() {
        String response = "I'm service-2, get something from " + restTemplate.getForObject("http://localhost:8083/service-3", String.class);
        log.info(response);
        return response;
    }
}
