package numbergenerator.impl;


import javax.enterprise.inject.Produces;
import java.util.Random;

public class NumberProducer {

    @Produces
    @EightDigits
    public String isbnString = "isbn String from NumberProducer";

    @Produces
    @EightDigits
    public double randomNumber() {

        return (new Random().nextInt());
    }


}
