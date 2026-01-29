package com.mrafiindra.basicspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicSpringBootApplication {

    @GetMapping("/api/healthcheck")
    public String healthCheck() {
        return "ok";
    }

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootApplication.class, args);
	}

}
