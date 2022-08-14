<%-- 
    Document   : deleteData
    Created on : Jul 26, 2022, 10:40:43 PM
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
    <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="asset/css/styleDelete.css">
    <title>Delete Data | Agen-Z</title>
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
        <%
            String id = request.getParameter("id");
        %>      
        <section class="main-content">
            <div class="container">
		<div class="row">
                    <div class="col-sm-8 col-md-6 offset-sm-2 offset-md-3 mt-3">
                        <div class="info-card info-card--danger bg-white text-center mb-4 rounded-lg">
                            <div class="info-card_icon mx-auto mb-4 d-flex justify-content-center align-items-center position-relative">
				<i class="fa fa-trash"></i>
                            </div>
                            <form method="get" action="../delete">
                                <h2 class="mb-4"> <b>Do you really want to delete this file ?</b> </h2>
				<div class="mb-4">Once deleted cannot be recovered. Here something is being deleted.</div>
                                <div class="d-flex">
                                    <input type="hidden" id="id" name="id" value="<%=id%>"/>
                                    <a href="viewData.jsp" class="btn btn-secondary w-50 mr-1">Cancel</a>
                                    <input type="submit" class="btn btn-danger w-50 ml-1" value="Delete"/>
                                </div>
                            </form>	
                        </div>
                    </div>
		</div>
            </div>
	</section>
</body>
</html>
