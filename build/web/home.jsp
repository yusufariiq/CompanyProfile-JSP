<%-- 
    Document   : home
    Created on : Jul 24, 2022, 9:13:41 PM
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
    <title>Home  |  Agen-Z</title>
</head>
<body>
    <!-- Start Header -->
    <nav>
        <ul class="menu">
            <li class="logo"><a href="#home"><img src="asset/image/AGEN-Z LOGO.png" alt="" /></a></li>
            <li class="item current"><a href="home.jsp">Home</a></li>
            <li class="item"><a href="company.jsp">Company</a></li>
            <li class="item"><a href="contact.jsp">Contact</a></li>
            <li class="item button first"><a href="login.jsp">Login</a></li>
            <li class="toggle"><a href="#"><span class="fa fa-bars"></span></a></li>
        </ul>
    </nav>
    <!-- End Header -->
    
    <section class="splash-screen">
        <div class="preloader">
            <div class="loading">
                <div class="text">
                    <p class="text-1">AGEN - Z</p>
                    <p style="font-size: 13px;">present by Group 7 - 2SE4</p>
                </div>
            </div>
        </div>
    </section>
    
    <section class="slider">
        <div class="slider">
            <div class="slides">

                <!--radio buttons start-->
                <input type="radio" name="radio-btn" id="radio1">
                <input type="radio" name="radio-btn" id="radio2">
                <input type="radio" name="radio-btn" id="radio3">
                <input type="radio" name="radio-btn" id="radio4">
                <!--radio buttons end-->

                <div class="slide first">
                    <img class="img-slider" src="asset/image/picture4.jpg" alt="picture slide 1">
                </div>
                <div class="slide">
                    <img class="img-slider" src="asset/image/picture2.jpeg" alt="picture slide 2">
                </div>
                <div class="slide">
                    <img class="img-slider" src="asset/image/picture3.jpg" alt="picture slide 3">
                </div>
                <div class="slide">
                    <img class="img-slider" src="asset/image/picture1.jpg" alt="picture slide 4">
                </div>
                <!-- Image Slider end -->

                <!-- automatic navigation start-->
                <div class="navigation-auto">
                    <div class="auto-btn1"></div>
                    <div class="auto-btn2"></div>
                    <div class="auto-btn3"></div>
                    <div class="auto-btn4"></div>
                </div>
                <!-- automatic navigation end-->
            </div>

            <!-- manual navigation start-->
            <div class="navigation-manual">
                <label for="radio1" class="manual-btn"></label>
                <label for="radio2" class="manual-btn"></label>
                <label for="radio3" class="manual-btn"></label>
                <label for="radio4" class="manual-btn"></label>
            </div>
            <!-- manual navigation end-->
        </div>
    </section>

     <!--Content-->
    <section class="container">
        <div class="row">
            <div class="column-head">
                <h1>LETS WORK TOGETHER</h1>
            </div>
            <div class="column-head">
                <p>SERVICE</p>
            </div>
            <div class="column">
                <h1>PUBLICATION</h1>
                <p>AGEN-Z as a publication media agency to spread information through informative, interactive and playful social media contents.</p>
            </div>
            <div class="column">
                <h1>ADVERTISING</h1>
                <p>AGEN-Z functions to be e media dedicated to creating, planning, and handling advertising 
                    and provides an outside point of  view to the effort of selling the client's product or services or an outside firm.</p>
            </div>
          </div>
    </section>

    <!--Partnership-->
    <section class="partnership">
        <div class="row">
            <div class="column">
                <h1>OUR CLIENTS</h1>
                <p>We understand that each brand has its own unique characteristic
                that can be developed through various methods and solutions.
                AGEN-Z is here to provide a solution.</p>
            </div>
            <div class="flex-column">
                <div class="flex-row">
                  <img class="box" src="asset/image/dana.png">
                  <img class="box" src="asset/image/bobobox.png">
                  <img class="box" src="asset/image/Vidio.png">
                  <img class="box" src="asset/image/jnt.png">
                </div>
                <div class="flex-row">
                    <img class="box" src="asset/image/disney.png">
                    <img class="box" src="asset/image/erigo.png">
                    <img class="box" src="asset/image/ajaib.png">
                    <img class="box" src="asset/image/Traveloka.png">
                  </div>
            </div>   
        </div>
    </section>

     <!--Footer-->
    <footer>
        <h1>AGEN-Z</h1>
        <p>&copy; 2022 All Right Reserved</p>
    </footer>

</body>

</html>
