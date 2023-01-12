package com.example.fizzbuzzclr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class FizzbuzzClrApplication {

    @Bean
    public CommandLineRunner run() {
        return args -> {
            for (int i = 1; i < 101; i++) {

                String fizzbuzz = "";

                fizzbuzz += (i%3==0) ? "Fizz" : "";
                fizzbuzz += (i%5==0) ? "Buzz" : "";

                System.out.println(!fizzbuzz.isEmpty() ? i + ":" + fizzbuzz : i);

            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(FizzbuzzClrApplication.class, args);
    }

}
