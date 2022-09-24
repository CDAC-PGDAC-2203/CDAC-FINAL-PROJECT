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
                if(returnedData.uPrn == 11111){
                    //admin navigation
                    $.ajax({
                        type: "GET",
                        url: "/portal/admin",
                        headers: {"Authorization": localStorage.getItem("token")}
                        });

                }else{
                    $.ajax({
                        type: "GET",
                        url: "/portal/admin",
                        headers: {"Authorization": localStorage.getItem("token")}
                        });
                }
            },
            dataType: "json"
          });
    });
});