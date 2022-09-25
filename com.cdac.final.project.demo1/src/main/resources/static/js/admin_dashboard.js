$(document).ready(() => {
    $("#g_prn").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/gprn",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });
});