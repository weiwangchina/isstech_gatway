package com.isstech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * start
 */
@SpringBootApplication
@EnableZuulProxy
public class GatwayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatwayApplication.class, args);
    }
}
