<%-- 
    Document   : home
    Created on : Oct 18, 2017, 11:02:31 AM
    Author     : Janith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>AutoMore</title>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link  rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/style.css">
    </head>

    <body>
        <%@ include file="header.jsp" %>

        <div class="container">
            <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3000">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner">

                    <div class="item active">
                        <img src="resources/img/Benz.jpg" alt="Los Angeles" style="width:100%;">
                        <div class="carousel-caption">
                            <h3>Mercedez Benz</h3>
                            <p>S-Class Luxury Coupe</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="resources/img/Audi.jpg" alt="Chicago" style="width:100%;">
                        <div class="carousel-caption">
                            <h3>Audi</h3>
                            <p>Audi A4 Saloon White Edition</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="resources/img/BMW.jpg" alt="New York" style="width:100%;">
                        <div class="carousel-caption">
                            <h3>BMW</h3>
                            <p>THE BMW 7 SERIES.</p>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <br>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Brands</div>
            </div>
        </div>

        <script src="resources/js/jquery-3.2.1.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <%@ include file="footer.jsp" %> 
    </body>
</html>
