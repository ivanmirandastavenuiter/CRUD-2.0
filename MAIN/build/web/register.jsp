<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>BW New Account</title>
	<meta charset="UTF-8">
	<link rel="icon" type="image/png" href="SOURCE_1/images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="SOURCE_1/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="SOURCE_1/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="SOURCE_1/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="SOURCE_1/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="SOURCE_1/vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="SOURCE_1/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="SOURCE_1/css/util.css">
	<link rel="stylesheet" type="text/css" href="SOURCE_1/css/main.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
  
  <%
    /* 
      Now, at first, we make the same operation: set values. This will be cyclic,
      knowing that parameter will be send from one page to another and so on.
    */
    
    HashMap<String, String> credentialsTo = (HashMap)session.getAttribute("credentialsFrom");

    boolean newUser = true;
    boolean passConfirmed = true;
  %> 
  
  <div class="row">
    <div class="col" style="background-color: rgb(6,22,64);">
      <div class="wrap-login100 p-t-190 p-b-30" style="margin: 0 auto; padding-top:50px;">
				<form class="login100-form validate-form">
					
					<h1 style="color:white; text-align: center; padding:30px; font-family: Montserrat-Regular, sans-serif;"> You're about being part of Bridgeworming </h1>

					<div class="wrap-input100 validate-input m-b-10" data-validate = "Username is required">
						<input class="input100" type="text" name="username" placeholder="Username">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-user"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
						<input class="input100" type="password" name="password" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-10" data-validate = "Hey! Needs to be confirmed!">
						<input class="input100" type="password" name="confirm" placeholder="Confirm Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock"></i>
						</span>
					</div>
          
  <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String confirm = request.getParameter("confirm");
    
    /* 
      We check the username data introduce against "credentialsTo" hashmap.
    */

    if (username != null && password != null) {
      if (credentialsTo.containsKey(username)) {
        newUser = false;
      }

      if (!newUser) {
  %>
  
  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Error</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="modal-body">
          Sorry. User already exists.
        </div>
        <div class="modal-footer"> 
          <button type="button" class="btn btn-primary" data-dismiss="modal">Return</button>
        </div>
      </div>
    </div>
  </div>
  <script>
    $('#exampleModal').modal('show');
  </script>
  
  <%
    } else {
        if(password.equals(confirm.toString())) {
          credentialsTo.put(username, password); 

      /* 
        Double verification of password confirmation and new user.
      */      
  %>
     
  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Success</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          User has been saved successfully.
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            <a href="login.jsp" type="button" class="btn btn-primary">Back to login</a>
          </div>
      </div>
    </div>
  </div>
  <script>
    $('#exampleModal').modal('show');
  </script>
  
  <%
   } else { 
  %>
  
  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Error</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          Hey! Passwords don't match!
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-primary" data-dismiss="modal">Return</button>
        </div>
      </div>
    </div>
  </div>
  <script>
    $('#exampleModal').modal('show');
  </script>

  <%
      } // Confirmed/Not Confirmed if/else
    } // Valid User/Not Valid User if/else
  } // Container if/else
  %>

          <div class="container-login100-form-btn p-t-10">
            <button class="login100-form-btn">
              Create account
            </button>
          </div>

          <div class="text-center w-full p-t-25 p-b-230">
          </div>

          <div class="text-center w-full">
            <a class="txt1" href="login.jsp">
              Back
              <i class="fa fa-long-arrow-right"></i>						
            </a>
          </div>
        </form>
			</div>
    </div>
   <div class="col" style="background-image:  url('SOURCE_1/images/sky.jpg');">
   </div>
  </div>
  
  <%session.setAttribute("credentialsUpdated", credentialsTo);%>

	<script src="SOURCE_1/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="SOURCE_1/vendor/bootstrap/js/popper.js"></script>
	<script src="SOURCE_1/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="SOURCE_1/vendor/select2/select2.min.js"></script>
	<script src="SOURCE_1/js/main.js"></script>
</body>
</html>