/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2023-12-02 05:05:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class reservationInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/navbar.jspf", Long.valueOf(1699404577502L));
  }

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
      out.write("    <head>\n");
      out.write("      <title>Search Reservation</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"navbar.css\"/>\n");
      out.write("      <style>\n");
      out.write("          .title-section{\n");
      out.write("              padding: 24px 48px 0px 48px;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          .title{\n");
      out.write("              font-size: 24px;\n");
      out.write("              font-weight: 400;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          .error-message{\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin-left: 48px;\n");
      out.write("            color: red;\n");
      out.write("          }\n");
      out.write("      </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
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
      out.write("          <a class=\"navbar-item\">\n");
      out.write("            Account\n");
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
      out.write("      <div class=\"title-section\">\n");
      out.write("        <h2 class=\"title\">Search Reservation</h2>\n");
      out.write("        <hr class=\"solid\" style=\"border-top: 1px solid; opacity: 0.2;\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div style=\"width: 50%; margin: 16px 48px; height: 24px;\">\n");
      out.write("      <form method=\"post\" action=\"\">\n");
      out.write("        <input type=\"text\" name=\"RN\" placeholder=\"Enter Reservation Number\" style=\"width: 45%; height: 100%;\">\n");
      out.write("        <input type=\"submit\" name=\"ReservationNumber\" value=\"Search\" style=\"width: 10%; height: 100%;\">\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    ");

    String buttonClicked = request.getParameter("ReservationNumber");
    String reservationNumberInput = request.getParameter("RN");

    String user = "root";
    String pass = "Ken30526296@";
    
    try {
        java.sql.Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project?autoReconnect=true&useSSL=false", user, pass);

        String query;
        PreparedStatement ps;

        if ("Search".equalsIgnoreCase(buttonClicked) && reservationNumberInput != null && !reservationNumberInput.isEmpty()) {
            int rn = Integer.parseInt(reservationNumberInput);
            query = "SELECT * FROM Project.ReservationInfo r JOIN Project.Stay s ON r.BookingNumber = s.BookingNumber WHERE r.BookingNumber = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, rn);
        } else {
            query = "SELECT * FROM Project.ReservationInfo r JOIN Project.Stay s ON r.BookingNumber = s.BookingNumber";
            ps = con.prepareStatement(query);
        }   

        ResultSet rs = ps.executeQuery();

        if (!rs.isBeforeFirst()) { // Check if ResultSet is empty
          out.println("<h2 class='error-message'>No data found for reservation number: " + reservationNumberInput + "</h2>");
        } else {
        
      out.write("\n");
      out.write("          <table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\" style=\"width: 90%; margin-left: 48px; font-size: 14px;\">\n");
      out.write("            <thead>\n");
      out.write("                <th>Booking Number</th>\n");
      out.write("                <th>Guest Id</th>\n");
      out.write("                <th>Number of Rooms</th>\n");
      out.write("                <th>Number of Guests</th>\n");
      out.write("                <th>Start Date</th>\n");
      out.write("                <th>End Date</th>\n");
      out.write("                <th>Reservation Date</th>\n");
      out.write("                <th>Booking Site</th>\n");
      out.write("                <th>Special Request</th>\n");
      out.write("                <th>Hotel Name</th>\n");
      out.write("                <th>Hotel Location</th>\n");
      out.write("                <th>Room Number</th>\n");
      out.write("                <th>Check In</th>\n");
      out.write("                <th>Check Out</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            ");
 while(rs.next()) { 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                  <td>");
      out.print( rs.getInt("BookingNumber") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getInt("GuestID") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("NumberOfRooms") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("NumberOfGuests") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( new Date(rs.getTimestamp("StartDate").getTime()) );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( new Date(rs.getTimestamp("EndDate").getTime()) );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( new Date(rs.getTimestamp("ReservationDate").getTime()) );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("BookingSite") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("SpecialRequest") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("HotelName") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("HotelLocation") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("RoomNumber") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("CheckIn") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString("CheckOut") );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          ");

        }
            rs.close();
            ps.close();
            con.close();
    } catch (SQLException | ClassNotFoundException e) {
        out.println("Exception caught: " + e.getMessage());
    }
    
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
