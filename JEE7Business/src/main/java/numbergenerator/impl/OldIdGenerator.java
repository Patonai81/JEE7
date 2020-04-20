package numbergenerator.impl;

import numbergenerator.annotations.Digit;
import numbergenerator.annotations.NumberOfDigits;
import numbergenerator.interfaces.NumberGenerator;

import java.util.Random;

@NineDigits@NumberOfDigits(value = Digit.TEN,odd = true)
public class OldIdGenerator implements NumberGenerator {

    @Override
    public String generate() {
        return Math.abs(new Random().nextInt()) + " OldIdGenerator";
    }
}




