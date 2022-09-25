$(document).ready(()=>{
    $.ajax({
        url: "/portal/doubts",
        type: "GET",
        beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
        success: (data) => {

            data.forEach((element) =>{
                var tableRow = "<tr style='font-family: helvetica;'>" 
                             + "<td scope='row'>" + element.userPrn + "</td>"
                             + "<td scope='row'>" + element.userName + "</td>"
                             + "<td scope='row'>" + element.email + "</td>"
                             + "<td scope='row'>" + element.subjectName + "</td>"
                             + "<td scope='row'>" + element.doubtContent + "</td>"
                             + "<td scope='row'>" + element.attachment +"</td>"
                             + "</tr>";
                $("#doubtTable").append(tableRow);
            });
        },
        error: (error) => {
           //append FAILURE MESSAGE ON Ui
        }
     }); 
});