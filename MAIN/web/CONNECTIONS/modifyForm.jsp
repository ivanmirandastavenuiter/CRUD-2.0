<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <title>Modify Form</title>  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/modifyFormStyle.css" class="css">
  </head>
  <body>
    
  <%
    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/REDES", "root", "");
    Statement s = connection.createStatement();
    request.setCharacterEncoding("UTF-8");

    String clientCode = request.getParameter("clientCode");
    String serverCode = request.getParameter("serverCode");
    int codeClient = Integer.parseInt(clientCode);
    int codeServer = Integer.parseInt(serverCode);

    ResultSet client = s.executeQuery("SELECT * FROM ENLACE WHERE CodCli = " + codeClient 
    + " AND CodSer = " + codeServer);

    String clients = null;
    String server = null;
    String protocol = null;
    String device = null;
    String link = null;
    String range = null;

    while (client.next()) {
      clients = client.getString("CodCli");
      server = client.getString("CodSer");
      protocol = client.getString("ProEnl");
      device = client.getString("DisEnl");
      link = client.getString("MedEnl");
      range = client.getString("AlcEnl");
  %>
  
  <div class="container-fluid">
  <div class="row content">
    <div class="col-sm-4 sidenav">
      <div class="headers-wrapper">
      <h1>Hey!</h1>
      <h2>We've been told</h2>
      <h3>You want to make some changes...</h3>
    </div>
    <div class="img-container"><img src="images/edit.png"></div>
    </div>

    <div class="col-sm-8">
      <h4><small>MODIFY OPTIONS</small></h4>
      <hr>
      <div class="form-wrapper">
        <h1>MODIFY CONNECTIONS</h1>
        <form class="needs-validation" method="get" novalidate action="modifyQuery.jsp">
          <div class="form-group">
            <label for="code">Client Code</label>
            <input type="text" class="form-control" name="clientCode" value="<%=client.getString("CodCli")%>"  value="<%=client.getString("CodCli")%>" placeholder="<%=clients%>" readonly>
          </div>
          <div class="form-group">
            <label for="name">Server Code</label>
            <input type="text" class="form-control" name="serverCode" value="<%=client.getString("CodSer")%>"  value="<%=client.getString("CodSer")%>" placeholder="<%=server%>" readonly>
            
          </div>
          <div class="form-group">
            <label for="category">Protocol</label>
            <input type="text" class="form-control" name="protocol" placeholder="<%=protocol%>" required>
          </div>
          <div class="form-group">
            <label for="os">Network Device</label>
            <input type="text" class="form-control" name="device" placeholder="<%=device%>" required>
          </div>
          <div class="form-group">
            <label for="nic">Linker</label>
            <input type="text" class="form-control" name="link" placeholder="<%=link%>" required>
          </div>
          <div class="form-group">
            <label for="mac">Range</label>
            <input type="text" class="form-control" name="range" placeholder="<%=range%>" required>
          </div>
          <button type="submit" class="btn btn-secondary">Apply changes</button>
          <a href="connections.jsp"><button type="button" class="btn btn-danger">Back</button></a>
        </form>
      </div>
      </div>
    </div>
  </div>
<footer class="container-fluid">
  <p>BridgeWorming Assignments Co 2018 - All rights reserved.</p>
</footer>

<script>
      (function () {
        'use strict';
        window.addEventListener('load', function () {
          var forms = document.getElementsByClassName('needs-validation');
          var validation = Array.prototype.filter.call(forms, function (form) {
            form.addEventListener('submit', function (event) {
              if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
              }
              form.classList.add('was-validated');
            }, false);
          });
        }, false);
      })();
    </script>
    
  <%  
    }
    connection.close();
  %> 
  
  </body>
</html>
  