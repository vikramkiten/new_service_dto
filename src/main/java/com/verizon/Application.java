package com.verizon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.verizon")
@EnableJpaRepositories(basePackages = "com.verizon.repositories")
@EntityScan(basePackages = "com.verizon.entities")
public class Application {
    public static void main(String args[]){

        SpringApplication.run(Application.class,args);
    }

}
