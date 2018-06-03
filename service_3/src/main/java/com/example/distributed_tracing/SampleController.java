package com.example.distributed_tracing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {

    @GetMapping("/service-3")
    public String sample() {
        String response = "I'm service-3";
        log.info(response);
        return response;
    }
}
