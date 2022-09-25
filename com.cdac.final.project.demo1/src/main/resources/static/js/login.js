$(document).ready(function(){
    $("#loginForm").submit(function(e){
        e.preventDefault(); 
        var userName = $("#prnNo").val();
        var password = $("#password").val();
        if((userName == "")||(password == "")){
            window.alert("All fields are mandatory!");
            return;
        }
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/portal/home/sign-in",
            data: JSON.stringify({
                    "user": userName, 
                    "password" : password
                }),
            success: function(returnedData){
                localStorage.setItem("token",returnedData.token);
                if(returnedData.uRole == "ADMIN"){ 
                    $.ajax({
                        url: "/portal/admin",
                        type: "GET",
                        beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
                        success: (data) => {
                           $("body").html(data);
                        }
                     }); 
                }else{
                    $.ajax({
                        url: "/portal/dashboard",
                        type: "GET",
                        beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
                        success: (data) => {
                            $("body").html(data);
                        }
                     }); 
                }
            },
            dataType: "json"
          });
    });
});