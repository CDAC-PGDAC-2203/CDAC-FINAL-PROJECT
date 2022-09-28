$(document).ready(()=>{

    $("#mod1Result").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/result/mod1",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#mod2Result").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/result/mod2",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });
});