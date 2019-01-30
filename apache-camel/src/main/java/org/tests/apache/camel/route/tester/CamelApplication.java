package org.tests.apache.camel.route.tester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camelContext.xml")
public class CamelApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CamelApplication.class, args);
    }
    
}
