<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
  <link href="SOURCE_2/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="SOURCE_2/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <link href="SOURCE_2/vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
  <link href="SOURCE_2/css/landing-page.min.css" rel="stylesheet">
	<link rel="stylesheet" href="SOURCE_2/style.css" class="css">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>BW Home</title>
</head>
<body>
  
  <%
    String mainUser = session.getAttribute("username").toString();
    session.setAttribute("mainuser", mainUser);
  %>  
  
  <!--Navbar-->

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="home.jsp">BW Assignments</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Main
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="CLIENTS/clients.jsp">Clients</a>
          <a class="dropdown-item" href="SERVERS/servers.jsp">Servers</a>
          <a class="dropdown-item" href="RANGE/range.jsp">Range</a>
          <a class="dropdown-item" href="CONNECTIONS/connections.jsp">Connections</a>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Find
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="FIND/findClient.jsp">Clients</a>
          <a class="dropdown-item" href="FIND/findServer.jsp">Servers</a>
          </div>
        </li>
      </ul>
      <ul class="navbar-nav ml-auto">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLinklogout" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Welcome <%=mainUser%>
        </a>
        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="login.jsp">Log out</a>
        </div>
      </ul>
    </div>
  </nav>

  <!--Header-->

  <header class="masthead text-white text-center">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-xl-9 mx-auto">
            <h1 class="mb-5">Bridgeworming</h1>
            <h2 class="mb-5">Because the day is ToDay()</h2>
          </div>    
        </div>
      </div>
  </header>

  <!--Spacer-->

  <div class="hr-spacer"></div>
  <hr>
  <div class="hr-spacer"></div>

  <!--Main features-->
    
  <section class="showcase">
    <div class="container-fluid p-0">
      <div class="row no-gutters">
        <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('SOURCE_2/img/bg-showcase-1.jpg');"></div>
        <div class="col-lg-6 order-lg-1 my-auto showcase-text">
          <h2>Never-ending ambition</h2>
          <p class="lead mb-0">Our purposes never reach a specific final goal. And the answer to that statement is because we never give up on searching horizons.</p>
        </div>
      </div>
      <div class="row no-gutters">
        <div class="col-lg-6 text-white showcase-img" style="background-image: url('SOURCE_2/img/bg-showcase-2.jpg');"></div>
        <div class="col-lg-6 my-auto showcase-text">
          <h2>Committed to synergy</h2>
          <p class="lead mb-0">Team philosophy is strongly appreciatted and carefully enlightened since the beginning. Every single employee is a crucial piece on the entire gear. That has always lead us to one ending destination: success.</p>
        </div>
      </div>
      <div class="row no-gutters">
        <div class="col-lg-6 order-lg-2 text-white showcase-img" style="background-image: url('SOURCE_2/img/bg-showcase-3.jpg');"></div>
        <div class="col-lg-6 order-lg-1 my-auto showcase-text">
          <h2>Make it global</h2>
          <p class="lead mb-0">More than 1000 offices scattered in 43 different countries all over the world. An average of 30 million customers already know the benefits of our professionalism and dedication. Are you still thinking?</p>
        </div>
      </div>
    </div>
  </section>

  <!--Footer-->

  <footer class="footer bg-light">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 h-100 text-center text-lg-center my-auto">   
          <p class="text-muted small mb-4 mb-lg-0">&copy; BridgeWorming Co 2018. All Rights Reserved.</p>
        </div>
      </div>
    </div>
  </footer>

  <!--Script-->

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</body>
</html>