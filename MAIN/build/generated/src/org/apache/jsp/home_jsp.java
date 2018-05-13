package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("  <link href=\"SOURCE_2/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"SOURCE_2/vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"SOURCE_2/vendor/simple-line-icons/css/simple-line-icons.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"SOURCE_2/css/landing-page.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"SOURCE_2/style.css\" class=\"css\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>BW Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  ");

    String mainUser = session.getAttribute("username").toString();
    session.setAttribute("mainuser", mainUser);
  
      out.write("  \n");
      out.write("  \n");
      out.write("  <!--Navbar-->\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"home.jsp\">BW Assignments</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Main\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"CLIENTS/clients.jsp\">Clients</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"SERVERS/servers.jsp\">Servers</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"RANGE/range.jsp\">Range</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"CONNECTIONS/connections.jsp\">Connections</a>\n");
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
      out.write("      </ul>\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLinklogout\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Welcome ");
      out.print(mainUser);
      out.write("\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"login.jsp\">Log out</a>\n");
      out.write("        </div>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!--Header-->\n");
      out.write("\n");
      out.write("  <header class=\"masthead text-white text-center\">\n");
      out.write("      <div class=\"overlay\"></div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-xl-9 mx-auto\">\n");
      out.write("            <h1 class=\"mb-5\">Bridgeworming</h1>\n");
      out.write("            <h2 class=\"mb-5\">Because the day is ToDay()</h2>\n");
      out.write("          </div>    \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <!--Spacer-->\n");
      out.write("\n");
      out.write("  <div class=\"hr-spacer\"></div>\n");
      out.write("  <hr>\n");
      out.write("  <div class=\"hr-spacer\"></div>\n");
      out.write("\n");
      out.write("  <!--Main features-->\n");
      out.write("    \n");
      out.write("  <section class=\"showcase\">\n");
      out.write("    <div class=\"container-fluid p-0\">\n");
      out.write("      <div class=\"row no-gutters\">\n");
      out.write("        <div class=\"col-lg-6 order-lg-2 text-white showcase-img\" style=\"background-image: url('SOURCE_2/img/bg-showcase-1.jpg');\"></div>\n");
      out.write("        <div class=\"col-lg-6 order-lg-1 my-auto showcase-text\">\n");
      out.write("          <h2>Never-ending ambition</h2>\n");
      out.write("          <p class=\"lead mb-0\">Our purposes never reach a specific final goal. And the answer to that statement is because we never give up on searching horizons.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row no-gutters\">\n");
      out.write("        <div class=\"col-lg-6 text-white showcase-img\" style=\"background-image: url('SOURCE_2/img/bg-showcase-2.jpg');\"></div>\n");
      out.write("        <div class=\"col-lg-6 my-auto showcase-text\">\n");
      out.write("          <h2>Committed to synergy</h2>\n");
      out.write("          <p class=\"lead mb-0\">Team philosophy is strongly appreciatted and carefully enlightened since the beginning. Every single employee is a crucial piece on the entire gear. That has always lead us to one ending destination: success.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row no-gutters\">\n");
      out.write("        <div class=\"col-lg-6 order-lg-2 text-white showcase-img\" style=\"background-image: url('SOURCE_2/img/bg-showcase-3.jpg');\"></div>\n");
      out.write("        <div class=\"col-lg-6 order-lg-1 my-auto showcase-text\">\n");
      out.write("          <h2>Make it global</h2>\n");
      out.write("          <p class=\"lead mb-0\">More than 1000 offices scattered in 43 different countries all over the world. An average of 30 million customers already know the benefits of our professionalism and dedication. Are you still thinking?</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!--Footer-->\n");
      out.write("\n");
      out.write("  <footer class=\"footer bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12 h-100 text-center text-lg-center my-auto\">   \n");
      out.write("          <p class=\"text-muted small mb-4 mb-lg-0\">&copy; BridgeWorming Co 2018. All Rights Reserved.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <!--Script-->\n");
      out.write("\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
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
