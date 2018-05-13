package org.apache.jsp.CLIENTS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.*;
import utils.*;

public final class findClient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"find_js/jquery.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"find_css/style.css\" class=\"css\">\n");
      out.write("    <title>Find</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("  ");

   
  
      out.write("  \n");
      out.write("  \n");
      out.write("  <!--Navbar-->\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"../home.jsp\">BW Assignments</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"../home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Main\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Clients</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Servers</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Range</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Connections</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Find\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Clients</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Servers</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Statistics\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Total Amount</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Filtered by OS</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLinklogout\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Welcome \n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"../login.jsp\">Log out</a>\n");
      out.write("        </div>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("          <h1>NEVER</h1>\n");
      out.write("          <h2>WAS</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("          <h2>Type in the device you're looking for!</h2>\n");
      out.write("          <form>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"device\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter a valid device\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-secondary\">Search</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm\">\n");
      out.write("          <h1>THAT</h1>\n");
      out.write("          <h2>EASY</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-12\">\n");
      out.write("\n");
      out.write("          <table class=\"table\" id=\"maintable\">\n");
      out.write("            <thead class=\"thead-dark\">\n");
      out.write("              <tr>\n");
      out.write("                <th scope=\"col\">Category</th>\n");
      out.write("                <th scope=\"col\">Name</th>\n");
      out.write("                <th scope=\"col\">OS</th>\n");
      out.write("                <th scope=\"col\">MAC</th>\n");
      out.write("                <th scope=\"col\">Protocol</th>\n");
      out.write("                <th scope=\"col\">Linker</th>\n");
      out.write("                <th scope=\"col\">Range</th>\n");
      out.write("              </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("              ");


                request.setCharacterEncoding("UTF-8");
                String device = request.getParameter("device");
              
      out.write("\n");
      out.write("            <script>\n");
      out.write("              hideTable();\n");
      out.write("            </script>\n");
      out.write("            ");

              if (device != null) {

                DetailsDao _detailsDao = new DetailsDao();
                ArrayList<ClientConnection> _clientConnectionList = new ArrayList<ClientConnection>();
                _clientConnectionList = _detailsDao.getClientConnections(device);
                Iterator<ClientConnection> itrClient = _clientConnectionList.iterator();

                if (!itrClient.hasNext()) {

            
      out.write("\n");
      out.write("            <div class=\"modal fade bd-example-modal-lg\" tabindex=\"-1\" id=\"wrongDevice\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\">\n");
      out.write("              <div class=\"modal-dialog modal-lg\">\n");
      out.write("\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                  <div class=\"modal-header\">\n");
      out.write("                    <h4 class=\"modal-title\">Ouch! Something went wrong...</h4>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"modal-body\">\n");
      out.write("                    <p>Have you entered the right devices? Here you have a reminder.</p>\n");
      out.write("\n");
      out.write("                    <ul class=\"list-group\" style=\"width: min-content;\">\n");
      out.write("                      <li class=\"list-group-item list-group-item-danger\">Móvil</li>\n");
      out.write("                      <li class=\"list-group-item list-group-item-danger\">Portátil</li>\n");
      out.write("                      <li class=\"list-group-item list-group-item-danger\">Sobremesa</li>\n");
      out.write("                      <li class=\"list-group-item list-group-item-danger\">Impresora</li>\n");
      out.write("                      <li class=\"list-group-item list-group-item-danger\">Escáner</li>\n");
      out.write("                      <li class=\"list-group-item list-group-item-danger\">Tablet</li>\n");
      out.write("                    </ul>\n");
      out.write("                     </br>\n");
      out.write("                    <p>If you wanna get them all, <strong>just press enter!</strong></p>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("              $('#wrongDevice').modal('show');\n");
      out.write("            </script>\n");
      out.write("            ");
            } else {

              while (itrClient.hasNext()) {
            
      out.write("\n");
      out.write("            <script>\n");
      out.write("              showTable();\n");
      out.write("            </script>\n");
      out.write("            ");
                    ClientConnection _clientConnection = itrClient.next();
                    out.println("<tr>");
                    out.println("<td>" + _clientConnection.getCategory() + "</td>");
                    out.println("<td>" + _clientConnection.getName() + "</td>");
                    out.println("<td>" + _clientConnection.getOS() + "</td>");
                    out.println("<td>" + _clientConnection.getMac() + "</td>");
                    out.println("<td>" + _clientConnection.getProtocol() + "</td>");
                    out.println("<td>" + _clientConnection.getLinker() + "</td>");
                    out.println("<td>" + _clientConnection.getRange() + "</td>");
                    out.println("</tr>");
                  }
                }
              }

            
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
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
