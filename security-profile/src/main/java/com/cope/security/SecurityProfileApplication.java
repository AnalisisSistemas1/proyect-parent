package com.cope.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: job
 * Date: 14/05/22
 * Time: 00:20
 *
 * @author job
 */
@SpringBootApplication
@EnableEurekaClient
public class SecurityProfileApplication {
    public static void main(String[] args){
        SpringApplication.run(SecurityProfileApplication.class,args);
    }
}
