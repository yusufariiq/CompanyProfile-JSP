<%-- 
    Document   : updateData
    Created on : Jul 26, 2022, 10:40:56 PM
    Author     : Ariiq Yusuf
--%>

<%@page import="java.sql.*"%>
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
    <title>Update Data| Agen-Z</title>
</head>
    <body>
        <nav>
            <ul class="menu">
                <li class="logo"><a href="dashboard.jsp"><img src="asset/image/AGEN-Z LOGO.png" alt="" /></a></li>
                <li class="item button first"><a href="../logout">Log Out</a></li>
                <li class="item button secondary"><a href="dashboard.jsp">Dashboard</a></li>
                <li class="toggle"><a href="#"><span class="fa fa-bars"></span></a></li>
            </ul>
        </nav>
        <%! String user; %>
        <%
            if(session.getAttribute("email") == null) {
                response.sendRedirect("../error/error.jsp");
            }
            else {
                user = session.getAttribute("email").toString();
            }
        %>
        <%!
            String id, name, email, phone, department, address;
        %>
        <%
            connection obj = new connection();
            obj.openConnection();
            id = request.getParameter("id");
            String sql = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement pr = obj.con.prepareStatement(sql);
            pr.setString(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                    id = rs.getString(1);
                    name = rs.getString(2);
                    email = rs.getString(3);
                    phone = rs.getString(4);
                    department = rs.getString(5);
                    address = rs.getString(6);
            } else {
                out.println("Data Unavailable");
            }
            rs.close();
        %>
        <div class="regist-wrapper">
        <div class="regist-container">
            <div class="title">Update Data</div>
            <form action="update" method="post">
                <div class="regist-details">
                    <input type="hidden" id="id" name="id" value="<%=id%>" disabled/>
                    <div class="regist-box">
                        <span class="details" for="name">Full Name</span>
                        <input type="text" placeholder="Enter name" name="name" value="<%=name%>" required>
                    </div>
                    <div class="regist-box">
                        <span class="details" for="email">Email</span>
                        <input type="email" placeholder="Enter email" name="email" value="<%=email%>" required>
                    </div>
                    <div class="regist-box">
                        <span class="details" for="phone">Phone number</span>
                        <input type="number" placeholder="Enter phone number" name="phone" value="<%=phone%>" required>
                    </div>
                    <div class="regist-box">
                        <span class="details" for="department" >Department</span>
                        <select name="department" id="department" name="department">
                            <option value="<%=department%>"><%=department%></option>
                            <option value="Production">Production</option>
                            <option value="Technology">Technology</option>
                            <option value="Creative">Creative</option>
                            <option value="Human Resource">Human Resource</option>
                            <option value="Marketing">Marketing</option>
                            <option value="Finance">Finance</option>
                        </select>
                    </div>
                </div>
                <div class="regist-box">
                    <span class="details" for="address">Address</span>
                    <textarea placeholder="Enter address" name="address" required><%=address%></textarea>
                </div>
                
                <div class="regist-details">
                    <div class="regist-button">
                        <button onclick="location.href='viewData.jsp'" type="button">Back</button>
                    </div>
                    <div class="regist-button">
                        <input type="submit" value="Update Data">
                    </div>
                </div>
            </form>
        </div>
    </div>
    </body>
</html>
