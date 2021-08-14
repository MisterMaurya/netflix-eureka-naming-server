
# Netflix Eureka Naming Server

## application.properties

```java
spring.application.name=netflix-eureka-naming-server
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```
## Main Class

```java
@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaNamingServerApplication.class, args);
    }

}
```
## pom.xml
```java
   <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
    </dependency>
```
    