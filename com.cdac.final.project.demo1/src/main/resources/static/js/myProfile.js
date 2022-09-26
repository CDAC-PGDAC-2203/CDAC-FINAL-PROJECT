$(document).ready(()=>{

    $("#dashboardNav").click((e)=>{
        e.preventDefault();
        $.ajax({
            type: "GET",
            url: "/portal/dashboard",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
         });
    });

    $.ajax({
        url: "/portal/profile/"+localStorage.getItem("uPrn"),
        type: "GET",
        beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
        success: (data) => {
            $("#uName").append(data.name);
            $("#profileCourseName").append(data.course);
            $("#uPrn").append(data.u_prn);
            $("#genderId").append(data.gender);
            $("#dobId").append(data.dob);
            $("#emailId").append(data.email);
            $("#phoneNo").append(data.phone);
            var address = data.address1 + " " + data.address2 
                        + ", City: " + data.city +", State: " 
                        + data.state +", PinCode: " + data.pincode;
            $("#addressId").append(address);
            document.querySelector("#photo").style.backgroundImage = `url(${data.photo})`;
            document.querySelector("#photo").style.backgroundRepeat = "no-repeat";
            document.querySelector("#photo").style.backgroundSize = "contain";
        },
        error: (error) => {
           alert("Internal Server Error! Please contact Administrator");
        }
     });


     $("#changePassword").click((e) => {
        e.preventDefault();
        $.ajax({
            type: "GET",
            url: "/portal/profile/change",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
         });
     });

	$("#logout").click((e) => {
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/logout",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                localStorage.removeItem("token");
                localStorage.removeItem("uPrn");
                $("body").html(data);
            }
         });

    });
});