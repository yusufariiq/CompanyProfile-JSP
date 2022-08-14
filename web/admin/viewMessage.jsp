<%-- 
    Document   : viewMessage
    Created on : Jul 27, 2022, 3:12:20 PM
    Author     : Ariiq Yusuf
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Connection.connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Styles -->
    <link rel="stylesheet" href="asset/css/styles.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>  
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
        integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Poppins:ital,wght@0,200;0,300;0,400;0,500;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,700;1,800;1,900&display=swap"
        rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- Script & Jquery -->
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    <script src="asset/js/script.js"></script>
    <title>Create Data | Agen-Z</title>
</head>
<script>
$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
});
</script>
</head>
<body>
    <%! String user; %>
        <%
            if(session.getAttribute("email") == null) {
                response.sendRedirect("../error/error.jsp");
            }
            else {
                user = session.getAttribute("email").toString();
            }
    %>
    <nav>
        <ul class="menu">
            <li class="logo"><a href="dashboard.jsp"><img src="asset/image/AGEN-Z LOGO.png" alt="" /></a></li>
            <li class="item button first"><a href="../logout">Log Out</a></li>
            <li class="item button secondary"><a href="dashboard.jsp">Dashboard</a></li>
            <li class="toggle"><a href="#"><span class="fa fa-bars"></span></a></li>
        </ul>
    </nav>
    
    <main class="tables">
        <table>
            <caption>Incoming Message</caption>
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col">Message</th>
                <th scope="col">Reply</th>
            </tr>
            </thead>
            <tbody>
              <%
                  try{
                       String email = ""; 
                       connection obj = new connection();
                       obj.openConnection();
                       String sql = "SELECT name, email, message from contact";
                       PreparedStatement pr = obj.con.prepareStatement(sql);
                       ResultSet rs = pr.executeQuery(sql);
                       while(rs.next()){
                            email = rs.getString(2);
                            out.println("<tr>");
                            out.println("<td data-label='Name' class='td-msg'>" + rs.getString(1) + "</td>");
                            out.println("<td data-label='Email' class='td-msg'>" + email + "</td>");
                            out.println("<td data-label='Message' class='td-msg'>" + rs.getString(3) + "</td>");
                            out.println("<td data-label='Action'><a href='mailto:"+ email +"'><i class='fa fa-reply' style='font-size:16px'></i></a>" + "</td>");
                            out.println("</tr>");
                       }
                  } catch (Exception e) {
                          out.println(e.getMessage());
                  }
              %>
          </tbody>
        </table>
       </div>
    </main>
    </body>
</html>
