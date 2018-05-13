package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>BW Login</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"SOURCE_1/images/icons/favicon.ico\"/>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/vendor/animate/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/vendor/select2/select2.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"SOURCE_1/css/main.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  ");

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
  
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-login100\" style=\"background-image: url('SOURCE_1/images/greenbridge.jpg');\">\n");
      out.write("\t\t\t<div class=\"wrap-login100 p-t-190 p-b-30\">\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form\" onsubmit=\"return validateUser() && validatePassword()\">\n");
      out.write("\t\t\t\t\t<div class=\"login100-form-avatar\">\n");
      out.write("\t\t\t\t\t\t<img src=\"SOURCE_1/images/man-user.png\" alt=\"AVATAR\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title p-t-20 p-b-45\">\n");
      out.write("\t\t\t\t\t\tLOGIN\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Username is required\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"username\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Password is required\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-lock\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"container-login100-form-btn p-t-10\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"text-center w-full p-t-25 p-b-230\">\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger collapse\" id=\"wrongUser\" role=\"alert\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">&times;</span>\n");
      out.write("              </button>\n");
      out.write("            <strong>Oh god damn it!!</strong> User is not valid.\n");
      out.write("          </div>\n");
      out.write("          <div class=\"alert alert-danger collapse\" id=\"wrongPass\" role=\"alert\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">&times;</span>\n");
      out.write("            </button>\n");
      out.write("            <strong>Oh god damn it!!</strong> Password is not correct.\n");
      out.write("          </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"text-center w-full\">\n");
      out.write("\t\t\t\t\t\t<a class=\"txt1\" href=\"register.jsp\">\n");
      out.write("\t\t\t\t\t\t\tCreate new account\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-long-arrow-right\"></i>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    \n");
      out.write("  ");
  
    request.setCharacterEncoding("UTF-8");

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null) {
  
      out.write("\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("    \n");
      out.write("    /* \n");
      out.write("      Two validation js functions are created here \n");
      out.write("    */\n");
      out.write("   \n");
      out.write("    function validateUser() {\n");
      out.write("      var userChecked = true;\n");
      out.write("      \n");
      out.write("    function validatePassword() {\n");
      out.write("      var passChecked = true;\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");
     
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
  
      out.write("\n");
      out.write("    \n");
      out.write("  <script>\n");
      out.write("    $('#wrongPass').show();\n");
      out.write("    passChecked = false;\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");
 
    }
  
      out.write("\n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("    return passChecked;\n");
      out.write("   }\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");
 
    } else {

    /* 
      NOT VALIDATED USER
      Now takes place the userChecked bool to false when user is not found.
    */
  
      out.write("\n");
      out.write("    \n");
      out.write("  <script>\n");
      out.write("    $('#wrongUser').show();\n");
      out.write("    userChecked = false;\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");

    }
  
      out.write(" \n");
      out.write("  \n");
      out.write("  <script>\n");
      out.write("    return userChecked;\n");
      out.write("  }\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");

    }
  
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"SOURCE_1/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"SOURCE_1/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"SOURCE_1/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"SOURCE_1/vendor/select2/select2.min.js\"></script>\n");
      out.write("\t<script src=\"SOURCE_1/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
