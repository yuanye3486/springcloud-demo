package com.lfq.demo.springcloud.eureka.consumer.ribbon.controller;

import com.lfq.demo.springcloud.eureka.consumer.ribbon.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liufengqi
 */
@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String consumer() {
        return dcClient.consumer();
    }

}
