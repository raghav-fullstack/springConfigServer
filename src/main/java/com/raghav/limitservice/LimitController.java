package com.raghav.limitservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public GetLimits GetMaxAndMinLimits(){



        log.info("\n Controller is getting triggered");
        return new GetLimits(configuration.getMaximum(),configuration.getMinimum());

        //return null;
    }
}
