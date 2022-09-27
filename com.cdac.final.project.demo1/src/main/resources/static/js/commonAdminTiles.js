$(document).ready(()=>{

   var success = "<h4 style='color: green;'>Data Processed Successfully!</h4>";
   var failure = "<h4 style='color: red;'>Some Error Occured!</h4>"

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

    $("#question_ppr_upload").click((e)=>{
        e.preventDefault();
        if(validQuestionSubject && validQuestionFile){
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
                   $("#message").append(success);
                   $("#subject").val("");
                   $("#question_ppr").val("");
                }else{
                   $("#message").append(failure);
                   $("#subject").val("");
                   $("#question_ppr").val("");
                }
             },
             error: (error) => {
                $("#message").append(failure);
                $("#subject").val("");
                $("#question_ppr").val("");
             }
          }); 
        }else{
         $("#message").append(failure);
         $("#subject").val("");
         $("#question_ppr").val("");
        }
       
    });

    $("#attendance_file_upload").click((e)=>{
      e.preventDefault();
      if(validAttendanceSubject && validAttendanceFile){
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
                   $("#message").append(success);
                   $("#subjectAttendance").val("");
                   $("#attendance_file").val("");
                }else{
                  $("#message").append(failure);
                  $("#subjectAttendance").val("");
                  $("#attendance_file").val("");
                }
             },
             error: (error) => {
               $("#message").append(failure);
               $("#subjectAttendance").val("");
               $("#attendance_file").val("");
             }
          }); 
      }else{
         $("#message").append(failure);
         $("#subjectAttendance").val("");
         $("#attendance_file").val("");
      }
      
  });

  $("#result_upload").click((e)=>{
   e.preventDefault();
   if(validResultSubject && validResultCourseName && validResultFile){
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
               $("#message").append(success);
               $("#subjectResult").val("");
               $("#course_name").val("");
               $("#resultPath").val("");
             }else{
               $("#message").append(failure);
               $("#subjectResult").val("");
               $("#course_name").val("");
               $("#resultPath").val("");
             }
          },
          error: (error) => {
            $("#message").append(failure);
            $("#subjectResult").val("");
            $("#course_name").val("");
            $("#resultPath").val("");
          }
       }); 
   }else{
      $("#message").append(failure);
   }
   
   });

   $("#courseSubmit").click((e)=>{
      e.preventDefault();
      if(validFeedbackListCourseName){
         var course = $("#courseName").val();

         $.ajax({
            url: "/portal/feedback/"+course,
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("#message").append(success);
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
               $("#message").append(failure);
               $("#courseName").val("");
            }
         }); 
      }else{
         $("#message").append(failure);
         $("#courseName").val("");
      }
      
   });

   $("#faculty_list_upload").click((e)=>{
      e.preventDefault();
      if(validFacultyCourseName && validFacultyListFile){
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
               $("#message").append(success);
              $("#course_name").val("");
              $("#faculty_list").val("");
             }else{
               $("#message").append(failure);
               $("#course_name").val("");
               $("#faculty_list").val("");
             }
          },
          error: (error) => {
             $("#message").append(failure);
             $("#course_name").val("");
             $("#faculty_list").val("");
          }
       }); 
      }else{
         $("#message").append(failure);
         $("#course_name").val("");
         $("#faculty_list").val("");
      }
      
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
            $("#message").append(success);
            $("#course_name").val("");
            $("#faculty_name").val("");
          }else{
            $("#message").append(failure);
            $("#course_name").val("");
            $("#faculty_name").val("");
          }
       },
       error: (error) => {
          $("#message").append(failure);
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
               $("#message").append(success);
               $("#course_name").val("");
               $("#faculty_list").val("");
             }else{
               $("#message").append(failure);
               $("#course_name").val("");
               $("#faculty_list").val("");
             }
          },
          error: (error) => {
            $("#message").append(failure);
            $("#course_name").val("");
            $("#faculty_list").val("");
          }
       }); 
  });

  $("#notice_upload").click((e)=>{
   e.preventDefault();
   var noticeName = $("#noticeName").val();
   var noticeLink = $("#noticeLink").val();
   
   $.ajax({
       url: "/portal/notice",
       type: "POST",
       contentType: "application/json",
       data: JSON.stringify({
         "subject": noticeName, 
         "filePath" : noticeLink
       }),
       beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
       success: (data) => {
          if(data.data == "DONE"){
            $("#message").append(success);
            $("#noticeName").val("");
            $("#noticeLink").val("");
          }else{
            $("#message").append(failure);
            $("#noticeName").val("");
            $("#noticeLink").val("");
          }
       },
       error: (error) => {
          $("#message").append(failure);
          $("#noticeName").val("");
          $("#noticeLink").val("");
       }
      }); 
   });

   $("#notice_update").click((e)=>{
      e.preventDefault();
      var noticeNameFlag = $("#noticeNameFlag").val();

      $.ajax({
          url: "/portal/notice/"+noticeNameFlag,
          type: "POST",
          contentType: "application/json",
          
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

      //Validation : Generate PRN
      $("#course_name_gprn").blur(function(){
         var course_name_gprn = $("#course_name_gprn").val()
         if (!isNaN(course_name_gprn)){
          $("#generatePrnValidMsg").html(" Course Name can not be a number!");
         }else{
          $("#generatePrnValidMsg").html("");
         }
      });

      //Validation : set result
      var validResultCourseName = false;
      var validFacultyCourseName = false;
      $("#course_name").blur(function(){
         var course_name = $("#course_name").val()
         if (!isNaN(course_name) || course_name == ""){
          $("#validCourseResultMsg").html(" Course Name can not be a number or empty!");
          $("#validFacultyListMsg").html(" Course Name can not be a number or empty!");
          $("#validFacultyCourseNameMsg").html(" Course Name can not be a number or empty!");
         }else{
          $("#validCourseResultMsg").html("");
          $("#validFacultyListMsg").html("");
          $("#validFacultyCourseNameMsg").html("");
            validResultCourseName = true;
            validFacultyCourseName = true;
         }
      });
      var validResultFile= false;
      $("#resultPath").blur(function(){
         var resultPath = $("#resultPath").val()
         if (resultPath== ""){
          $("#validResultPathMsg").html(" Please enter file path!");
         }else{
          $("#validResultPathMsg").html("");
            validResultFile= true;
         }
      });
      var validResultSubject= false;
      $("#subjectResult").blur(function(){
         var subjectResult = $("#subjectResult").val()
         if (!isNaN( subjectResult) || subjectResult == ""){
          $("#validSubjectResultMsg").html(" Subject Name can not be a number or empty!");
         }else{
          $("#validSubjectResultMsg").html("");
            validResultSubject= true;
         }
      });

       //Validation : feedback list
       var validFeedbackListCourseName = false;
       $("#courseName").blur(function(){
         var courseName = $("#courseName").val()
         if (!isNaN(courseName)){
          $("#feedbackListValidMsg").html(" Course Name can not be a number!");
         }else{
          $("#feedbackListValidMsg").html("");
          validFeedbackListCourseName = true;
         }
      });

      //Validation : attendance
      var validAttendanceSubject= false;
      $("#subjectAttendance").blur(function(){
         var subjectAttendance = $("#subjectAttendance").val()
         if (!isNaN(subjectAttendance) || subjectAttendance == ""){
          $("#validSubjectAttendanceMsg").html(" Subject Name can not be a number or empty!");
         }else{
          $("#validSubjectAttendanceMsg").html("");
            validAttendanceSubject= true;
         }
      });

      var validAttendanceFile= false;
      $("#attendance_file").blur(function(){
         var attendance_file = $("#attendance_file").val()
         if (attendance_file == ""){
          $("#validAttendanceFileMsg").html(" Please enter file path!");
         }else{
          $("#validAttendanceFileMsg").html("");
            validAttendanceFile= true;
         }
      });

      //Validation : faculty list
     
     var validFacultyListFile= false;
      $("#faculty_list").blur(function(){
         var faculty_list = $("#faculty_list").val()
         if (faculty_list == ""){
          $("#validFacultyListFileMsg").html(" Please enter file path!");
         }else{
          $("#validFacultyListFileMsg").html("");
            validFacultyListFile= true;
         }
      });

      //validation: faculty_feedback
      $("#faculty_name").blur(function(){
         var faculty_name = $("#faculty_name").val()
         if (!isNaN(faculty_name) || faculty_name == ""){
          $("#validFacultyNameMsg").html(" Faculty name can not contain number or be empty!");
         }else{
          $("#validFacultyNameMsg").html("");
         }
      });

       //validation: question paper

       var validQuestionSubject= false;
      $("#subject").blur(function(){
         var subject = $("#subject").val()
         if (!isNaN(subject) || subject == ""){
          $("#validSubjectQuestionMsg").html(" Subject Name can not be a number or empty!");
         }else{
          $("#validSubjectQuestionMsg").html("");
            validQuestionSubject= true;
         }
      });

       var validQuestionFile= false;
      $("#question_ppr").blur(function(){
         var question_ppr = $("#question_ppr").val()
         if (question_ppr == ""){
          $("#validQuestionFileMsg").html(" Please enter file path!");
         }else{
          $("#validQuestionFileMsg").html("");
            validQuestionFile= true;
         }
      });

});