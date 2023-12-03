/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2023-12-03 20:03:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <style>\n");
      out.write("      .heading-text{\n");
      out.write("        margin: 25px 30px 50px 30px;\n");
      out.write("      }\n");
      out.write("      .input-box {\n");
      out.write("        display: flex;\n");
      out.write("        width: 50%;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        padding: 10px;\n");
      out.write("        margin: auto;\n");
      out.write("        flex-direction: column;\n");
      out.write("       \n");
      out.write("        max-width: 20%;\n");
      out.write("        gap: 20px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .form{\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("        gap: 20px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .createAccount-link{\n");
      out.write("        color: black;\n");
      out.write("      }\n");
      out.write("      .error-message{\n");
      out.write("        color: red;\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1 class=\"heading-text\">Welcome to MyHotel!</h1>\n");
      out.write("    <div class=\"input-box\">\n");
      out.write("    <form class=\"form\" method=\"post\">\n");
      out.write("      \n");
      out.write("        <label for=\"user_name\">Username:</label>\n");
      out.write("        <input type=\"text\" name=\"user_name\" required/>\n");
      out.write("        <label for=\"password\">Password:</label>\n");
      out.write("        <input type=\"password\" name=\"password\" required/>\n");
      out.write("        <input type=\"submit\" value=\"Login\" />\n");
      out.write("      \n");
      out.write("    </form>\n");
      out.write("     <a class=\"createAccount-link\" href=\"createAccountPage.jsp\">\n");
      out.write("          <text>Create Account</text>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    ");

    if ("POST".equalsIgnoreCase(request.getMethod())) {
      String userName = request.getParameter("user_name");
      String userPassword = request.getParameter("password");
      if (userName != null && userPassword != null) {
        String user;
        user = "root";
        String password = "Ken30526296@";
        try {
          java.sql.Connection con; 
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project?autoReconnect=true&useSSL=false",user, password);
          Statement stmt = con.createStatement();
          String query = "SELECT ID, UserName, Password FROM Employee WHERE UserName = '" + userName + "'";
          ResultSet rs = stmt.executeQuery(query);
          if (rs.next()) {
            String dbPassword = rs.getString("Password");
            int employeeID = rs.getInt("ID");
            if(userPassword.equals(dbPassword)) {
              session.setAttribute("eId", employeeID);
               
      
      out.write(" \n");
      out.write("              <script>\n");
      out.write("                localStorage.setItem(\"username\", \"");
      out.print( userName );
      out.write("\");\n");
      out.write("                localStorage.setItem(\"password\", \"");
      out.print( userPassword );
      out.write("\");\n");
      out.write("                localStorage.setItem(\"employeeID\", \"");
      out.print( employeeID );
      out.write("\");\n");
      out.write("                window.location.href = \"./Menu.jsp\";\n");
      out.write("              </script>\n");
      out.write("    ");
    
          }
            else {
    
      out.write("          \n");
      out.write("              <p class=\"error-message\">Your password is wrong</p>\n");
      out.write("    ");

            }
          }
          else {
    
      out.write("\n");
      out.write("            <p class=\"error-message\">Your User name is wrong</p>\n");
      out.write("    ");

          } 
      
          rs.close();
          stmt.close();
          con.close();
        } 
        catch(SQLException e) { 
            out.println("SQLException caught: " + e.getMessage()); 
        }
      }
    }
    
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
