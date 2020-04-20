package connection;


import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;



public class DerbyConnectionProducer {

    @Inject
    Logger logger;

    @Produces@Default
    public Connection getConnection() {

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            return DriverManager.getConnection("jdbc:derby://localhost:1527/MyDbJEE7");
        } catch (Exception e) {
           logger.severe("Probléma a JBDC kapcsolat létrehozása közben");
           logger.severe(e.getMessage());
        }

        return null;
    }


}
