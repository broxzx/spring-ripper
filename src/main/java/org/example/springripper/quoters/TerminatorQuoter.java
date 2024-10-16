package org.example.springripper.quoters;

import jakarta.annotation.PostConstruct;
import lombok.Setter;
import org.example.springripper.annotations.InjectRandomInt;
import org.example.springripper.annotations.PostProxy;
import org.example.springripper.annotations.Profiling;
import org.springframework.stereotype.Component;

@Setter
@Component
@Profiling
public class TerminatorQuoter implements Quoter {

    private String message = "I'll be back";

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
    @PostConstruct
    @PostProxy
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
