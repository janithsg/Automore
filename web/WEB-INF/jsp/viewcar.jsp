<%-- 
    Document   : viewcar
    Created on : Oct 20, 2017, 5:33:37 PM
    Author     : Janith
--%>

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
                    <div class="form-group">
                        <div class="input-group">
                            <input class="form-control" type="text" name="search" placeholder="Search" required/>
                            <span class="input-group-btn">
                                <button class="btn btn-success" type="submit"><span class="glyphicon glyphicon-search" aria-hidden="true"><span style="margin-left:10px;">Search</span></button>
                            </span>
                            </span>
                        </div>
                    </div>
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
                        <table class="table table-striped" style="width: auto !important;">
                            <thead>
                            <th style="display: none;" width="20%"></th>
                            <th style="display: none;" width="80%"></th>
                            </thead>
                            <tbody>
                                <tr>
                                    <%
                                        String stat = (String) request.getAttribute("status");
                                        if (stat.equals("got")) {
                                            Vehicle vehicle = (Vehicle) request.getAttribute("vehicle");
                                            Brand brand = vehicle.getBrand();
                                            ArrayList<Model> models = new ArrayList<>(vehicle.getModels());
                                            Model model = models.get(0);

                                            out.print("<tr><td id=\"vdetail\">Brand </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(brand.getBrandName());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Vehicle Name </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(vehicle.getVehicleName());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Successor </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(vehicle.getSuccessor());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Model Name </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getModelName());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Model Year </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getYear());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">IntroDate </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getIntroDate());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Status </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getStatus());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">BodyType </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getBodyType());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">NoDoors </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getNoDoors());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">NoSeats </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getNoSeats());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">NoPassengers </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getNoPassengers());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">CarType </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getCarType());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Colors </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getColors());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">DriveType </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getDriveType());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">EngineType </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getEngineType());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">EngineDescription </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getEngineDescription());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">AvgConsumption </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getAvgConsumption());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">CoEmmission </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getCoEmmission());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Transtype </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getTranstype());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">NoGears </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getNoGears());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">FrontSus </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getFrontSus());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">RearSus </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getRearSus());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">FrontBrake </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getFrontBrake());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">RearBrake </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getRearBrake());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">NoAirbags </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getNoAirbags());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Ncap </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getNcap());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Acceleration </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getAcceleration());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">TopSpeed </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getTopSpeed());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">HorsePower </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getHorsePower());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">CargoTrunkCapacity </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getCargoTrunkCapacity());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Length </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getLength());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Width </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getWidth());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Height </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getHeight());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Wheelbase </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getWheelbase());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">GroundClearance </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getGroundClearance());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Features </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getFeatures());
                                            out.print("</td></tr>");

                                            out.print("<tr><td id=\"vdetail\">Price </td>");
                                            out.print("<td id=\"vitem\">");
                                            out.print(model.getPrice());
                                            out.print("</td></tr>");

                                        } else {
                                            out.print("Vehicle Details Not Found.");
                                        }
                                    %>
                                </tr>
                            </tbody>
                        </table>
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
