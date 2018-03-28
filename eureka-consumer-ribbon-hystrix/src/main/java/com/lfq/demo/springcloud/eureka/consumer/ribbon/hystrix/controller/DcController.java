package com.lfq.demo.springcloud.eureka.consumer.ribbon.hystrix.controller;

import com.lfq.demo.springcloud.eureka.consumer.ribbon.hystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liufengqi
 */
@RestController
public class DcController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String consumer() {
        return consumerService.consumer();
    }

}
