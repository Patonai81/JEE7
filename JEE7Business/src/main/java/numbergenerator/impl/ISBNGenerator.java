package numbergenerator.impl;

import numbergenerator.annotations.Digit;
import numbergenerator.annotations.NumberOfDigits;
import numbergenerator.interfaces.NumberGenerator;

import javax.inject.Inject;

@NumberOfDigits(value = Digit.EIGHT,odd = false)
public class ISBNGenerator implements NumberGenerator {

    @Inject@EightDigits
    public String isbnString;

    @Inject@EightDigits
    public double generatedValue;

    @Override
    public String generate() {
        return isbnString+" "+generatedValue;
    }
}
