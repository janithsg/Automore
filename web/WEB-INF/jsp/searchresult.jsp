<%-- 
    Document   : viewcar
    Created on : Oct 20, 2017, 5:33:37 PM
    Author     : Janith
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.ijse.automore.model.Brand"%>
<%@page import="edu.ijse.automore.model.Vehicle"%>
<%@page import="edu.ijse.automore.model.Model"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add Vehicle Model</title>
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
                    <form action="/Automore/search">
                        <div class="form-group">
                            <div class="input-group">
                                <input class="form-control" type="text" name="nametxt" placeholder="Car Model" required/>
                                <span class="input-group-btn">
                                    <button class="btn btn-success" type="submit"><span class="glyphicon glyphicon-search" aria-hidden="true"><span style="margin-left:10px;">Search</span></button>
                                </span>
                                </span>
                            </div>
                        </div>
                    </form>

                </div>
                <div class="col-md-2">

                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <div class="panel panel-default">
                        <div class="panel-heading">Brands</div>
                        <div class="panel-body">
                            <div class="list-group">
                                <a href="#" class="list-group-item">First item</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="panel panel-default">
                        <div class="list-group">
                            <%
                                List<Model> list = (List<Model>) request.getAttribute("rst");

                                if (list != null) {
                                    //for (Vehicle v : list) {
                                    //ArrayList<Model> models = new ArrayList<>(v.getModels());
                                    for (Model m : list) {
                                        out.print("<a href=\"" + "v" + m.getModelId() + "\" class=\"list-group-item\">" + m.getModelName() + "</a>");
                                    }
                                    //}
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="resources/js/mscript.js"></script>
        <%@ include file="footer.jsp" %> 
    </body>
</html>
