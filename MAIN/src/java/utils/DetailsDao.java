package utils;

/*
 * DAO Object. This class interacts directly with the database.
 */

/**
 *
 * @author Iván Miranda
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DetailsDao {

  private Connection connection;

  public DetailsDao() {

    ConnectionClass conn = new ConnectionClass();

    try {
      connection = conn.getConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public ArrayList<ClientConnection> getClientConnections(String device) throws SQLException {
    
    String query = " SELECT NOMCLI, CATCLI, SISCLI, MACCLI, PROENL, MEDENL, DESALC \n"
      + " FROM CLIENTE C JOIN ENLACE E \n"
      + " ON C.CODCLI = E.CODCLI \n"
      + " JOIN ALCANCE A \n"
      + " ON A.CODALC = E.ALCENL \n"
      + " WHERE LOWER(CATCLI) LIKE '%" + device.toLowerCase() + "' COLLATE utf8_general_ci  \n" 
      + " ORDER BY 1 ";
    
    ArrayList<ClientConnection> clientConnectionList = new ArrayList<ClientConnection>();
    Statement stm = connection.createStatement();
    ResultSet res = stm.executeQuery(query);

    while (res.next()) {
      ClientConnection _clientConnection = new ClientConnection();
      _clientConnection.setName(res.getString("NOMCLI"));
      _clientConnection.setCategory(res.getString("CATCLI"));
      _clientConnection.setOS(res.getString("SISCLI"));
      _clientConnection.setMac(res.getString("MACCLI"));
      _clientConnection.setProtocol(res.getString("PROENL"));
      _clientConnection.setLinker(res.getString("MEDENL"));
      _clientConnection.setRange(res.getString("DESALC"));
      clientConnectionList.add(_clientConnection);
    }
    return clientConnectionList;
  }
  
  public ArrayList<ServerConnection> getServerConnections(String server) throws SQLException {
    
    String query = " SELECT NOMSER, CATSER, SISSER, MACSER, PROENL, MEDENL, DESALC \n"
      + " FROM SERVIDOR S JOIN ENLACE E \n"
      + " ON S.CODSER = E.CODSER \n"
      + " JOIN ALCANCE A \n"
      + " ON A.CODALC = E.ALCENL \n"
      + " WHERE LOWER(CATSER) LIKE '%" + server.toLowerCase() + "' COLLATE utf8_general_ci  \n" 
      + " ORDER BY 1 ";
    
    ArrayList<ServerConnection> serverConnectionList = new ArrayList<ServerConnection>();
    Statement stm = connection.createStatement();
    ResultSet res = stm.executeQuery(query);
    
    while (res.next()) {
      ServerConnection _serverConnection = new ServerConnection();
      _serverConnection.setName(res.getString("NOMSER"));
      _serverConnection.setCategory(res.getString("CATSER"));
      _serverConnection.setOS(res.getString("SISSER"));
      _serverConnection.setMac(res.getString("MACSER"));
      _serverConnection.setProtocol(res.getString("PROENL"));
      _serverConnection.setLinker(res.getString("MEDENL"));
      _serverConnection.setRange(res.getString("DESALC"));
      serverConnectionList.add(_serverConnection);
    }
    return serverConnectionList;
  }
}

