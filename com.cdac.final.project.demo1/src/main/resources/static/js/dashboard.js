$(document).ready(() => {

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

    $("#student_profile").click((e)=>{
        e.preventDefault();
        $.ajax({
            type: "GET",
            url: "/portal/profile",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
         });
    });

});
