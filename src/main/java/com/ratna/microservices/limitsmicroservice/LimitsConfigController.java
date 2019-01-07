package com.ratna.microservices.limitsmicroservice;

import com.ratna.microservices.limitsmicroservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfig() {
        return new LimitConfiguration(configuration.getMax(), configuration.getMin());
    }
}
