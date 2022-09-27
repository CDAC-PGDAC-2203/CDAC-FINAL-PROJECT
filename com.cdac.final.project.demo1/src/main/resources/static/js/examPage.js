$(document).ready(()=>{

    $("#mod1Exam").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/exam/mod1",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#mod2Exam").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/exam/mod2",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });
});