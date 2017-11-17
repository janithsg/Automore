// Registration

$("#regbtn").click(function (e) {
    alert("called");
    e.preventDefault();
    console.log($("#profpic").val());
    $.ajax({
        type: "POST",
        url: "register",
        async: true,
        data: $("#regfrm").serialize(),
        contentType: "multipart/form-data",
        processData: false,
        success: function (result) {
            if (result == "done") {
                alert("done.");
                $("#notification").removeClass("hidden");
            } else {
                alert(result);
                $("#failmsg").removeClass("hidden");
            }
        },
        error: function (result) {
            alert(result);
            $("#failmsg").removeClass("hidden");
        }
    });
});

// Add Vehicle

$("#refreshbtn").click(function (e) {
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "getAllBrands",
        data: {
        },
        success: function (result) {
            var names = result;
            var bArray = names.split(":");
            $("option").remove();
            $("#brandcmb").append("<option value=\"\">Choose a Brand</option>");
            for (i = 0; i < bArray.length; i++) {
                var item = "<option value=\"" + i + "\">" + bArray[i] + "</option>"
                $("#brandcmb").append(item);
            }
        },
        error: function (result) {
            $("#failmsg").removeClass("hidden");
        }
    });
});

$("#addvbtn").click(function (e) {
    e.preventDefault();
    $.ajax({
        type: "POST",
        url: "savecar",
        data: {
            brand: $("#brandcmb").val(),
            vname: $("#carname").val(),
            successor: $("#successor").val()
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