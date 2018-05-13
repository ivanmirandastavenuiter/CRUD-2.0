<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Connections</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script defer  src="https://use.fontawesome.com/releases/v5.0.8/js/all.js" integrity="sha384-SlE991lGASHoBfWbelyBPLsUlwY1GwNDJo3jSJO04KZ33K2bwfV9YBauFfnzvynJ" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link href="https://fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet">
  </head>
  <body>
    
  <%
    String mainUser = session.getAttribute("mainuser").toString();
    session.setAttribute("mainuser", mainUser);
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexionConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/REDES", "root", "");
    Statement e = conexionConnection.createStatement();
    ResultSet net = e.executeQuery("SELECT * FROM ENLACE");
  %>
  
  <!--Navbar-->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="../home.jsp">BW Assignments</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="../home.jsp">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Main
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="../CLIENTS/clients.jsp">Clients</a>
          <a class="dropdown-item" href="../SERVERS/servers.jsp">Servers</a>
          <a class="dropdown-item" href="../RANGE/range.jsp">Range</a>
          <a class="dropdown-item" href="connections.jsp">Connections</a>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Find
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="../FIND/findClient.jsp">Clients</a>
          <a class="dropdown-item" href="../FIND/findServer.jsp">Servers</a>
          </div>
        </li>
        
      </ul>
      <ul class="navbar-nav ml-auto">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLinklogout" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Welcome <%=mainUser%>
        </a>
        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="../login.jsp">Log out</a>
        </div>
      </ul>
    </div>
  </nav>
    
  <!--Main table-->
  
  <div class="connections"><h1>CONNECTIONS</h1></div>
    <table class="table table-hover table-dark">
      <thead>
        <tr>
          <th scope="col">Client Code</th>
          <th scope="col">Server Code</th>
          <th scope="col">Protocol</th>
          <th scope="col">Network Device</th>
          <th scope="col">Linkers</th>
          <th scope="col">Range</th>
          <th scope="col"></th>
          <th scope="col">Modify</th>
          <th scope="col">Erase</th>
        </tr>
      </thead>
      <tbody>
        
      <%
        int l = 0;
        while (net.next()) {
          out.println("<tr>");
          out.println("<th scope='row'>" + net.getString("CodCli") + "</th>");
          out.println("<th scope='row'>" + net.getString("CodSer") + "</th>");
          out.println("<td>" + net.getString("ProEnl") + "</td>");
          out.println("<td>" + net.getString("DisEnl") + "</td>");
          out.println("<td>" + net.getString("MedEnl") + "</td>");
          out.println("<td>" + net.getString("AlcEnl") + "</td>");
      %>
      
        <td></td>
        <td>
          <form method="get" action="modifyForm.jsp">
            <input type="hidden"  name="clientCode" value="<%=net.getString("CodCli")%>"/>
            <input type="hidden"  name="serverCode" value="<%=net.getString("CodSer")%>"/>
            <button type="submit" class="btn btn-primary-one" >
              <i class="fas fa-edit"></i>
            </button>
          </form>
        </td>
        <td>        
          <button type="button" class="btn btn-primary-one" data-toggle="modal" data-target="#connectionsModal<%=l%>">
            <i class="fa fa-trash" aria-hidden="true"></i>
          </button>
            <div id="connectionsModal<%=l%>" class="modal fade" role="dialog">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h4 class="modal-title">Warning!</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                  </div>
                  <div class="modal-body">
                    <p>This action will erase this connection. You sure?</p>
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <form method="get" action="deleteConnection.jsp">
                      <input type="hidden" name="clientCode" value="<%=net.getString("CodCli")%>"/>
                      <input type="hidden"  name="serverCode" value="<%=net.getString("CodSer")%>"/>
                      <button type="submit" class="btn btn-danger">Delete</button>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </td>
        </tr>
      
        <%
          l++;
          } // while
          conexionConnection.close();
          e.close();
        %>
        
      </tbody>
    </table>
    <h1 class="formulario">WANNA ADD SMTH? </h1>
    <div class="plus-button">
      <button type="button" class="btn btn-primary-two" data-toggle="modal" data-target="#goConnections">
        <i class="fas fa-plus"></i>
      </button>
      <div class="modal fade" id="goConnections" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title" id="myModalLabel">
                New Connection
              </h4>
              <button type="button" class="close" data-dismiss="modal">
                <span aria-hidden="true">&times;</span>
                <span class="sr-only">Close</span>
              </button>
            </div>
            <div class="modal-body">
              <form role="form" method="get" action="addConnection.jsp">
                <div class="form-group">
                  <label for="clientCode">Client code</label>
                  <input type="text" class="form-control" id="clientField" name="clientCode" placeholder="Client code"/>
                </div>
                <div class="form-group">
                  <label for="serverCode">Server code</label>
                    <input type="text" class="form-control" id="serverField" name="serverCode" placeholder="Server code"/>
                </div>
                <div class="form-group">
                  <label for="protocol">Protocol</label>
                  <input type="text" class="form-control" id="protocolField" name="protocol" placeholder="Protocol"/>
                </div>
                <div class="form-group">
                  <label for="device">Network device</label>
                  <input type="text" class="form-control" id="networkField" name="device" placeholder="Network Device"/>
                </div>
                <div class="form-group">
                  <label for="link">Linker</label>
                    <input type="text" class="form-control" id="linkField" name="link" placeholder="Linker"/>
                </div>
                <div class="form-group">
                  <label for="range">Range</label>
                  <input type="text" class="form-control" id="rangeField" name="range" placeholder="Range"/>
                </div>
                <div class="form-group">
                  <button type="button" class="btn btn-default" data-dismiss="modal">
                    Close
                  </button>
                  <button type="submit" class="btn btn-primary">
                    Save changes
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
    <hr>
    <div class="info-logo">
      <img src="images/info.png"/>
    </div>
    <div class="main">
       <span><strong>The website located at Bridgeworming.sz is a copyrighted</strong> work belonging to Bridgeworming.  Certain features 
       of the Site may be subject to additional guidelines, terms, or rules, which will be posted on the Site in connection 
       with such features.  All such additional terms, guidelines, and rules are incorporated by reference into 
       <strong>these Terms</strong>.</span>
    </div>
  </body>
</html>
