package com.cope.registry;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * User: job
 * Date: 13/05/22
 * Time: 22:52
 *
 * @author job
 */
@EnableDiscoveryClient
@EnableAdminServer
@EnableEurekaServer
@EnableScheduling
@SpringBootApplication
public class RegistryServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(RegistryServiceApplication.class,args);
    }
}
