<%-- 
    Document   : addcar
    Created on : Oct 20, 2017, 8:30:20 AM
    Author     : Janith
--%>

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
                    <div class="panel panel-default">
                        <div class="panel-heading">Add New Car Model</div>
                        <br>
                        <form class="form-horizontal" id="modeldetailfrm">
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="vehiclecmb">Vehicle:</label>
                                <div class="col-sm-7">
                                    <div class="form-group">
                                        <div class="col-xs-7 selectContainer">
                                            <select class="form-control" id="vehiclecmb" name="vehiclecmb">
                                                <option value="">Choose a Vehicle</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <button class="btn-success" id="refreshbtn" type="button">Refresh</button>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="modelname">Model Name:</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="modelname" type="text" name="modelname" placeholder="Enter Model Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="modelyear">Model Year:</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="modelyear" type="text" name="modelyear" placeholder="Enter Model Year">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="introdate">Introduced:</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="introdate" type="text" name="introdate" placeholder="Enter Introduced Date/Year">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="status">Status :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="status" type="text" name="status" placeholder="Enter Current Status">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="bodytype">Body Type :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="bodytype" type="text" name="bodytype" placeholder="Enter Body Type">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="nodoors">No of Doors :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="nodoors" type="text" name="nodoors" placeholder="Enter The No Of Doors">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="noseats">No of Seats :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="noseats" type="text" name="noseats" placeholder="Enter The No Of Seats">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="nopass">No of Passengers :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="nopass" type="text" name="nopass" placeholder="Enter The No Of Passengers">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="carType">Car Type :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="carType" type="text" name="carType" placeholder="Enter Car Type">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="colors">Colors :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="colors" type="text" name="colors" placeholder="Enter Available Colors">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="drivetype">Drive Type :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="drivetype" type="text" name="drivetype" placeholder="Drive Type eg:Front Wheel Drive, Rear Wheel Drive">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="enginetype">Engine Type :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="enginetype" type="text" name="enginetype" placeholder="Engine Type eg: Petrol, Diesel, Electric">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="enginedesc">Engine Description :</label>
                                <div class="col-sm-5">
                                    <textarea class="form-control" form="modeldetailfrm" id="enginedesc" name="enginedesc" placeholder="Engine Description"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="avgfuel">Average Consumption :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="avgfuel" type="text" name="avgfuel" placeholder="Average Fuel Consumption">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="coem">CO2 Emission :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="coem" type="text" name="coem" placeholder="Average CO2 Emission">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="transtype">Transmission Type :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="transtype" type="text" name="transtype" placeholder="Transmission Type eg: Auto, Manual">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="nogears">No Of Gears :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="nogears" type="text" name="nogears" placeholder="No Of Gears">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="fsus">Front Suspension :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="fsus" type="text" name="fsus" placeholder="Front Suspension Details">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="rsus">Rear Suspension :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="rsus" type="text" name="rsus" placeholder="Rear Suspension Details">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="fbreak">Front Brakes :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="fbreak" type="text" name="fbreak" placeholder="Front Brakes Details">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="rbreak">Rear Breaks :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="rbreak" type="text" name="rbreak" placeholder="Rear Brakes Details">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="noairbags">No Of AirBags :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="noairbags" type="text" name="noairbags" placeholder="No Of Airbags">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="ncap">NCAP rating :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="ncap" type="text" name="ncap" placeholder="NCAP Rating">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="acceleration">Acceleration :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="acceleration" type="text" name="acceleration" placeholder="Acceleration eg: 100kmph in 8.0 Seconds">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="tspeed">Top Speed :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="tspeed" type="text" name="tspeed" placeholder="Top Speed">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="hpower">Horse Powers :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="hpower" type="text" name="hpower" placeholder="Horse Powers">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="trunkcap">Cargo Trunk Capacity :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="trunkcap" type="text" name="trunkcap" placeholder="Trunk Capacity">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="blength">Length :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="blength" type="text" name="blength" placeholder="Length">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="bheight">Height :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="bheight" type="text" name="bheight" placeholder="Height">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="bwidth">Width :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="bwidth" type="text" name="bwidth" placeholder="Width">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="wbase">Wheel Base :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="wbase" type="text" name="wbase" placeholder="Wheel Base">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="gclearance">Ground Clearance :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="gclearance" type="text" name="gclearance" placeholder="Ground Clearance">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="features">Features :</label>
                                <div class="col-sm-5">
                                    <textarea class="form-control" form="modeldetailfrm" id="features" name="features" placeholder="List Of Features"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="price">Price :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="price" type="text" name="price" placeholder="Price in USD">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="imgpath">Image Path :</label>
                                <div class="col-sm-5">
                                    <input class="form-control" id="imgpath" type="text" name="imgpath" placeholder="Image Path">
                                </div>
                            </div>
                            <div class="form-group"> 
                                <div class="col-sm-offset-3 col-sm-10">
                                    <button type="button" id="modelsavebtn" class="btn btn-default">Save</button>
                                </div>
                            </div>
                        </form>
                        <div id="notification" class="alert alert-success hidden">
                            <strong>Success!</strong> Car Model Details Saved.
                        </div>
                        <div id="failmsg" class="alert alert-danger hidden">
                            <strong>Failed!</strong> Failed to Save These Details.Please Try Again.
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
