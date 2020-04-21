package services;

import interceptors.Loggable;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

@Transactional
@Loggable
public class DerbyPingService {

    @Inject
    Connection connection;

    @Inject
    Logger logger;


    public void ping() {
        try {
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * from derbydb");
            while (resultSet.next()) {
                logger.warning(resultSet.getString("ADDR"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}