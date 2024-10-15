package org.example.springripper.quoters;

import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Component
public class TerminatorQuoter implements Quoter {

    private String message;

    @InjectRandomInt(from = 1, to = 10)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
