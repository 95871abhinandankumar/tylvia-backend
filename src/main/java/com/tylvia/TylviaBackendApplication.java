package com.tylvia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com/tylvia/repository")
public class TylviaBackendApplication {

    public static void main(String[] args) {
		SpringApplication.run(TylviaBackendApplication.class, args);
    }

}
