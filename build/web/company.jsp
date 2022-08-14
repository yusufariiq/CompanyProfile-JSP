<%-- 
    Document   : company
    Created on : Jul 24, 2022, 9:13:59 PM
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
    <title>Company  |  Agen-Z</title>
</head>
<body>
    <!-- Start Header -->
    <nav>
        <ul class="menu">
            <li class="logo"><a href="#home"><img src="asset/image/AGEN-Z LOGO.png" alt="" /></a></li>
            <li class="item"><a href="home.jsp">Home</a></li>
            <li class="item current"><a href="company.jsp">Company</a></li>
            <li class="item"><a href="contact.jsp">Contact</a></li>
            <li class="item button first"><a href="login.jsp">Login</a></li>
            <li class="toggle"><a href="#"><span class="fa fa-bars"></span></a></li>
        </ul>
    </nav>
    <!-- End Header -->

    <main>
    <section class="about">
        <div class="row-about">
            <div class="column-head-about">
                <h1>ABOUT</h1>
                <hr>
                <p>Agen-Z is a leading digital media agency millennial company, providing high quality entertainment content and service for people. 
                    Agen-Z quickly planned, booked and optimized a wide range of performance-oriented, measurable online and offline media campaigns for growth companies from home and abroad,
                    helping them to scale their business and enter new markets by providing quality services for the people we have provided.</p>
            </div>
            <div class="column-about">
                <h1>VISION</h1>
                <hr>
                <p>Agen-Z aims to becomes main option for professional media agency that develops in media entertainment and support in the marketing process from producers to consumers to help them accomplish their desired goals through innovative and creative ideas.</p>
            </div>
            <div class="column-about">
                <h1>MISSION</h1>
                <hr>
                <p>Agen-Z has a mission to maintain and improve customer satisfaction by providing the best quality service, starting from high-quality content. Improving communication relationships in establishing partnerships with all parties in order to achieve sustainable and mutually beneficial cooperation.</p>
            </div>
        </div>
    </section>

    <section class="profile">
        <div class="team-title">
            <h1>OUR TEAM</h1>
            <hr>
        </div>
        <div class="team">
            <div class="column-profile">
                <div class="row-profile">
                    <img src="asset/image/Person1.png"alt="" />
                    <h3>Ariiq Yusuf Dhiya Ulhaq</h3>
                    <p>Chief Technology Officer</p>
                </div>
                <div class="row-profile">
                    <img src="asset/image/Person2.png"alt="" />
                    <h3>Erlangga Mohamad</h3>
                    <h3>Prima Prasetya</h3>
                    <p>Chief Executive Officer</p>
                </div>
                <div class="row-profile">
                    <img src="asset/image/Person3.png"alt="" />
                    <h3>Fiqih Tri Darmawan</h3>
                    <p>Chief Marketing Officer</p>
                </div>
            </div>
        </div>
    </section>
    </main>

    <footer>
        <h1>AGEN-Z</h1>
        <p>&copy; 2022 All Right Reserved</p>
    </footer>
</body>
</html>
