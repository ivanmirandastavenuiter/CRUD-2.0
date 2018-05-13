package utils;

/*
 * This class set a default value for database access.
 */


/**
 *
 * @author Iván Miranda
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

  public Connection getConnection()
    throws SQLException {
    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/REDES", "root", "");
  }
}
