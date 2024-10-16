package org.example.springripper.quoters;

import jakarta.annotation.PostConstruct;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Component
public class TerminatorQuoter implements Quoter {

    private String message;

    @InjectRandomInt(from = 1, to = 10)
    private int repeat;

    @PostConstruct
    public void setUp() {
        System.out.println("Phase 2");
        System.out.println("repeat = " + repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
