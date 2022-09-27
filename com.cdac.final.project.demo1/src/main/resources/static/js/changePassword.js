$(document).ready(()=>{
    $("#chPassword").click((e)=>{

        e.preventDefault();
        $("#message").html("");
        if(validOldPasword && validNewPassword && validRetypePassword){
          var oldPassword = $("#oldPassword").val();
          var newPassword = $("#newPassword").val();
          var newRetypePassword = $("#newRetypePassword").val();
          if(newPassword !== newRetypePassword){
              $("#message").html("<h6 style='color:red'>New & Retype password doesn't match!</h6>");
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
                   $("#message").html("<h6 style='color:green'>Password changed successfully!</h6>")
                   $("#oldPassword").val("");
                   $("#newPassword").val("");
                   $("#newRetypePassword").val("");
                 }else{
                   $("#message").html("<h6 style='color:red'>Old Password incorrect!</h6>");
                   $("#oldPassword").val("");
                   $("#newPassword").val("");
                   $("#newRetypePassword").val("");
                 }
              },
              error: (error) => {
                 $("#message").html("<h6 style='color:red'>Error! Password not changed</h6>");
                 $("#oldPassword").val("");
                 $("#newPassword").val("");
                 $("#newRetypePassword").val("");
              }
             }); 
        }else{
          $("#message").html("<h6 style='color:red'>All fields are mandatory!</h6>");
          $("#oldPassword").val("");
          $("#newPassword").val("");
          $("#newRetypePassword").val("");
        }
        
        });

        //Validation
        var validOldPasword= false;
        $("#oldPassword").blur(function(){
           var oldPassword = $("#oldPassword").val()
           if (oldPassword == ""){
            $("#changeOldPassword_message").html(" Password can not be Null!");
           }else{
            $("#changeOldPassword_message").html("");
              validOldPasword = true;
           }
        });
        var validNewPassword= false;
        $("#newPassword").blur(function(){
           var newPassword = $("#newPassword").val()
           if (newPassword == ""){
            $("#changeNewPassword_message").html(" Password can not be Null!");
           }else{
            $("#changeNewPassword_message").html("");
               validNewPassword = true;
           }
        });
        var validRetypePassword= false;
        $("#newRetypePassword").blur(function(){
           var newRetypePassword = $("#newRetypePassword").val()
           if (newRetypePassword == ""){
            $("#changeRetypePassword_message").html(" Password can not be Null!");
           }else{
            $("#changeRetypePassword_message").html("");
              validRetypePassword = true;
           }
        });
});