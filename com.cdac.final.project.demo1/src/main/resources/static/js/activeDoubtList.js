$(document).ready(()=>{
    $("button").click((e)=>{
        e.preventDefault();
        var doubtId = $(this).val();
        console.log(doubtId);
        $.ajax({
           url: "/portal/doubt/"+doubtId,
           type: "PUT",
           beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
           success: (data) => {
              if(data.data == "DONE"){
                 $("#course_name_gprn").val("");
                 $("#message").append(success);
              }else{
                 $("#course_name_gprn").val("");
                 $("#message").append(failure);
              }
           },
           error: (error) => {
              $("#course_name_gprn").val("");
              $("#message").append(failure);
           }
        }); 
     
    });

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
                             + "<td scope='row'><button id='" + element.doubtId + "' value='" + element.doubtId + "'>Solved</button></td>"
                             + "</tr>";
                $("#doubtTable").append(tableRow);
            });
        },
        error: (error) => {
           //append FAILURE MESSAGE ON Ui
        }
     });

     
});