package org.apache.jsp.RANGE;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class range_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script defer  src=\"https://use.fontawesome.com/releases/v5.0.8/js/all.js\" integrity=\"sha384-SlE991lGASHoBfWbelyBPLsUlwY1GwNDJo3jSJO04KZ33K2bwfV9YBauFfnzvynJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poiret+One\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("  ");

    Class.forName("com.mysql.jdbc.Driver");
    Connection conexionRange = DriverManager.getConnection("jdbc:mysql://localhost:3306/REDES", "root", "");
    Statement r = conexionRange.createStatement();
    ResultSet range = r.executeQuery("SELECT * FROM ALCANCE");
  
      out.write("\n");
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
      out.write("          <a class=\"dropdown-item\" href=\"../CLIENTS/clients.jsp\">Clients</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"../SERVERS/servers.jsp\">Servers</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"range.jsp\">Range</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"../CONNECTIONS/connections.jsp\">Connections</a>\n");
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
      out.write("    \n");
      out.write("  <!--Main table-->\n");
      out.write("  \n");
      out.write("  <div class=\"range\"><h1>RANGE</h1></div>\n");
      out.write("    <table class=\"table table-hover table-dark\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th scope=\"col\">Range Code</th>\n");
      out.write("          <th scope=\"col\">Name</th>\n");
      out.write("          <th scope=\"col\">Description</th>\n");
      out.write("          <th scope=\"col\"></th>\n");
      out.write("          <th scope=\"col\"></th>\n");
      out.write("          <th scope=\"col\"></th>\n");
      out.write("          <th scope=\"col\">Modify</th>\n");
      out.write("          <th scope=\"col\">Erase</th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("    <tbody>\n");
      out.write("      \n");
      out.write("    ");

      int k = 0;
      while (range.next()) {
        out.println("<tr>");
        out.println("<th scope='row'>" + range.getString("CodAlc") + "</th>");
        out.println("<td>" + range.getString("NomAlc") + "</td>");
        out.println("<td>" + range.getString("DesAlc") + "</td>");
    
      out.write("\n");
      out.write("    \n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td>\n");
      out.write("        <form method=\"get\" action=\"modifyForm.jsp\">\n");
      out.write("          <input type=\"hidden\"  name=\"code\" value=\"");
      out.print(range.getString("CodAlc"));
      out.write("\"/>\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary-one\" >\n");
      out.write("            <i class=\"fas fa-edit\"></i>\n");
      out.write("          </button>\n");
      out.write("        </form>\n");
      out.write("      </td>\n");
      out.write("      <td>        \n");
      out.write("        <button type=\"button\" class=\"btn btn-primary-one\" data-toggle=\"modal\" data-target=\"#rangeModal");
      out.print(k);
      out.write("\">\n");
      out.write("          <i class=\"fa fa-trash\" aria-hidden=\"true\"></i>\n");
      out.write("        </button>\n");
      out.write("        <div id=\"rangeModal");
      out.print(k);
      out.write("\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("          <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <h4 class=\"modal-title\">Warning!</h4>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                <p>This action will erase this range. You sure?</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                <form method=\"get\" action=\"deleteRange.jsp\">\n");
      out.write("                  <input type=\"hidden\" name=\"code\" value=\"");
      out.print(range.getString("CodAlc"));
      out.write("\"/>\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-danger\">Delete</button>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    ");

      k++;
      } // while
      conexionRange.close();
      r.close();
    
      out.write("\n");
      out.write("    \n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  <h1 class=\"formulario\">WANNA ADD SMTH? </h1>\n");
      out.write("  <div class=\"plus-button\">\n");
      out.write("    <button type=\"button\" class=\"btn btn-primary-two\" data-toggle=\"modal\" data-target=\"#goRange\">\n");
      out.write("      <i class=\"fas fa-plus\"></i>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"modal fade\" id=\"goRange\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h4 class=\"modal-title\" id=\"myModalLabel\">\n");
      out.write("              New Range\n");
      out.write("            </h4>\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">\n");
      out.write("              <span aria-hidden=\"true\">&times;</span>\n");
      out.write("              <span class=\"sr-only\">Close</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("            <form role=\"form\" method=\"get\" action=\"addRange.jsp\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"code\">Code</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"codeField\" name=\"code\" placeholder=\"Code\"/>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"nameField\" name=\"name\" placeholder=\"Name\"/>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"description\">Description</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"descriptionField\" name=\"description\" placeholder=\"Description\"/>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">\n");
      out.write("                  Close\n");
      out.write("                </button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                  Save changes\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("    <div class=\"info-logo\">\n");
      out.write("      <img src=\"images/info.png\"/>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main\">\n");
      out.write("       <span><strong>The website located at Bridgeworming.sz is a copyrighted</strong> work belonging to Bridgeworming.  Certain features \n");
      out.write("       of the Site may be subject to additional guidelines, terms, or rules, which will be posted on the Site in connection \n");
      out.write("       with such features.  All such additional terms, guidelines, and rules are incorporated by reference into \n");
      out.write("       <strong>these Terms</strong>.</span>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
