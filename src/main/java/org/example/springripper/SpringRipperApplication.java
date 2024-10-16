package org.example.springripper;

import org.example.springripper.quoters.Quoter;
import org.example.springripper.quoters.TerminatorQuoter;
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
