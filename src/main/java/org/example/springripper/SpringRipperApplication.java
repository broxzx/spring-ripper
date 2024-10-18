package org.example.springripper;

import org.example.springripper.annotations.Quoter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRipperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRipperApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(Quoter quoter) {
        return args -> {
            quoter.sayQuote();
        };
    }

}
