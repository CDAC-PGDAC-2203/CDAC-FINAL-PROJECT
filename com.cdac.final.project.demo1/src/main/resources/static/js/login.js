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
            url: "/portal/signin",
            data: JSON.stringify({
                    "user": userName, 
                    "password" : password
                }),
            success: function(returnedData){
                console.log(returnedData);
            },
            dataType: "json"
          });
    });
});