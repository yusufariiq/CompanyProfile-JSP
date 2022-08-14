<%-- 
    Document   : dashboard
    Created on : Jul 26, 2022, 3:33:43 PM
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
    <title>Dashboard | Agen-Z</title>
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
    <!-- Start Header -->
    <nav>
        <ul class="menu">
            <li class="logo"><a href="dashboard.jsp"><img src="asset/image/AGEN-Z LOGO.png" alt="" /></a></li>
            <li class="item button first"><a href="../logout">Log Out</a></li>
            <li class="item button secondary"><a href="dashboard.jsp">Dashboard</a></li>
            <li class="toggle"><a href="#"><span class="fa fa-bars"></span></a></li>
        </ul>
    </nav>
    <!-- End Header -->
    
    <!-- Start About Section -->
    <article>
        <section class="dashboard-about" id="">
          <div class="dashboard-image">
            <img src="asset/image/picture9.png" alt="" />
          </div>

          <div class="dashboard-content">
            <h3>Welcome Admin!</h3>
            <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla interdum velit et pellentesque dignissim. Cras pretium, dui in rhoncus semper, ipsum ante tempus turpis, et varius metus augue id enim.
            </p>
          </div>
        </section>
      </article>
      <!-- End About Section -->

    <section class="card-container">
        <a href="addData.jsp"><div class="card">
            <i class="fa fa-plus" aria-hidden="true"></i>
            <h1>Create</h1>
            <p>Create employee data</p>
        </div></a>
    
        <a href="viewData.jsp"><div class="card">
            <i class="fa fa-table" aria-hidden="true"></i>
            <h1>Employees</h1>
            <p>View employee data</p>
        </div></a>
    
        <a href="viewMessage.jsp"><div class="card">
            <i class='far fa-comment-alt'></i>
            <h1>Message</h1>
            <p>View incoming message from client</p>
        </div></a>
    </section>
    
    <footer>
        <h1>AGEN-Z</h1>
        <p>&copy; 2022 All Right Reserved</p>
    </footer>
</body>
</html>
