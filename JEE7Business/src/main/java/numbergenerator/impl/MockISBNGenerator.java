package numbergenerator.impl;

import numbergenerator.annotations.Digit;
import numbergenerator.annotations.NumberOfDigits;
import numbergenerator.interfaces.NumberGenerator;

import javax.enterprise.inject.Alternative;

@Alternative@NumberOfDigits(value = Digit.EIGHT,odd = false)
public class MockISBNGenerator implements NumberGenerator {
    @Override
    public String generate() {
        return "Mock implementation";
    }
}
