<%-- 
    Document   : header
    Created on : Oct 10, 2017, 11:12:19 PM
    Author     : Janith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Register</title>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link  rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/style.css">
    </head>

    <body>
        <%@ include file="header.jsp" %>

        <div class="container">
            <div class="row">
                <div class="col-md-2">

                </div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading">Become a Member</div>
                        <br>
                        <form class="form-horizontal" enctype="multipart/form-data">
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="fullname">Full Name:</label>
                                <div class="col-sm-8">
                                    <input class="form-control" type="text" id="fullname" placeholder="Enter Full Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="phone">Mobile Number:</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="phone" placeholder="Enter Mobile Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="email">Email:</label>
                                <div class="col-sm-8">
                                    <input type="email" class="form-control" id="email" placeholder="Enter email">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="pwd">Password:</label>
                                <div class="col-sm-8"> 
                                    <input type="password" class="form-control" id="pwd" placeholder="Enter password">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="profpic">Profile Picture:</label>
                                <div class="col-sm-8"> 
                                    <input type="file" class="form-control" id="profpic" placeholder="Select File">
                                </div>
                            </div>
                            <div class="form-group"> 
                                <div class="col-sm-offset-2 col-sm-10">
                                    <div class="checkbox">
                                        <label><input type="checkbox"> I accept the agreement.</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <div class="g-recaptcha" data-sitekey="6LeEzDQUAAAAAJy0OBeQTsC4UX0GBdBMiycWx5Eb"></div>
                                </div>
                            </div>
                            <div class="form-group"> 
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="button" id="regbtn" class="btn btn-default">Register</button>
                                </div>
                            </div>
                        </form>
                        <div id="notification" class="alert alert-success hidden">
                            <strong>Success!</strong> You are now a registered member.
                        </div>
                        <div id="failmsg" class="alert alert-danger hidden">
                            <strong>Failed!</strong> Failed to Save Your Details.Please Try Again.
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="resources/js/jquery-3.2.1.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <script src="resources/js/script.js"></script>
        <%@ include file="footer.jsp" %> 
    </body>
</html>
