$(document).ready(()=>{
    $("#adminDashboard").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               $("body").html(data);
            }
         }); 
    });
});