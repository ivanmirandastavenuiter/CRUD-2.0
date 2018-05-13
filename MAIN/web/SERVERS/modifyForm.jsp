<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <title>Modify form</title>
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

    String reference = request.getParameter("code");

    ResultSet server = s.executeQuery("SELECT * FROM SERVIDOR WHERE CodSer = " + reference);

    String code = null;
    String name = null;
    String category = null;
    String system = null;
    String nic = null;
    String mac = null;

    while (server.next()) {
      code = server.getString("CodSer");
      name = server.getString("NomSer");
      category = server.getString("CatSer");
      system = server.getString("SisSer");
      nic = server.getString("NicSer");
      mac = server.getString("MacSer");
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
        <h1>MODIFY SERVER</h1>
        <form method="get" action="modifyQuery.jsp">
          <div class="form-group">
            <label for="code">Code</label>
            <input type="text" class="form-control" name="code" value="<%=server.getString("CodSer")%>" placeholder="<%=code%>" readonly>
          </div>
          <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" name="name" placeholder="<%=name%>" required>         
          </div>
          <div class="form-group">
            <label for="category">Category</label>
            <input type="text" class="form-control" name="category" placeholder="<%=category%>" required>
          </div>
          <div class="form-group">
            <label for="os">OS</label>
            <input type="text" class="form-control" name="system" placeholder="<%=system%>" required>
          </div>
          <div class="form-group">
            <label for="nic">NIC</label>
            <input type="text" class="form-control" name="nic" placeholder="<%=nic%>" required>
          </div>
          <div class="form-group">
            <label for="mac">MAC</label>
            <input type="text" class="form-control" name="mac" placeholder="<%=mac%>" required>
          </div>
          <button type="submit" class="btn btn-secondary">Apply changes</button>
          <a href="servers.jsp"><button type="button" class="btn btn-danger">Back</button></a>
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
  