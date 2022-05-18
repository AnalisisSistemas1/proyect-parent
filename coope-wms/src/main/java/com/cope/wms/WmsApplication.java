package com.cope.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: job
 * Date: 13/05/22
 * Time: 23:56
 *
 * @author job
 */
@SpringBootApplication
@EnableEurekaClient
public class WmsApplication {
    public static void main(String[] args){
        SpringApplication.run(WmsApplication.class,args);
    }
}
