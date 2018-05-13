package org.apache.jsp.CLIENTS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("    .row.content {height: 900px}\n");
      out.write("    \n");
      out.write("    .sidenav {\n");
      out.write("      background-color: #f1f1f1;\n");
      out.write("      height: 100%;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    footer {\n");
      out.write("      background-color: #555;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    @media screen and (max-width: 767px) {\n");
      out.write("      .sidenav {\n");
      out.write("        height: auto;\n");
      out.write("        padding: 15px;\n");
      out.write("      }\n");
      out.write("      .row.content {height: auto;} \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .headers-wrapper {\n");
      out.write("\n");
      out.write("      width:350px;\n");
      out.write("      margin:0 auto;\n");
      out.write("      margin-top:80px;\n");
      out.write("      padding:30px;\n");
      out.write("      border-radius: 30px;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .img-container {\n");
      out.write("      margin:0 auto;\n");
      out.write("      text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    body {\n");
      out.write("      font-family: 'Montserrat', sans-serif;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("     .form-wrapper {\n");
      out.write("      width:500px;\n");
      out.write("      margin:0 auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    .col-sm-8 h1 {\n");
      out.write("      text-align: center;\n");
      out.write("      margin-bottom:30px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-control:focus, .form-control{\n");
      out.write("\n");
      out.write("    -webkit-box-shadow: none;\n");
      out.write("    box-shadow: 0;\n");
      out.write("    border:none;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .form-control:focus {\n");
      out.write("    border-bottom:1px solid #ba0909;\n");
      out.write("    border-radius:0;\n");
      out.write("   }\n");
      out.write("  \n");
      out.write("  ::-webkit-input-placeholder { \n");
      out.write("    direction: rtl;\n");
      out.write("}\n");
      out.write(".btn {\n");
      out.write("  margin-left:10px;\n");
      out.write("  margin-top:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  \n");
      out.write("  ");

    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/REDES", "root", "");
    Statement s = connection.createStatement();
    request.setCharacterEncoding("UTF-8");

    String reference = request.getParameter("code");

    ResultSet client = s.executeQuery("SELECT * FROM CLIENTE WHERE CodCli = " + reference);

    String code = null;
    String name = null;
    String category = null;
    String system = null;
    String nic = null;
    String mac = null;

    while (client.next()) {
      code = client.getString("CodCli");
      name = client.getString("NomCli");
      category = client.getString("CatCli");
      system = client.getString("SisCli");
      nic = client.getString("NicCli");
      mac = client.getString("MacCli");
  
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("  <div class=\"row content\">\n");
      out.write("    <div class=\"col-sm-4 sidenav\">\n");
      out.write("      <div class=\"headers-wrapper\">\n");
      out.write("      <h1>Hey!</h1>\n");
      out.write("      <h2>We've been told</h2>\n");
      out.write("      <h3>You want to make some changes...</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"img-container\"><img src=\"edit.png\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("      <h4><small>MODIFY OPTIONS</small></h4>\n");
      out.write("      <hr>\n");
      out.write("      <div class=\"form-wrapper\">\n");
      out.write("        <h1>MODIFY CLIENT</h1>\n");
      out.write("        <form class=\"needs-validation\" method=\"get\" novalidate action=\"modifyQuery.jsp\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"code\">Code</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"code\" value=\"");
      out.print(client.getString("CodCli"));
      out.write("\" placeholder=\"");
      out.print(code);
      out.write("\" readonly>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"name\">Name</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"");
      out.print(name);
      out.write("\" required>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"category\">Category</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"category\" placeholder=\"");
      out.print(category);
      out.write("\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"os\">OS</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"system\" placeholder=\"");
      out.print(system);
      out.write("\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"nic\">NIC</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"nic\" placeholder=\"");
      out.print(nic);
      out.write("\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"mac\">MAC</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"mac\" placeholder=\"");
      out.print(mac);
      out.write("\" required>\n");
      out.write("          </div>\n");
      out.write("          <button type=\"submit\" class=\"btn btn-secondary\">Apply changes</button>\n");
      out.write("          <button type=\"button\" class=\"btn btn-danger\">Back</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid\">\n");
      out.write("  <p>BridgeWorming Assignments Co 2018 - All rights reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("      (function () {\n");
      out.write("        'use strict';\n");
      out.write("        window.addEventListener('load', function () {\n");
      out.write("          var forms = document.getElementsByClassName('needs-validation');\n");
      out.write("          var validation = Array.prototype.filter.call(forms, function (form) {\n");
      out.write("            form.addEventListener('submit', function (event) {\n");
      out.write("              if (form.checkValidity() === false) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                event.stopPropagation();\n");
      out.write("              }\n");
      out.write("              form.classList.add('was-validated');\n");
      out.write("            }, false);\n");
      out.write("          });\n");
      out.write("        }, false);\n");
      out.write("      })();\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("  ");
  
    }
    connection.close();
  
      out.write(" \n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("  ");
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
