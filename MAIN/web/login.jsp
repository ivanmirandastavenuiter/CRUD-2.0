<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>BW Login</title>
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
      First step is setting initial hashmap variables that will work as user 
      and passwords.
    */
    
    HashMap<String, String> credentialsFrom = (HashMap)session.getAttribute("credentialsUpdated");
    
    /* 
      We receive the data from register page to set passwords database. In case of
      first time, we move on directly to default values, giving standart functionality
      with three predifined users.
    */
     
    if (credentialsFrom == null) {
      
      credentialsFrom = new HashMap<String, String>();

      credentialsFrom.put("ivan", "ivan");
      credentialsFrom.put("carlos", "carlos");
      credentialsFrom.put("david", "david");
    }
    
    /* 
      Here we send the hashmap values to the register page, that will take it 
      as a backup database where will compare inserted information.
    */

    session.setAttribute("credentialsFrom", credentialsFrom);
  %>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('SOURCE_1/images/greenbridge.jpg');">
			<div class="wrap-login100 p-t-190 p-b-30">
				<form class="login100-form validate-form" onsubmit="return validateUser() && validatePassword()">
					<div class="login100-form-avatar">
						<img src="SOURCE_1/images/man-user.png" alt="AVATAR">
					</div>

					<span class="login100-form-title p-t-20 p-b-45">
						LOGIN
					</span>

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

					<div class="container-login100-form-btn p-t-10">
						<button type="submit" class="login100-form-btn">
							Login
						</button>
					</div>

					<div class="text-center w-full p-t-25 p-b-230">
					<div class="alert alert-danger collapse" id="wrongUser" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
              <span aria-hidden="true">&times;</span>
              </button>
            <strong>Oh god damn it!!</strong> User is not valid.
          </div>
          <div class="alert alert-danger collapse" id="wrongPass" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
            <strong>Oh god damn it!!</strong> Password is not correct.
          </div>
					</div>

					<div class="text-center w-full">
						<a class="txt1" href="register.jsp">
							Create new account
							<i class="fa fa-long-arrow-right"></i>						
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
    
  <%  
    request.setCharacterEncoding("UTF-8");

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null) {
  %>
  
  <script>
    
    /* 
      Two validation js functions are created here 
    */
   
    function validateUser() {
      var userChecked = true;
      
    function validatePassword() {
      var passChecked = true;
  </script>
  
  <%     
    if (credentialsFrom.containsKey(username)) {
      if (password.equals(credentialsFrom.get(username))) {
        
      /* 
      VALIDATED USER
      Correct one.
      */  
        
         session.setAttribute("username",username);
         response.sendRedirect("home.jsp");
      } else {
        
      /* 
      Wrong one. These brackets will hold the bool javascript change to false.
      */          
  %>
    
  <script>
    $('#wrongPass').show();
    passChecked = false;
  </script>
  
  <% 
    }
  %>
  
  <script>
    return passChecked;
   }
  </script>
  
  <% 
    } else {

    /* 
      NOT VALIDATED USER
      Now takes place the userChecked bool to false when user is not found.
    */
  %>
    
  <script>
    $('#wrongUser').show();
    userChecked = false;
  </script>
  
  <%
    }
  %> 
  
  <script>
    return userChecked;
  }
  </script>
  
  <%
    }
  %>

	<script src="SOURCE_1/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="SOURCE_1/vendor/bootstrap/js/popper.js"></script>
	<script src="SOURCE_1/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="SOURCE_1/vendor/select2/select2.min.js"></script>
	<script src="SOURCE_1/js/main.js"></script>
</body>
</html>