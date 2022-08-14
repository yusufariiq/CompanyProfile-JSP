<%-- 
    Document   : error
    Created on : Jul 25, 2022, 11:09:24 PM
    Author     : Ariiq Yusuf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>404 NOT FOUND</title>

    <style>
        @import url('https://fonts.googleapis.com/css?family=Ruda:400,700');
        #header, #outer-wrapper, #post-wrapper, #sidebar-wrapper, #content-wrapper, #footer-wrapper, #wrapper, .ignielToTop {display:none}
        body,html {overflow:hidden; margin:0; padding:0; width:100%; min-height:100vh}
        body {background:#f7f7f7; color:#1d1d1d}
        #agenz404 {background:#eceeee; text-align:center; margin:auto; font-weight:700; font-size:45px; font-family:'Ruda',sans-serif; position:fixed; width:100%; height:100%; line-height:1.25em; z-index:9999;}
        #agenz404 #error-text {position:relative; font-size:40px; color:rgb(6, 6, 6); top:50%; right:50%; transform:translate(50%,-50%);}
        #agenz404 #error-text a {color:#1d1d1d; text-decoration:none}
        #agenz404 #error-text p {margin:0!important; letter-spacing:.5px;}
        #agenz404 #error-text span {color:#000000;font-size:100px;}
        #agenz404 #error-text a.back {background:#1d1d1d;color:#f7f7f7;padding:10px 20px;font-size:20px;-webkit-transform:scale(1);-moz-transform:scale(1);transform:scale(1);transition:all 0.5s ease-out;}
        #agenz404 #error-text a.back:hover {background:#333;color:#f7f7f7;}
        #agenz404 #error-text a.back:active {-webkit-transform:scale(0.9);-moz-transform:scale(0.9);transform:scale(0.9);background:#333;color:#fff;border:double #eceeee;}
        
        @media only screen and (max-width:640px){
          #agenz404 #error-text {font-size:20px;}
          #agenz404 #error-text span {font-size:60px;}
          #agenz404 #error-text a.back {padding:5px 10px;font-size:15px;}
          #agenz404 #error-text a.back:hover, #agenz404 #error-text a.back:active {border:0;}
        }
      </style>
</head>
<body>
  <div id='agenz404'>
    <div id='error-text'>
      <span>404</span>
      <p>WEBSITE NOT FOUND!</p>
      <p><a class='back' href='../login.jsp'>Back To Home </a></p>
    </div>
  </div>
</b:if>
</body>
</html>
