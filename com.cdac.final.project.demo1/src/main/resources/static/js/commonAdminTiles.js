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
    $("#generate_gprn").click((e)=>{
        e.preventDefault();
        var courseName = $("#course_name_gprn").val();
        $.ajax({
            url: "/portal/generate/"+courseName,
            type: "POST",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               if(data.data == "DONE"){
                //append SUCCESS MESSAGE ON UI.
               }else{
                //append FAILURE MESSAGE ON UI
               }
            },
            error: (error) => {
               //append FAILURE MESSAGE ON Ui
            }
         }); 
    });

    $("#question_ppr_upload").click((e)=>{
        e.preventDefault();
        var subject = $("#subject").val();
        var path = $("#question_ppr").val();
        $.ajax({
            url: "/portal/questions",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "subject": subject, 
                "filePath" : path
            }),
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               if(data.data == "DONE"){
                //append SUCCESS MESSAGE ON UI.
                $("#subject").val("");
                $("#question_ppr").val("");
               }else{
                //append FAILURE MESSAGE ON UI
                $("#subject").val("");
                $("#question_ppr").val("");
               }
            },
            error: (error) => {
               //append FAILURE MESSAGE ON Ui
               $("#subject").val("");
               $("#question_ppr").val("");
            }
         }); 
    });

});