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

    $("#attendance_file_upload").click((e)=>{
      e.preventDefault();
      var subject = $("#subjectAttendance").val();
      var path = $("#attendance_file").val();
      $.ajax({
          url: "/portal/attendance",
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
              $("#subjectAttendance").val("");
              $("#attendance_file").val("");
             }else{
              //append FAILURE MESSAGE ON UI
              $("#subjectAttendance").val("");
              $("#attendance_file").val("");
             }
          },
          error: (error) => {
             //append FAILURE MESSAGE ON UI
             $("#subjectAttendance").val("");
             $("#attendance_file").val("");
          }
       }); 
  });

  $("#result_upload").click((e)=>{
   e.preventDefault();
   var subject = $("#subjectResult").val();
   var course = $("#course_name").val();
   var path = $("#resultPath").val();
   $.ajax({
       url: "/portal/result",
       type: "POST",
       contentType: "application/json",
       data: JSON.stringify({
           "subject": subject, 
           "filePath" : path,
           "course": course
       }),
       beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
       success: (data) => {
          if(data.data == "DONE"){
           //append SUCCESS MESSAGE ON UI.
           $("#subjectResult").val("");
           $("#attendance_file").val("");
           $("#course_name").val("");
          }else{
           //append FAILURE MESSAGE ON UI
           $("#subjectResult").val("");
           $("#attendance_file").val("");
           $("#course_name").val("");
          }
       },
       error: (error) => {
          //append FAILURE MESSAGE ON UI
          $("#subjectResult").val("");
          $("#attendance_file").val("");
          $("#course_name").val("");
       }
    }); 
   });

   $("#courseSubmit").click((e)=>{
      e.preventDefault();
      var course = $("#courseName").val();
      $.ajax({
         url: "/portal/feedback/"+course,
         type: "GET",
         beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
         success: (data) => {
 
             data.forEach((element) =>{
                 var tableRow = "<tr style='font-family: helvetica;'>" 
                              + "<td scope='row'>" + element.uPrn + "</td>"
                              + "<td scope='row'>" + element.faculty + "</td>"
                              + "<td scope='row'>" + element.module + "</td>"
                              + "<td scope='row'>" + element.parameter1 + "</td>"
                              + "<td scope='row'>" + element.parameter2 + "</td>"
                              + "<td scope='row'>" + element.parameter3 +"</td>"
                              + "<td scope='row'>" + element.parameter4 +"</td>"
                              + "<td scope='row'>" + element.parameter5 +"</td>"
                              + "<td scope='row'>" + element.parameterTotal +"</td>"
                              + "<td scope='row'>" + element.suggestion +"</td>"
                              + "</tr>";
                 $("#feedbackTableBody").append(tableRow);
             });
             $("#courseName").val("");
         },
         error: (error) => {
            //append FAILURE MESSAGE ON Ui
         }
      }); 
   });

   $("#faculty_list_upload").click((e)=>{
      e.preventDefault();
      var subject = $("#course_name").val();
      var path = $("#faculty_list").val();
      $.ajax({
          url: "/portal/faculty",
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
              $("#course_name").val("");
              $("#faculty_list").val("");
             }else{
              //append FAILURE MESSAGE ON UI
              $("#course_name").val("");
              $("#faculty_list").val("");
             }
          },
          error: (error) => {
             //append FAILURE MESSAGE ON UI
             $("#course_name").val("");
             $("#faculty_list").val("");
          }
       }); 
  });

  $("#faculty_feedback_upload").click((e)=>{
   e.preventDefault();
   var flag = $("input[name='flag']:checked").val();
   var course = $("#course_name").val();
   var faculty = $("#faculty_name").val();
   $.ajax({
       url: "/portal/faculty/"+flag+"/"+faculty+"/"+course,
       type: "PUT",
       contentType: "application/json",
       beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
       success: (data) => {
          if(data.data == "DONE"){
           //append SUCCESS MESSAGE ON UI.
           $("#course_name").val("");
           $("#faculty_name").val("");
          }else{
           //append FAILURE MESSAGE ON UI
           $("#course_name").val("");
           $("#faculty_name").val("");
          }
       },
       error: (error) => {
          //append FAILURE MESSAGE ON UI
          $("#course_name").val("");
          $("#faculty_name").val("");
       }
      }); 
   });

   $("#lecture_link_upload").click((e)=>{
      e.preventDefault();
      var subject = $("#subject").val();
      var session_date = $("#session_date").val();
      var theoryLink = $("#theory_time").val() + "_" + $("#theory_link").val();
      var b1Link = $("#b1_time").val() + "_" + $("#b1_link").val();
      var b2Link = $("#b2_time").val() + "_" + $("#b2_link").val();
      var b3Link = $("#b3_time").val() + "_" + $("#b3_link").val();
      var b4Link = $("#b4_time").val() + "_" + $("#b4_link").val();
      $.ajax({
          url: "/portal/links",
          type: "POST",
          contentType: "application/json",
          data: JSON.stringify({
              "course": subject, 
              "sessionDate": session_date,
              "theoryLink": theoryLink,
              "b1Link": b1Link,
              "b2Link": b2Link,
              "b3Link": b3Link,
              "b4Link": b4Link
          }),
          beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
          success: (data) => {
             if(data.data == "DONE"){
              //append SUCCESS MESSAGE ON UI.
              $("#course_name").val("");
              $("#faculty_list").val("");
             }else{
              //append FAILURE MESSAGE ON UI
              $("#course_name").val("");
              $("#faculty_list").val("");
             }
          },
          error: (error) => {
             //append FAILURE MESSAGE ON UI
             $("#course_name").val("");
             $("#faculty_list").val("");
          }
       }); 
  });
});