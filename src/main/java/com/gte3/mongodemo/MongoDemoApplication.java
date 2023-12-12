package com.gte3.mongodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
class MongoDemoApplication {

    @GetMapping
	public String message(){
		return "welcome to devops project";
	}

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoApplication.class, args);
    }

}
