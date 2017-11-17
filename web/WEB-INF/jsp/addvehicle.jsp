<%-- 
    Document   : addcar
    Created on : Oct 20, 2017, 8:30:20 AM
    Author     : Janith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add New Vehicle</title>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link  rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/style.css">
        <script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
    </head>

    <body>
        <%@ include file="header.jsp" %>

        <div class="container">
            <div class="row">
                <div class="col-md-2">

                </div>
                <div class="col-md-8">
                    <div class="panel panel-default">
                        <div class="panel-heading">Add New Car</div>
                        <br>
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="brand">Brand:</label>
                                <div class="col-sm-8">
                                    <div class="form-group">
                                        <div class="col-xs-5 selectContainer">
                                            <select class="form-control" id="brandcmb" name="brand">
                                                <option value="">Choose a Brand</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <button class="btn-success" id="refreshbtn" type="button">Refresh</button>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="carname">Vehicle Name:</label>
                                <div class="col-sm-8">
                                    <input class="form-control" type="text" name="carname" id="carname" placeholder="Enter Vehicle Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="successor">Successor:</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="successor" type="text" name="successor" placeholder="Enter Successor Name">
                                </div>
                            </div>
                            <div class="form-group"> 
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="button" id="addvbtn" class="btn btn-default">Save</button>
                                </div>
                            </div>
                        </form>
                        <div id="notification" class="alert alert-success hidden">
                            <strong>Success!</strong> The Vehicle Details Has Saved.
                        </div>
                        <div id="failmsg" class="alert alert-danger hidden">
                            <strong>Failed!</strong> Failed to Save Details.Please Try Again.
                        </div>
                    </div>
                </div>
            </div>
        </div>

        
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="resources/js/script.js"></script>
        <%@ include file="footer.jsp" %> 
    </body>
</html>
