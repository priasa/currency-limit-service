package com.in28minutes.microservices.limitservice.controller;

import com.in28minutes.microservices.limitservice.configuration.LimitServiceConfiguration;
import com.in28minutes.microservices.limitservice.entity.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    LimitServiceConfiguration limitServiceConfiguration;

    @GetMapping(name = "/limits")
    public ResponseEntity<LimitConfiguration> retrieveLimitsFromConfigurations() {
        return ResponseEntity.ok(LimitConfiguration.builder()
                .maximum(limitServiceConfiguration.getMaximum())
                .minimum(limitServiceConfiguration.getMinimum())
                .build());
    }
}
