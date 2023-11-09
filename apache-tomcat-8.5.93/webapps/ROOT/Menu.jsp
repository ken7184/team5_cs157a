<%@ page import="java.sql.*"%>
<%@ page session= "true" %>
<html>
  <head>
    <title>Home Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link rel="stylesheet" href="navbar.css"/>
    <style>

      .welcome-message{
        font-size: 100px;
        text-align: center;
      }
    </style>
  </head>
  <script>
    window.onload = function() {
        const employeeIDon = localStorage.getItem("employeeID");
        const employeeRoleon = localStorage.getItem("employeeRole");
        const queryParams = "?employeeIDon=" + encodeURIComponent(employeeIDon) + "&employeeRoleon=" + encodeURIComponent(employeeRoleon);
        const targetURL = window.location.pathname + queryParams;
        if (window.location.search != queryParams) {
            window.location.href = targetURL;
        }
    };

    function logOut(){
      localStorage.removeItem("employeeID");
      localStorage.removeItem("username");
      window.location.href="loginPage.jsp"
    }
</script>
  <body>
    <%@ include file="navbar.jspf" %>
        <%
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
              }
            }
            rs.close();
            ps.close();
            con.close();
          } catch (NumberFormatException e) {
            out.println("Invalid employee ID format");
          } catch (SQLException e) {
            out.println("SQLException caught: " + e.getMessage());
          } catch (ClassNotFoundException e) {
            out.println("ClassNotFoundException: " + e.getMessage());
          }
        } 
        if(roleN.equals("1")) {
      %>
          <h1>Manager Menu</h1>
          <form action="shiftPage.jsp" method="post">
          <label for="1. See my Shift">1. See my Shift</label>
          <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>

          <form action="managerShift.jsp" method="post">
          <label for="2. See Employees' Shift">2. See Employees' Shift</label>
          <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
          
          <form action="reservationInfo.jsp" method="post">
            <label for="3. Reservation Info">3. See Reservation info</label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>

          <form action="makeReservation.jsp" method="post">
            <label for="4. Reservation Info">4. Make Reservation </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>

          <form action="billingInfo.jsp" method="post">
            <label for="5. Check Billing">5. Check Billing </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>

          <form action="roomResponsibility.jsp" method="post">
            <label for="6. Check who was assigned to room">6. Check who was assigned to room </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
          <form action="roomInventory.jsp" method="post">
            <label for="7.Room Inventory">7. Check room inventory </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>






      <%
        }
        else if(roleN.equals("3")) {
      %>
          <h1>Front Desk Menu</h1>
          <form action="shiftPage.jsp" method="post">
          <label for="1. See my Shift">1. See my Shift</label>
          <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
          <form action="reservationInfo.jsp" method="post">
            <label for="2. Reservation Info">2. See Reservation info</label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
          <form action="makeReservation.jsp" method="post">
            <label for="3. Reservation Info">3. Make Reservation </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
          <form action="billingInfo.jsp" method="post">
            <label for="4. Check Billing">4. Check Billing </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
          <form action="roomResponsibility.jsp" method="post">
            <label for="5. Check who was assigned to room">5. Check who was assigned to room </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
          <form action="roomInventory.jsp" method="post">
            <label for="6.Room Inventory">6. Check room inventory </label>
            <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>


      <%
        }
        else if(roleN.equals("2") || roleN.equals("4") || roleN.equals("5")){
      %>
          <h1>Employee Menu</h1>
          <form action="shiftPage.jsp" method="post">
          <label for="1. See my Shift">1. See my Shift</label>
          <button type="submit" name="submitBtn" value="text1">Go</button><br>
          </form>
      <%
        }
        else if(roleN.equals("6")) {
      %>
        <h1>Employee Menu</h1>
        <form action="shiftPage.jsp" method="post">
        <label for="1. See my Shift">1. See my Shift</label>
        <button type="submit" name="submitBtn" value="text1">Go</button><br>
        </form>
        <form action="roomInventory.jsp" method="post">
          <label for="2.Room Inventory">2. Check room inventory </label>
          <button type="submit" name="submitBtn" value="text1">Go</button><br>
        </form>
       <% 
        }
      %>



  </body>
</html>
