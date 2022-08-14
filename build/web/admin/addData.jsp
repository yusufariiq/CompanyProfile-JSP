<%-- 
    Document   : addData
    Created on : Jul 26, 2022, 12:25:36 PM
    Author     : Ariiq Yusuf
--%>

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
        
        <%
     if(request.getParameter("info") != null) {
         int info = Integer.parseInt(request.getParameter("info"));
         if(info == 1) {
             out.println("Data Berhasil Dimasukkan <br/>");
         }
         else {
             out.println("Data Gagal Dimasukkan <br/>");
         }
     }     
     %>
    
    <div class="regist-wrapper">
        <div class="regist-container">
            <div class="title">Add Data</div>
            <form action="../registration" method="post">
                <div class="regist-details">
                    <div class="regist-box">
                        <span class="details" for="name">Full Name</span>
                        <input type="text" placeholder="Enter name" name="name" required>
                    </div>
                    <div class="regist-box">
                        <span class="details" for="email">Email</span>
                        <input type="email" placeholder="Enter email" name="email" required>
                    </div>
                    <div class="regist-box">
                        <span class="details" for="phone">Phone number</span>
                        <input type="number" placeholder="Enter phone number" name="phone" required>
                    </div>
                    <div class="regist-box">
                        <span class="details" for="department" >Department</span>
                        <select name="department" id="department" name="department">
                            <option value="" disabled selected>Selection--</option>
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
                    <textarea placeholder="Enter address" name="address" required></textarea>
                </div>
                <div class="submit-button">
                    <input type="submit" value="Submit Data">
                </div>
            </form>
        </div>
    </div>
</body>
</html>
