package services;

import numbergenerator.annotations.Digit;
import numbergenerator.annotations.NumberOfDigits;
import numbergenerator.interfaces.NumberGenerator;

import javax.inject.Inject;
import java.sql.Connection;
import java.util.logging.Logger;

public class BookService {

    @Inject
    Logger logger;

    @Inject
    @NumberOfDigits(value = Digit.EIGHT,odd = false)
    NumberGenerator numberGenerator;

    @Inject
    Connection derbyConnection;


    public void kiir() {
        logger.warning("Első warning üzenetem");
       logger.info("AJAJAJA" + numberGenerator.generate());
        logger.warning("Connection is NULL?"+ (derbyConnection == null));
    }
}
