/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2023-11-30 00:34:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Home Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"navbar.css\"/>\n");
      out.write("    <style>\n");
      out.write("      .body{\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("      }\n");
      out.write("      .welcome-message{\n");
      out.write("        font-size: 80px;\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .header-pic{\n");
      out.write("        width: 100%;\n");
      out.write("        height: 300px;\n");
      out.write("        object-fit: cover;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .date-text{\n");
      out.write("        font-size: 24px;\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .guests-box-container{\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-between;\n");
      out.write("        padding: 48px 48px;\n");
      out.write("        height: 250px;\n");
      out.write("      }\n");
      out.write("      .box{\n");
      out.write("        width: 25%;\n");
      out.write("        height: 100%;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .title-flex{\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: space-between;\n");
      out.write("        flex-direction: row;\n");
      out.write("      }\n");
      out.write("      .box-title{\n");
      out.write("        font-size: 16px;\n");
      out.write("        font-weight: bold;\n");
      out.write("      }\n");
      out.write("      .box-text{\n");
      out.write("        font-size: 24px;\n");
      out.write("        padding: 16px 16px;\n");
      out.write("        text-align: center;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .reservation-section{\n");
      out.write("        padding: 48px 48px;\n");
      out.write("        width: 100%;\n");
      out.write("        gap: 24px;\n");
      out.write("      }\n");
      out.write("      .reservation-title{\n");
      out.write("        font-size: 24px;\n");
      out.write("        font-weight:400;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .tab-content {\n");
      out.write("        display: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .tab-content.active {\n");
      out.write("        display: block;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .manage-reservation{\n");
      out.write("        padding: 48px 48px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <script>\n");
      out.write("    window.onload = function() {\n");
      out.write("        const employeeIDon = localStorage.getItem(\"employeeID\");\n");
      out.write("        const employeeRoleon = localStorage.getItem(\"employeeRole\");\n");
      out.write("        const queryParams = \"?employeeIDon=\" + encodeURIComponent(employeeIDon) + \"&employeeRoleon=\" + encodeURIComponent(employeeRoleon);\n");
      out.write("        const targetURL = window.location.pathname + queryParams;\n");
      out.write("        if (window.location.search != queryParams) {\n");
      out.write("            window.location.href = targetURL;\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    function logOut(){\n");
      out.write("      localStorage.removeItem(\"employeeID\");\n");
      out.write("      localStorage.removeItem(\"username\");\n");
      out.write("      window.location.href=\"loginPage.jsp\"\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("  <body class=\"body\">\n");
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
      out.write("        ");

        int totalGuestsCheckingIn = 0;
        int totalGuestsCheckingOut = 0;
        int totalStay = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM dd, yyyy");
        Date date = new Date();
        String todayDate = sdf.format(date);
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date cdate = new Date();
        String currentDate = sdf.format(date);

        String employeeIDStr = request.getParameter("employeeIDon");
        String testRole = request.getParameter("employeeRoleon");
        String roleN = "0"; 
        if (employeeIDStr != null && !employeeIDStr.trim().isEmpty()) {
          String user = "root";
          String pass = "Ken30526296@";
          try {
            int employeeID2 = Integer.parseInt(employeeIDStr);
            java.sql.Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project?autoReconnect=true&useSSL=false", user, pass);
            String query = "SELECT Name, Role FROM Employee WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, employeeID2);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              roleN = rs.getString("Role");
              String name = rs.getString("Name");
              if (!name.isEmpty()) {
                out.println("<h1 class='welcome-message'>Welcome, " + name + "!</h1>"); 
                out.println("<h2 class='date-text'>" + todayDate + "</h2>");
              }
            }
            String checkInQuery = "SELECT COUNT(GuestID) AS TotalGuests FROM ReservationInfo WHERE StartDate = ?";
            ps = con.prepareStatement(checkInQuery);
            ps.setString(1, currentDate);
            rs = ps.executeQuery();
            if (rs.next()) {
              totalGuestsCheckingIn = rs.getInt("TotalGuests");
            }
            String checkOutQuery = "SELECT COUNT(GuestID) AS TotalCheckouts FROM ReservationInfo WHERE EndDate = ?";
            ps = con.prepareStatement(checkOutQuery);
            ps.setString(1, currentDate);
            rs = ps.executeQuery();
            if (rs.next()) {
              totalGuestsCheckingOut = rs.getInt("TotalCheckouts");
            }
            
            String totalStayQuery = "SELECT COUNT(GuestID) AS TotalStay FROM ReservationInfo WHERE StartDate <= ? AND EndDate > ?";
            ps = con.prepareStatement(totalStayQuery);
            ps.setString(1, currentDate);
            ps.setString(2, currentDate);
            rs = ps.executeQuery();
            if (rs.next()) {
              totalStay = rs.getInt("TotalStay");
            }
            
      out.write("\n");
      out.write("              <div class=\"guests-box-container\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                  <div class=\"title-flex\">\n");
      out.write("                    <p class=\"box-title\">Checking In Today</p>\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("                      <i class=\"fas fa-plane-arrival\"></i>\n");
      out.write("                    </span>\n");
      out.write("                  </div>\n");
      out.write("                ");

                out.println("<p class='box-text'>" + totalGuestsCheckingIn + "</p>");
                
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                  <div class=\"title-flex\">\n");
      out.write("                    <p class=\"box-title\">Checking Out Today</p>\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("                      <i class=\"fas fa-plane-departure\"></i>\n");
      out.write("                    </span>\n");
      out.write("                  </div>\n");
      out.write("                ");

                  out.println("<p class='box-text'>" + totalGuestsCheckingOut + "</p>");
                
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                  <div class=\"title-flex\">\n");
      out.write("                    <p class=\"box-title\">Total Stay Today</p>\n");
      out.write("                    <span class=\"icon\">\n");
      out.write("                      <i class=\"fas fa-bed\"></i>\n");
      out.write("                    </span>\n");
      out.write("                  </div>\n");
      out.write("                ");

                  out.println("<p class='box-text'>" + totalStay + "</p>");
                
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("           ");

        if(roleN.equals("1") || roleN.equals("3")) {
      
      out.write("  \n");
      out.write("      <div class=\"reservation-section\">\n");
      out.write("        <h2 class=\"reservation-title\" style=\"padding-left: 16px;\">Reservation Information</h2>\n");
      out.write("        <div class=\"tabs\">\n");
      out.write("          <ul>\n");
      out.write("            <li class=\"tab-link is-active\" data-tab=\"tab-ongoing\"><a>Ongoing</a></li>\n");
      out.write("            <li class=\"tab-link\" data-tab=\"tab-future\"><a>Future Reservation</a></li>\n");
      out.write("            <li class=\"tab-link\" data-tab=\"tab-history\"><a>History</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"tab-ongoing\" class=\"tab-content\">\n");
      out.write("          <table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\n");
      out.write("            <thead>\n");
      out.write("              <th>Booking Number</th>\n");
      out.write("              <th>Guest ID</th>\n");
      out.write("              <th>Number of Rooms</th>\n");
      out.write("              <th>Number of Guests</th>\n");
      out.write("              <th>Start Date</th>\n");
      out.write("              <th>End Date</th>\n");
      out.write("              <th>Reservation Date</th>\n");
      out.write("              <th>Booking Site</th>\n");
      out.write("              <th>Special Request</th>\n");
      out.write("              <th>Hotel Name</th>\n");
      out.write("              <th>Hotel Location</th>\n");
      out.write("              <th>Checked In</th>\n");
      out.write("              <th>Checked Out</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("          ");

          String ongoingQuery = "SELECT * FROM Project.ReservationInfo r LEFT JOIN Project.Stay s ON r.BookingNumber = s.BookingNumber WHERE StartDate <= ? AND EndDate > ?";
          ps = con.prepareStatement(ongoingQuery);
          ps.setString(1, currentDate);
          ps.setString(2, currentDate);
          rs = ps.executeQuery();
          while(rs.next()) {
          
      out.write("\n");
      out.write("              <tr>\n");
      out.write("                <td>");
      out.print( rs.getInt("BookingNumber") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getInt("GuestID") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("NumberOfRooms") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("NumberOfGuests") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("StartDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("EndDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("ReservationDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("BookingSite") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("SpecialRequest") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("HotelName") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("HotelLocation") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("CheckIn") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("CheckOut") );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("          ");

            }
          
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"tab-future\" class=\"tab-content\">\n");
      out.write("          <table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\n");
      out.write("            <thead>\n");
      out.write("              <th>Booking Number</th>\n");
      out.write("              <th>Guest ID</th>\n");
      out.write("              <th>Number of Rooms</th>\n");
      out.write("              <th>Number of Guests</th>\n");
      out.write("              <th>Start Date</th>\n");
      out.write("              <th>End Date</th>\n");
      out.write("              <th>Reservation Date</th>\n");
      out.write("              <th>Booking Site</th>\n");
      out.write("              <th>Special Request</th>\n");
      out.write("              <th>Hotel Name</th>\n");
      out.write("              <th>Hotel Location</th>\n");
      out.write("              <th>Checked In</th>\n");
      out.write("              <th>Checked Out</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("          ");

          String futureQuery = "SELECT * FROM Project.ReservationInfo r LEFT JOIN Project.Stay s ON r.BookingNumber = s.BookingNumber WHERE StartDate > ?";
          ps = con.prepareStatement(futureQuery);
          ps.setString(1, currentDate);
          rs = ps.executeQuery();
          while(rs.next()) {
          
      out.write("\n");
      out.write("              <tr>\n");
      out.write("                <td>");
      out.print( rs.getInt("BookingNumber") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getInt("GuestID") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("NumberOfRooms") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("NumberOfGuests") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("StartDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("EndDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("ReservationDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("BookingSite") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("SpecialRequest") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("HotelName") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("HotelLocation") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("CheckIn") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("CheckOut") );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("          ");

            }
          
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"tab-history\" class=\"tab-content\">\n");
      out.write("          <table class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\n");
      out.write("            <thead>\n");
      out.write("              <th>Booking Number</th>\n");
      out.write("              <th>Guest ID</th>\n");
      out.write("              <th>Number of Rooms</th>\n");
      out.write("              <th>Number of Guests</th>\n");
      out.write("              <th>Start Date</th>\n");
      out.write("              <th>End Date</th>\n");
      out.write("              <th>Reservation Date</th>\n");
      out.write("              <th>Booking Site</th>\n");
      out.write("              <th>Special Request</th>\n");
      out.write("              <th>Hotel Name</th>\n");
      out.write("              <th>Hotel Location</th>\n");
      out.write("              <th>Checked In</th>\n");
      out.write("              <th>Checked Out</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("          ");

          String historyQuery = "SELECT * FROM Project.ReservationInfo r LEFT JOIN Project.Stay s ON r.BookingNumber = s.BookingNumber WHERE EndDate < ?";
          ps = con.prepareStatement(historyQuery);
          ps.setString(1, currentDate);
          rs = ps.executeQuery();
          while(rs.next()) {
          
      out.write("\n");
      out.write("              <tr>\n");
      out.write("                <td>");
      out.print( rs.getInt("BookingNumber") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getInt("GuestID") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("NumberOfRooms") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("NumberOfGuests") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("StartDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("EndDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("ReservationDate") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("BookingSite") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("SpecialRequest") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("HotelName") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("HotelLocation") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("CheckIn") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString("CheckOut") );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("          ");

            }
          
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"button is-light\" href=\"reservationInfo.jsp\" style=\"margin-top: 16px;\">\n");
      out.write("          Search By Reservation Number\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <script>\n");
      out.write("        document.querySelectorAll('.tab-link').forEach(tab => {\n");
      out.write("          tab.addEventListener('click', function(e) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            var activeTabs = document.querySelectorAll('.tab-link.is-active');\n");
      out.write("            activeTabs.forEach(function(activeTab) {\n");
      out.write("              activeTab.classList.remove('is-active');\n");
      out.write("            });\n");
      out.write("        \n");
      out.write("            tab.classList.add('is-active');\n");
      out.write("            var activeContents = document.querySelectorAll('.tab-content.active');\n");
      out.write("            activeContents.forEach(function(content) {\n");
      out.write("              content.classList.remove('active');\n");
      out.write("            });\n");
      out.write("        \n");
      out.write("            var tabId = tab.getAttribute('data-tab');\n");
      out.write("            var activeContent = document.getElementById(tabId);\n");
      out.write("            activeContent.classList.add('active');\n");
      out.write("          });\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <div class=\"manage-reservation\">\n");
      out.write("          <h2 class=\"reservation-title\">Manage Reservation</h2>\n");
      out.write("          <hr class=\"solid\" style=\"border-top: 1px solid; opacity: 0.2;\">\n");
      out.write("          <a class=\"button is-light\" href=\"makeReservation.jsp\" style=\"margin-top: 2px;\">\n");
      out.write("            Create Reservation\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"manage-reservation\">\n");
      out.write("          <h2 class=\"reservation-title\">Billing</h2>\n");
      out.write("          <hr class=\"solid\" style=\"border-top: 1px solid; opacity: 0.2;\">\n");
      out.write("          <a class=\"button is-light\" href=\"billingInfo.jsp\" style=\"margin-top: 2px;\">\n");
      out.write("            Manage Billing\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"manage-reservation\">\n");
      out.write("          <h2 class=\"reservation-title\">Hotels</h2>\n");
      out.write("          <hr class=\"solid\" style=\"border-top: 1px solid; opacity: 0.2;\">\n");
      out.write("          <a class=\"button is-light\" href=\"roomInventory.jsp\" style=\"margin-top: 2px;\">\n");
      out.write("            Room Inventory\n");
      out.write("          </a>\n");
      out.write("          <a class=\"button is-light\" href=\"roomResponsibility.jsp\" style=\"margin-top: 2px; margin-left: 24px;\">\n");
      out.write("            Assigned Room\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      ");

        }
        if(roleN.equals("1")) {
      
      out.write("\n");
      out.write("          <div class=\"manage-reservation\">\n");
      out.write("            <h2 class=\"reservation-title\">Employees</h2>\n");
      out.write("            <hr class=\"solid\" style=\"border-top: 1px solid; opacity: 0.2;\">\n");
      out.write("            <a class=\"button is-light\" href=\"managerShift.jsp\" style=\"margin-top: 2px;\">\n");
      out.write("              Employee Shift\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("      ");

        }
        if(roleN.equals("1") || roleN.equals("2") || roleN.equals("6")) {
      
      out.write("\n");
      out.write("        <div class=\"manage-reservation\">\n");
      out.write("          <h2 class=\"reservation-title\">Hotels</h2>\n");
      out.write("          <hr class=\"solid\" style=\"border-top: 1px solid; opacity: 0.2;\">\n");
      out.write("          <a class=\"button is-light\" href=\"roomInventory.jsp\" style=\"margin-top: 2px;\">\n");
      out.write("            Room Inventory\n");
      out.write("          </a>\n");
      out.write("          <a class=\"button is-light\" href=\"roomResponsibility.jsp\" style=\"margin-top: 2px; margin-left: 24px;\">\n");
      out.write("            Assigned Room\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("       ");
 
      }else {
        
      out.write("\n");
      out.write("        <h1>Employee Menu</h1>\n");
      out.write("          <form action=\"shiftPage.jsp\" method=\"post\">\n");
      out.write("          <label for=\"1. See my Shift\">1. See my Shift</label>\n");
      out.write("          <button type=\"submit\" name=\"submitBtn\" value=\"text1\">Go</button><br>\n");
      out.write("          </form>\n");
      out.write("          ");

        }
      {      
            rs.close();
            ps.close();
            con.close();
          }
          } catch (NumberFormatException e) {
            out.println("Invalid employee ID format");
          } catch (SQLException e) {
            out.println("SQLException caught: " + e.getMessage());
          } catch (ClassNotFoundException e) {
            out.println("ClassNotFoundException: " + e.getMessage());
          }
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
