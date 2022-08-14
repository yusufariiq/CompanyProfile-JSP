<%-- 
    Document   : contact
    Created on : Jul 24, 2022, 9:14:07 PM
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
    <title>Contact  |  Agen-Z</title>
</head>
<body>
    <!-- Start Header -->
    <nav>
        <ul class="menu">
            <li class="logo"><a href="#home"><img src="asset/image/AGEN-Z LOGO.png" alt="" /></a></li>
            <li class="item"><a href="home.jsp">Home</a></li>
            <li class="item"><a href="company.jsp">Company</a></li>
            <li class="item current"><a href="contact.jsp">Contact</a></li>
            <li class="item button first"><a href="login.jsp">Login</a></li>
            <li class="toggle"><a href="#"><span class="fa fa-bars"></span></a></li>
        </ul>
    </nav>
    <!-- End Header -->

    <section class="wrapper">
        <div class="card">
            <div class="text-title">
                <h1>CONTACT US!</h1>
                <p>NEED OR WANNA KNOW MORE ABOUT US ?<p>
                <p>OR NEED FURTHER CUSTOMIZATION?</p>
            </div>
            <div class="icon">
                <a href="#form-area"><i class="fa fa-arrow-circle-down 2"></i></a>
            </div>
        </div>
    </section>

    <section id="form-area">
        <div class="form-container">
            <div class="form-content">
              <div class="left-side">
                <div class="address details">
                  <i class="fas fa-map-marker-alt"></i>
                  <div class="topic">Address</div>
                  <div class="text-one">Jl. Kyai Haji Zainul Arifin, No. 17, RT.5/RW.7, Krukut, Kec. Taman Sari, Kota Jakarta Barat, DKI Jakarta. 11140</div>
                </div>
                <div class="phone details">
                  <i class="fas fa-phone-alt"></i>
                  <div class="topic">Phone</div>
                  <div class="text-one">021-7725-3350</div>
                  <div class="text-two">+62 813-8080-5004</div>
                </div>
                <div class="email details">
                  <i class="fas fa-envelope"></i>
                  <div class="topic">Email</div>
                  <div class="text-one">marketing@agenz.com</div>
                  <div class="text-two">info.agenz@gmail.com</div>
                </div>
              </div>
              <div class="right-side">
                <div class="topic-text">Send us a message</div>
                <p>If you have any work from me or any types of queries related to my company, you can send me message from here. It's our pleasure to help you.</p>
              <form action="contact" method="post">
                <div class="form-input-box">
                  <input type="text" id="name" name="name" for="name" placeholder="Enter your name">
                </div>
                <div class="form-input-box">
                  <input type="text" id="email" name="email" for="email" placeholder="Enter your email">
                </div>
                <div class="form-input-box message-box">
                  <textarea id="messages" name="messages" for="messages" placeholder="Enter your message"></textarea>
                </div>
                <div class="form-button">
                  <input type="submit" value="Send Now" >
                </div>
              </form>
            </div>
            </div>
          </div>
    </section>
    
    <footer>
        <h1>AGEN-Z</h1>
        <p>&copy; 2022 All Right Reserved</p>
    </footer>
</body>
</html>