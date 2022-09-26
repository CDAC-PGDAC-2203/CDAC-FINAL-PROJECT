$(document).ready(() => {
    $("#student_profile").click(function () {
        $.ajax({
            type: "GET",
            url: "/portal/profile",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });
});
