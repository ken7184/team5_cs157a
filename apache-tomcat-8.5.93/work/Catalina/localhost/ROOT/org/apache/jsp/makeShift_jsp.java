/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2023-12-06 00:27:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class makeShift_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/navbar.jspf", Long.valueOf(1701820678179L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
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
      out.write("    <title>Create Shift</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"navbar.css\"/>\n");
      out.write("    <style>\n");
      out.write("        .header-text {\n");
      out.write("            background-color: lightblue;\n");
      out.write("            font-size: 100px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hotel-location-text {\n");
      out.write("            font-size: 24px;\n");
      out.write("            text-align: start;\n");
      out.write("            padding-bottom: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .error-message{\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin-left: 48px;\n");
      out.write("            color: red;\n");
      out.write("          }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    ");
      out.write("<nav class=\"navbar is-transparent\" role=\"navigation\" aria-label=\"main navigation\">\n");
      out.write("  <div id=\"navbarBasicExample\" class=\"navbar-menu\">\n");
      out.write("    <div class=\"navbar-start\">\n");
      out.write("      <a class=\"navbar-item\" href=\"Menu.jsp\">\n");
      out.write("        <span class=\"icon-text\">\n");
      out.write("          <span class=\"icon\">\n");
      out.write("            <i class=\"fas fa-home\"></i>\n");
      out.write("          </span>\n");
      out.write("          <span>Home</span>\n");
      out.write("        </span>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"navbar-end\">\n");
      out.write("      <div class=\"navbar-item\">\n");
      out.write("        <div class=\"buttons\">\n");
      out.write("          <a class=\"navbar-item\" href=\"hotelsPage.jsp\">\n");
      out.write("            Hotels\n");
      out.write("          </a>\n");
      out.write("          <a class=\"navbar-item\" href=\"shiftPage.jsp\">\n");
      out.write("            Shift\n");
      out.write("          </a>\n");
      out.write("          <a class=\"button is-light\" onclick=\"logOut()\">\n");
      out.write("            Log Out\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    <h1 class=\"header-text\">Create Shift</h1>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <form method = \"post\">\n");
      out.write("        <table style=\"width: 50%\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Employee ID: </td>\n");
      out.write("                <td><input type = \"text\" name = \"employeeId\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("            <tr>\n");
      out.write("                <td>Hotel Location: </td>\n");
      out.write("                <td><input type = \"text\" name = \"hotelLocation\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("            <tr>\n");
      out.write("                <td>Hotel Name: </td>\n");
      out.write("                <td><input type = \"text\" name = \"hotelName\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Date: (yyyy-mm-dd) </td>\n");
      out.write("                <td><input type = \"datetime-local\" name = \"date\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Start Time: (yyyy-mm-dd)</td>\n");
      out.write("                <td><input type = \"datetime-local\" name = \"startTime\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>End Time: (yyyy-mm-dd)</td>\n");
      out.write("                <td><input type = \"datetime-local\" name = \"endTime\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Task: </td>\n");
      out.write("                <td><input type = \"text\" name = \"task\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Assigned Room:  </td>\n");
      out.write("                <td><input type = \"text\" name = \"assignedRoom\"/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <input type=\"submit\" value=\"Submit\" />\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String employeeIDStr = request.getParameter("employeeId");

        String hotelLocation = request.getParameter("hotelLocation");
        String hotelName = request.getParameter("hotelName");

        String dateStr = request.getParameter("date");

        String startTimeStr = request.getParameter("startTime");
        String endTimeStr = request.getParameter("endTime");

        if (dateStr != null) {
            dateStr = dateStr.replace("T", " ");
        } else {
            dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        }

        if (startTimeStr != null) {
            startTimeStr = startTimeStr.replace("T", " ");
        } else {
            startTimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        }

        if (endTimeStr != null) {
            endTimeStr = endTimeStr.replace("T", " ");
        } else {
            endTimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        }

        String task = request.getParameter("task");
        String assignedRoom = request.getParameter("assignedRoom");

        if (employeeIDStr != null && !employeeIDStr.isEmpty()) {
            try {
                int employeeIDInt = Integer.parseInt(employeeIDStr);

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                Date date = dateFormat.parse(dateStr);
                Date startTime = dateFormat.parse(startTimeStr);
                Date endTime = dateFormat.parse(endTimeStr);

                String user = "root";
                String password = "Ken30526296@";

                Connection con = null;
                PreparedStatement preparedStatement = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project?autoReconnect=true&useSSL=false", user, password);

                    String sql = "INSERT INTO Project.Shift (EmployeeID, HotelLocation, HotelName, Date, StartTime, endTime, Task, AssignedRoom) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setInt(1, employeeIDInt);
                    preparedStatement.setString(2, hotelLocation);
                    preparedStatement.setString(3, hotelName);
                    preparedStatement.setTimestamp(4, new Timestamp(date.getTime()));
                    preparedStatement.setTimestamp(5, new Timestamp(startTime.getTime()));
                    preparedStatement.setTimestamp(6, new Timestamp(endTime.getTime()));
                    preparedStatement.setString(7, task);
                    preparedStatement.setString(8, assignedRoom);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    con.close();
                    out.println("<h2>New Shift is created</h2>");
                } catch (Exception e) {
                    out.println("Exception caught: " + e.getMessage());
                }
                   
            } catch (NumberFormatException e) {
                out.println("Invalid EmployeetId format");
            }
        } else {
            out.println("Enter Information.");
        }
    }
    
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
