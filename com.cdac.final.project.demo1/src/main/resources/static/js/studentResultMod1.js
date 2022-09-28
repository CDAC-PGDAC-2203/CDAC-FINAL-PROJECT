$(document).ready(() => {
    $.ajax({
        url: "/portal/result/"+ localStorage.getItem("uPrn") +"/mod1",
        type: "GET",
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            if(data == "" || data == null){
                alert("RESULT NOT FOUND!");
            }
            $("#prn").append(localStorage.getItem("uPrn"));
            $("#studentname").append(data.name);
            $("#module").append("Core Java");
            $("#labmarks").append(data.lab);
            $("#internalmarks").append(parseInt(data.assessment)+parseInt(data.attendance));
            $("#totalmarks").append(parseInt(data.assessment)+parseInt(data.attendance)+parseInt(data.lab));
        },
        error: (error) => {
            alert("RESULT NOT FOUND!");
        }
    });
});