<%-- 
    Document   : header
    Created on : Oct 17, 2017, 10:29:43 PM
    Author     : Janith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>AutoMore</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link  rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/style.css">

    </head>

    <body>
        <nav class = "navbar navbar-default" role = "navigation" style="background-color: #3c3d41;">

            <div class="container">
                <div class = "navbar-header">
                    <a class = "navbar-brand" href = "#" style="color: white;font-size: xx-large;font-family: fantasy; ">AutoMore</a>
                </div>

                <form class = "navbar-nav navbar-form" role = "search" action="/Automore/search">
                    <input class="form-control col-md-4" id="nametxt" name="nametxt" type="text" placeholder="Car Model">
                </form>


                <div>
                    <ul class = "nav navbar-nav  navbar-right">
                        <li><a href = "home"><i class="fa fa-home fa-lg icon" style="color: red;"></i>Home</a></li>
                        <li><a href = "search"><i class="fa fa-car fa-lg icon" style="color: #ffc100;"></i>Car Finder</a></li>
                        <li><a href = "#"><i class="fa fa-globe fa-lg icon" style="color: #d624ff;"></i>Brands</a></li>
                        <li><a href = "#"><i class="fa fa-info-circle fa-lg icon" style="color: #009eff;"></i>About</a></li>

                        <li class = "dropdown pull-right">
                            <a href = "#" class = "dropdown-toggle" data-toggle = "dropdown">
                                My Account
                                <b class = "caret"></b>
                            </a>

                            <ul class = "dropdown-menu">
                                <li>
                                    <section>
                                        <h4 style="margin-left: 10%; margin-bottom: 5%;">Login to Your Account</h4>
                                        <form class="form-group">
                                            <input class="form-control logcntrl" type="email" placeholder="Email">
                                            <input class="form-control logcntrl" type="password" placeholder="Password">
                                            <input class="form-control btn-success" type="submit" value="Login" style="width: 80%;margin-left: 10%;">
                                        </form>
                                        <h5 class="text-center"> <a href="register"> Register</a> <span>OR</span> Reset Password</h5>
                                    </section>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    </body>
</html>