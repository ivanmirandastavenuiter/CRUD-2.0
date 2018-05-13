<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <title>Modification result</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/modifyQueryStyle.css" class="css"
  </head>
  <body>
    
    <style>
     .row.content {height: 900px}
    </style>
    
  <%
    request.setCharacterEncoding("UTF-8");
    String reference = request.getParameter("code");
    String name = request.getParameter("name");
    String category = request.getParameter("category");
    String system = request.getParameter("system");
    String nic = request.getParameter("nic");
    String mac = request.getParameter("mac");

    if (reference != null) {
      Connection connection = null;
      PreparedStatement ps = null;
        int code = Integer.parseInt(reference);

        try {
          Class.forName("com.mysql.jdbc.Driver");
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/REDES", "root", "");
          String sql = "Update servidor set NomSer=?,CatSer=?,SisSer=?,NicSer=?,MacSer=? where CodSer =" + code;
          ps = connection.prepareStatement(sql);
          ps.setString(1, name);
          ps.setString(2, category);
          ps.setString(3, system);
          ps.setString(4, nic);
          ps.setString(5, mac);
          int i = ps.executeUpdate();

          if (i > 0) {
  %>
  
  <div class="container-fluid">
    <div class="row content">
      <div class="col-sm-7 sidenav">
        <div class="jumbotron jumbotron-fluid">
          <div class="container">
          <h1 class="display-4">You did it well, buddy!!!</h1>
          <p class="lead">The server has been successfully updated</p>
          </div>
        </div>
      <div class="btn-dark-wrapper">
        <a href="servers.jsp"><button type="button" class="btn btn-danger">I wanna go back</button></a>
      </div>
      </div>
      <div class="col-sm-5">
        <div class="circle-wrapper">
          <div class="circle">
            Ou yes!!!
          </div>
        </div>
        <div class="btn-danger-wrapper">
          <a href="../home.jsp"><button type="button" class="btn btn-danger">I want to get home</button></a>
        </div>
      </div>
    </div>
  </div>
  <footer class="container-fluid">
    <p>BridgeWorming Assignments Co 2018 - All rights reserved.</p>
  </footer>
    
  <%
          } else {
  %>
  
    <div class="container-fluid">
    <div class="row content">
      <div class="col-sm-7 sidenav">
        <div class="jumbotron jumbotron-fluid">
          <div class="container">
            <h1 class="display-4">Whops!!! Something went wrong...</h1>
            <p class="lead">The operation has not been executed</p>  
          </div>
        </div>
        <div><p>You can get a hint here: <%out.println(sql);%></p></div>
        <div class="btn-dark-wrapper">
          <a href="servers.jsp"><button type="button" class="btn btn-danger" style="margin-top:-100px;">I wanna go back</button></a>
        </div>
      </div>
      <div class="col-sm-5">
        <div class="circle-wrapper">
          <div class="circle">
            Oh no!!!
          </div>
        </div>
        <div class="btn-danger-wrapper">
          <a href="../home.jsp"><button type="button" class="btn btn-danger">I want to get home</button></a>
        </div>
      </div>
    </div>
  </div>
  <footer class="container-fluid">
    <p>BridgeWorming Assignments Co 2018 - All rights reserved.</p>
  </footer>
    
  <%
        }
      } catch (SQLException sql) {
          request.setAttribute("error", sql);
  %>
  
   <div class="container-fluid">
    <div class="row content">
      <div class="col-sm-7 sidenav">
        <div class="jumbotron jumbotron-fluid">
          <div class="container">
            <h1 class="display-4">Whops!!! Something went wrong...</h1>
            <p class="lead">The operation has not been executed</p>  
          </div>
        </div>
        <div><p>You can get a hint here: <%out.println(sql);%></p></div>
        <div class="btn-dark-wrapper">
          <a href="servers.jsp"><button type="button" class="btn btn-danger" style="margin-top:-100px;">I wanna go back</button></a>
        </div>
      </div>
      <div class="col-sm-5">
        <div class="circle-wrapper">
          <div class="circle">
            Oh no!!!
          </div>
        </div>
        <div class="btn-danger-wrapper">
          <a href="../home.jsp"><button type="button" class="btn btn-danger">I want to get home</button></a>
        </div>
      </div>
    </div>
  </div>
  <footer class="container-fluid">
    <p>BridgeWorming Assignments Co 2018 - All rights reserved.</p>
  </footer>
        
  <%
        } finally {
            if (connection != null) {
              connection.close();
            }
          }
        }
  %> 
  </body>
</html>