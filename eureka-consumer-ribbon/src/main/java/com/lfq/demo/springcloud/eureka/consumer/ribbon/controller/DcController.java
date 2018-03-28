package com.lfq.demo.springcloud.eureka.consumer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liufengqi
 */
@RestController
public class DcController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        String url = "http://eureka-client/dc";
        System.out.println("request to : " + url);
        return restTemplate.getForObject(url, String.class);
    }

}
