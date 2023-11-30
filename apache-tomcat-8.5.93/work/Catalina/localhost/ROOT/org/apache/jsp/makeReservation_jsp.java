/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2023-11-30 01:06:31 UTC
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

public final class makeReservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Create Reservation</title>\n");
      out.write("    <link href=\"createAccountPage.css\" rel=\"stylesheet\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <h1>Create Reservation</h1>\n");
      out.write("      <form method = \"post\">\n");
      out.write("        <table style=\"width: 50%\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Guest ID: </td>\n");
      out.write("                <td><input type = \"text\" name = \"guestId\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("            <tr>\n");
      out.write("                <td>Number of Rooms: </td>\n");
      out.write("                <td><input type = \"text\" name = \"Nrooms\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("            <tr>\n");
      out.write("                <td>Number of Guests: </td>\n");
      out.write("                <td><input type = \"text\" name = \"Nguests\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Start Date: (yyyy-mm-dd) </td>\n");
      out.write("                <td><input type = \"datetime-local\" name = \"startDate\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>End Date: (yyyy-mm-dd)</td>\n");
      out.write("                <td><input type = \"datetime-local\" name = \"endDate\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Reservation Date: (yyyy-mm-dd)</td>\n");
      out.write("                <td><input type = \"datetime-local\" name = \"reserveDate\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Special Request: </td>\n");
      out.write("                <td><input type = \"text\" name = \"specialRequest\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Hotel Name: </td>\n");
      out.write("                <td><input type = \"text\" name = \"hotel_name\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Hotel Location: </td>\n");
      out.write("                <td><input type = \"text\" name = \"hotel_location\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Room Number: </td>\n");
      out.write("                <td><input type = \"text\" name = \"rNumber\" required/></td>\n");
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
        String guestIdStr = request.getParameter("guestId");
        String nRooms = request.getParameter("Nrooms");
        String Nguests = request.getParameter("Nguests");

        String startDateStr = request.getParameter("startDate");
        String endDateStr = request.getParameter("endDate");
        String reserveDateStr = request.getParameter("reserveDate");

        if (startDateStr != null) {
            startDateStr = startDateStr.replace("T", " ");
        } else {
            startDateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        }

        if (endDateStr != null) {
            endDateStr = endDateStr.replace("T", " ");
        } else {
            endDateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        }

        if (reserveDateStr != null) {
            reserveDateStr = reserveDateStr.replace("T", " ");
        } else {
            reserveDateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        }

        String specialRequest = request.getParameter("specialRequest");
        String hotelName = request.getParameter("hotel_name");
        String hotelLocation = request.getParameter("hotel_location");
        String rNumber = request.getParameter("rNumber");

        if (guestIdStr != null && !guestIdStr.isEmpty()) {
            try {
                int guestId = Integer.parseInt(guestIdStr);

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date startDate = dateFormat.parse(startDateStr);
                Date endDate = dateFormat.parse(endDateStr);
                Date reserveDate = dateFormat.parse(reserveDateStr);

                String user = "root";
                String password = "Ken30526296@";

                Connection con = null;
                PreparedStatement preparedStatement = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project?autoReconnect=true&useSSL=false", user, password);

                    String sql = "INSERT INTO Project.ReservationInfo (GuestID, NumberOfRooms, NumberOfGuests, StartDate, EndDate, ReservationDate, SpecialRequest) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    preparedStatement = con.prepareStatement(sql);
                    preparedStatement.setInt(1, guestId);
                    preparedStatement.setString(2, nRooms);
                    preparedStatement.setString(3, Nguests);
                    preparedStatement.setTimestamp(4, new Timestamp(startDate.getTime()));
                    preparedStatement.setTimestamp(5, new Timestamp(endDate.getTime()));
                    preparedStatement.setTimestamp(6, new Timestamp(reserveDate.getTime()));
                    preparedStatement.setString(7, specialRequest);
                    preparedStatement.executeUpdate();

                    String sql2 = "INSERT INTO Project.Stay (HotelName, HotelLocation, RoomNumber) VALUES (?, ?, ?)";
                    preparedStatement = con.prepareStatement(sql2);
                    preparedStatement.setString(1, hotelName);
                    preparedStatement.setString(2, hotelLocation);
                    preparedStatement.setString(3, rNumber);
                    preparedStatement.executeUpdate();

                    con.close();
                    out.println("New Reservation is successfully saved.");
                } catch (Exception e) {
                    out.println("Exception caught: " + e.getMessage());
                } finally {
                    try {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                        }
                        if (con != null) {
                            con.close();
                        }
                    } catch (SQLException e) {
                        out.println("SQLException caught: " + e.getMessage());
                    }
                }
            } catch (NumberFormatException e) {
                out.println("Invalid guestId format");
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
