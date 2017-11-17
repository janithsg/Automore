
// Models

$("#refreshbtn").click(function (e) {
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "getAllVehicle",
        data: {
        },
        success: function (result) {
            var names = result;
            var bArray = names.split(":");
            $("option").remove();
            $("#vehiclecmb").append("<option value=\"\">Choose a Vehicle</option>");
            for (i = 0; i < bArray.length; i++) {
                var item = "<option value=\"" + i + "\">" + bArray[i] + "</option>"
                $("#vehiclecmb").append(item);
            }
        },
        error: function (result) {

        }
    });
});

$("#modelsavebtn").click(function (e) {
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "savemodel",
        data: {
            vehicle:$("#vehiclecmb").val(),
            modelName: $("#modelname").val(),
            year: $("#modelyear").val(),
            introDate: $("#introdate").val(),
            status: $("#status").val(),
            bodyType: $("#bodytype").val(),
            noDoors: $("#nodoors").val(),
            noSeats: $("#noseats").val(),
            noPassengers: $("#nopass").val(),
            carType: $("#carType").val(),
            colors: $("#colors").val(),
            driveType: $("#drivetype").val(),
            engineType: $("#enginetype").val(),
            engineDescription: $("#enginedesc").val(),
            avgConsumption: $("#avgfuel").val(),
            coEmmission: $("#coem").val(),
            transtype: $("#transtype").val(),
            noGears: $("#nogears").val(),
            frontSus: $("#fsus").val(),
            rearSus: $("#rsus").val(),
            frontBrake: $("#fbreak").val(),
            rearBrake: $("#rbreak").val(),
            noAirbags: $("#noairbags").val(),
            ncap: $("#ncap").val(),
            acceleration: $("#acceleration").val(),
            topSpeed: $("#tspeed").val(),
            horsePower: $("#hpower").val(),
            cargoTrunkCapacity: $("#trunkcap").val(),
            length: $("#blength").val(),
            width: $("#bwidth").val(),
            height: $("#bheight").val(),
            wheelbase: $("#wbase").val(),
            groundClearance: $("#gclearance").val(),
            features: $("#features").val(),
            price: $("#price").val(),
            imgPath: $("#imgpath").val()
        },
        success: function (result) {
            if (result == "done") {
                alert("done.");
                $("#notification").removeClass("hidden");
            } else {
                alert("error.");
                $("#failmsg").removeClass("hidden");
            }
        },
        error: function (result) {
            $("#failmsg").removeClass("hidden");
        }
    });
});