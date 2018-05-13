package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>BW New Account</title>\n");
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
      Now, at first, we make the same operation: set values. This will be cyclic,
      knowing that parameter will be send from one page to another and so on.
    */
    
    HashMap<String, String> credentialsTo = (HashMap)session.getAttribute("credentialsFrom");

    boolean newUser = true;
    boolean passConfirmed = true;
  
      out.write(" \n");
      out.write("  \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col\" style=\"background-color: rgb(6,22,64);\">\n");
      out.write("      <div class=\"wrap-login100 p-t-190 p-b-30\" style=\"margin: 0 auto; padding-top:50px;\">\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h1 style=\"color:white; text-align: center; padding:30px; font-family: Montserrat-Regular, sans-serif;\"> You're about being part of Bridgeworming </h1>\n");
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
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-10\" data-validate = \"Hey! Needs to be confirmed!\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"password\" name=\"confirm\" placeholder=\"Confirm Password\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"symbol-input100\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-lock\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("          \n");
      out.write("  ");

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
  
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Error</h5>\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">&times;</span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          Sorry. User already exists.\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\"> \n");
      out.write("          <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Return</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script>\n");
      out.write("    $('#exampleModal').modal('show');\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");

    } else {
        if(password.equals(confirm.toString())) {
          credentialsTo.put(username, password); 

      /* 
        Double verification of password confirmation and new user.
      */      
  
      out.write("\n");
      out.write("     \n");
      out.write("  <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Success</h5>\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          User has been saved successfully.\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("            <a href=\"login.jsp\" type=\"button\" class=\"btn btn-primary\">Back to login</a>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script>\n");
      out.write("    $('#exampleModal').modal('show');\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  ");

   } else { 
  
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Error</h5>\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          Hey! Passwords don't match!\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Return</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script>\n");
      out.write("    $('#exampleModal').modal('show');\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("  ");

      } // Confirmed/Not Confirmed if/else
    } // Valid User/Not Valid User if/else
  } // Container if/else
  
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"container-login100-form-btn p-t-10\">\n");
      out.write("            <button class=\"login100-form-btn\">\n");
      out.write("              Create account\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"text-center w-full p-t-25 p-b-230\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"text-center w-full\">\n");
      out.write("            <a class=\"txt1\" href=\"login.jsp\">\n");
      out.write("              Back\n");
      out.write("              <i class=\"fa fa-long-arrow-right\"></i>\t\t\t\t\t\t\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("    </div>\n");
      out.write("   <div class=\"col\" style=\"background-image:  url('SOURCE_1/images/sky.jpg');\">\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  ");
session.setAttribute("credentialsUpdated", credentialsTo);
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
