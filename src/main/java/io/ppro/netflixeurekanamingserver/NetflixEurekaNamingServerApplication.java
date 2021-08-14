package io.ppro.netflixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * @author Pawan Maurya
 * @since Aug 07, 2021
 */

@SpringBootApplication
// To Enable Eureka Server
@EnableEurekaServer
public class NetflixEurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaNamingServerApplication.class, args);
    }

}
