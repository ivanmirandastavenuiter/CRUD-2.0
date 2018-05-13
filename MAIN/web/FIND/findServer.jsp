<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page import="utils.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <script src="find_js/jquery.js"></script>
    <link rel="stylesheet" href="find_css/new_style.css" class="css">
    <title>Find</title>
  </head>
  <body>
    
    <%
   String mainUser = session.getAttribute("mainuser").toString();
    session.setAttribute("mainuser", mainUser);
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
          <a class="dropdown-item" href="../CONNECTIONS/connections.jsp">Connections</a>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Find
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="findClient.jsp">Clients</a>
          <a class="dropdown-item" href="findServer.jsp">Servers</a>
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
    
  <!--Main divs-->  

  <div class="container-fluid">
    <div class="row">
      <div class="col-sm">
        <h1>NEVER</h1>
        <h2>WAS</h2>
      </div>
      <div class="col-sm-6">
        <h2>Type in the server you're looking for!</h2>
        <form>
          <input type="text" class="form-control" name="server" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter a valid server">
          <button type="submit" class="btn btn-secondary">Search</button>
        </form>
      </div>
      <div class="col-sm">
        <h1>THAT</h1>
        <h2>EASY</h2>
      </div>
    </div>
    <div class="row">
      <div class="col-sm-12">
        <table class="table" id="maintable">
          <thead class="thead-dark">
            <tr>
              <th scope="col">Category</th>
              <th scope="col">Name</th>
              <th scope="col">OS</th>
              <th scope="col">MAC</th>
              <th scope="col">Protocol</th>
              <th scope="col">Linker</th>
              <th scope="col">Range</th>
            </tr>
          </thead>
          <tbody>

          <%
            request.setCharacterEncoding("UTF-8");
            String server = request.getParameter("server");
          %>
          
          <!--While null, main table will be hidden by javascript functions-->
          
          <script>
            hideTable();
          </script>
          
          <%
            if (server != null) {

            DetailsDao _detailsDao = new DetailsDao();
            ArrayList<ServerConnection> _serverConnectionList = new ArrayList<ServerConnection>();
            _serverConnectionList = _detailsDao.getServerConnections(server);
            Iterator<ServerConnection> itrServer = _serverConnectionList.iterator();

            if (!itrServer.hasNext()) {
          %>
          
          <div class="modal fade bd-example-modal-lg" tabindex="-1" id="wrongServer" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
              <div class="modal-content">
                <div class="modal-header">
                  <h4 class="modal-title">Ouch! Something went wrong...</h4>
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <div class="modal-body">
                  <p>Have you entered the right servers? Here you have a reminder.</p>
                  
                    <ul class="list-group" style="width: min-content;">
                      <li class="list-group-item list-group-item-danger">Proxy</li>
                      <li class="list-group-item list-group-item-danger">Dedicado</li>
                      <li class="list-group-item list-group-item-danger">Correo electrónico</li>
                      <li class="list-group-item list-group-item-danger">Web</li>
                      <li class="list-group-item list-group-item-danger">Seguridad</li>
                      <li class="list-group-item list-group-item-danger">Acceso remoto</li>
                      <li class="list-group-item list-group-item-danger">Archivos</li>
                    </ul>
                  
                    </br>
                    <p>If you wanna get them all, <strong>just press enter!</strong></p>

                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
              </div>
            </div>
          </div>
          <script>
            $('#wrongServer').modal('show');
          </script>
          
          <%            
            } else {
              while (itrServer.hasNext()) {
          %>
          
          <!--Otherwise, table will be shown-->
          
          <script>
            showTable();
          </script>
          
          <%          
            ServerConnection _serverConnection = itrServer.next();
            out.println("<tr>");
            out.println("<td>" + _serverConnection.getCategory() + "</td>");
            out.println("<td>" + _serverConnection.getName() + "</td>");
            out.println("<td>" + _serverConnection.getOS() + "</td>");
            out.println("<td>" + _serverConnection.getMac() + "</td>");
            out.println("<td>" + _serverConnection.getProtocol() + "</td>");
            out.println("<td>" + _serverConnection.getLinker() + "</td>");
            out.println("<td>" + _serverConnection.getRange() + "</td>");
            out.println("</tr>");
            }
           }
          }
          %>
          
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </body>
</html>