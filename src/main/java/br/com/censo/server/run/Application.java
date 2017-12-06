package br.com.censo.server.run;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
@SpringBootApplication
@EntityScan(basePackages = {
            "br.com.censo.server.model"
            })
@EnableJpaRepositories(basePackages = {
            "br.com.censo.server.repository"
            })
public class Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);    
    }
    
}