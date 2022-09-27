$(document).ready(()=>{
    $("#chPassword").click((e)=>{
        var success = "<h6 style='color:green'>Password changed successfully!</h6>"
        var failure = "<h6 style='color:red'>Old password incorrect / New & Retype doesn't match!</h6>"

        e.preventDefault();
        var oldPassword = $("#oldPassword").val();
        var newPassword = $("#newPassword").val();
        var newRetypePassword = $("#newRetypePassword").val();
        if(newPassword !== newRetypePassword){
            $("#message").append(failure);
            return;
        }
        $.ajax({
            url: "/portal/profile",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "oldPassword": oldPassword,
                "newPassword": newPassword,
                "uPrn": localStorage.getItem("uPrn")
            }),
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               if(data.data == "DONE"){
                 $("#message").append(success);
                 $("#noticeNameFlag").val("");
               }else{
                 $("#message").append(failure);
                 $("#noticeNameFlag").val("");
               }
            },
            error: (error) => {
               $("#message").append(failure);
               $("#noticeNameFlag").val("");
            }
           }); 
        });
});