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
                  $("#course_name_gprn").val("");
                  $("#message").html("<h5 style='color: green;'>PRN generated successfully!</h5>");
               }else{
                  $("#course_name_gprn").val("");
                  $("#message").html("<h5 style='color: red;'>Error! PRN can not be generated</h5>");
               }
            },
            error: (error) => {
               $("#course_name_gprn").val("");
               $("#message").html("<h6 style='color: red;'>Error! PRN not generated</h6>");
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
                   $("#message").html("<h5 style='color: green;'>Question Paper uploded successfully!</h5>");
                   $("#subject").val("");
                   $("#question_ppr").val("");
                }else{
                   $("#message").html("<h5 style='color: red;'>Error! Question Paper not uploaded</h5>");
                   $("#subject").val("");
                   $("#question_ppr").val("");
                }
             },
             error: (error) => {
                $("#message").html("<h5 style='color: red;'>Error! Question Paper not uploaded</h5>");
                $("#subject").val("");
                $("#question_ppr").val("");
             }
          }); 
        }else{
         $("#message").html("<h5 style='color: red;'>Error! Question Paper not uploaded</h5>");
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
                   $("#message").html("<h5 style='color: green;'>Attendance uploded successfully!</h5>");
                   $("#subjectAttendance").val("");
                   $("#attendance_file").val("");
                }else{
                  $("#message").html("<h5 style='color: red;'>Error! Attendance not uploaded</h5>");
                  $("#subjectAttendance").val("");
                  $("#attendance_file").val("");
                }
             },
             error: (error) => {
               $("#message").html("<h5 style='color: red;'>Error! Attendance not uploaded</h5>");
               $("#subjectAttendance").val("");
               $("#attendance_file").val("");
             }
          }); 
      }else{
         $("#message").html("<h5 style='color: red;'>Error! Attendance not uploaded</h5>");
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
               $("#message").html("<h5 style='color: green;'>Result uploaded successfully!</h5>");
               $("#subjectResult").val("");
               $("#course_name").val("");
               $("#resultPath").val("");
             }else{
               $("#message").html("<h5 style='color: red;'>Error! Result not uploaded</h5>");
               $("#subjectResult").val("");
               $("#course_name").val("");
               $("#resultPath").val("");
             }
          },
          error: (error) => {
            $("#message").html("<h5 style='color: red;'>Error! Result not uploaded</h5>");
            $("#subjectResult").val("");
            $("#course_name").val("");
            $("#resultPath").val("");
          }
       }); 
   }else{
      $("#message").html("<h5 style='color: red;'>Error! Result not uploaded</h5>");
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
                $("#message").html("<h5 style='color: green;'>Feedback List uploaded successfully!</h5>");
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
               $("#message").html("<h5 style='color: red;'>Error! Feedback List not uploaded</h5>");
               $("#courseName").val("");
            }
         }); 
      }else{
         $("#message").html("<h5 style='color: red;'>Error! Feedback List not uploaded</h5>");
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
               $("#message").html("<h5 style='color: green;'>Faculty List uploaded successfully!</h5>");
              $("#course_name").val("");
              $("#faculty_list").val("");
             }else{
               $("#message").html("<h5 style='color: red;'>Error! Faculty List not uploaded</h5>");
               $("#course_name").val("");
               $("#faculty_list").val("");
             }
          },
          error: (error) => {
             $("#message").html("<h5 style='color: red;'>Error! Faculty List not uploaded</h5>");
             $("#course_name").val("");
             $("#faculty_list").val("");
          }
       }); 
      }else{
         $("#message").html("<h5 style='color: red;'>Error! Faculty List not uploaded</h5>");
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
            $("#message").html("<h5 style='color: green;'>Faculty Feedback List updated successfully!</h5>");
            $("#course_name").val("");
            $("#faculty_name").val("");
          }else{
            $("#message").html("<h5 style='color: red;'>Error! Faculty Feedback List not updated</h5>");
            $("#course_name").val("");
            $("#faculty_name").val("");
          }
       },
       error: (error) => {
          $("#message").html("<h5 style='color: red;'>Error! Faculty Feedback List not updated</h5>");
          $("#course_name").val("");
          $("#faculty_name").val("");
       }
      }); 
   });

   $("#lecture_link_upload").click((e)=>{
      e.preventDefault();
      if(validLectureLinkSubject && validLectureLinkDate && validLectureLinkTheoryLink
           && validLectureLinkTheoryTime && validLectureB1Link && validLectureLinkB1Time
           && validLectureB2Link && validLectureLinkB2Time && validLectureB3Link
           && validLectureLinkB3Time && validLectureB4Link && validLectureLinkB4Time){
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
                     $("#message").html("<h5 style='color: green;'> Lecture Link uploaded successfully!</h5>");
                     $("#subject").val("");
                     $("#session_date").val("");
                     $("#theory_time").val("");
                     $("#theory_link").val("");
                     $("#b1_time").val("");
                     $("#b2_time").val("");
                     $("#b3_time").val("");
                     $("#b4_time").val("");
                     $("#b1_link").val("");
                     $("#b2_link").val("");
                     $("#b3_link").val("");
                     $("#b4_link").val("");
                   }else{
                     $("#message").html("<h5 style='color: red;'>Error! Lecture Link not uploaded</h5>");
                     $("#subject").val("");
                     $("#session_date").val("");
                     $("#theory_time").val("");
                     $("#theory_link").val("");
                     $("#b1_time").val("");
                     $("#b2_time").val("");
                     $("#b3_time").val("");
                     $("#b4_time").val("");
                     $("#b1_link").val("");
                     $("#b2_link").val("");
                     $("#b3_link").val("");
                     $("#b4_link").val("");
                   }
                },
                error: (error) => {
                     $("#message").html("<h5 style='color: red;'>Error! Lecture Link not uploaded</h5>");
                     $("#subject").val("");
                     $("#session_date").val("");
                     $("#theory_time").val("");
                     $("#theory_link").val("");
                     $("#b1_time").val("");
                     $("#b2_time").val("");
                     $("#b3_time").val("");
                     $("#b4_time").val("");
                     $("#b1_link").val("");
                     $("#b2_link").val("");
                     $("#b3_link").val("");
                     $("#b4_link").val("");
                }
             }); 
            }else{
                   $("#message").html("<h5 style='color: red;'>Error! Lecture Link not uploaded</h5>");
                   $("#subject").val("");
                   $("#session_date").val("");
                     $("#theory_time").val("");
                     $("#theory_link").val("");
                     $("#b1_time").val("");
                     $("#b2_time").val("");
                     $("#b3_time").val("");
                     $("#b4_time").val("");
                     $("#b1_link").val("");
                     $("#b2_link").val("");
                     $("#b3_link").val("");
                     $("#b4_link").val("");
           }
     
  });

  $("#notice_upload").click((e)=>{
   e.preventDefault();
   if(validNoticeName && validNoticeLink){
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
               $("#message").html("<h5 style='color: green;'> Notice uploaded successfully!</h5>");
               $("#noticeName").val("");
               $("#noticeLink").val("");
             }else{
               $("#message").html("<h5 style='color: red;'>Error! Notice not uploaded</h5>");
               $("#noticeName").val("");
               $("#noticeLink").val("");
             }
          },
          error: (error) => {
             $("#message").html("<h5 style='color: red;'>Error! Notice not uploaded</h5>");
             $("#noticeName").val("");
             $("#noticeLink").val("");
          }
         }); 
       }else{
             $("#message").html("<h5 style='color: red;'>Error! Notice not uploaded</h5>");
             $("#noticeName").val("");
             $("#noticeLink").val("");
           }
   
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
               $("#message").html("<h5 style='color: green;'> Notice flag updated successfully</h5>");
               $("#noticeNameFlag").val("");
             }else{
               $("#message").html("<h5 style='color: red;'>Error! Notice flag not updated</h5>");
               $("#noticeNameFlag").val("");
             }
          },
          error: (error) => {
             $("#message").html("<h5 style='color: red;'>Error! Notice flag not updated</h5>");
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
         if (isNaN(faculty_name) || faculty_name == ""){
          $("#validFacultyNameMsg").html(" Faculty ID can not contain alphabet or be empty!");
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

      //Validation : Lecture Link
      var validLectureLinkSubject= false;
      $("#subject").blur(function(){
         var subject = $("#subject").val()
         if (!isNaN(subject) || subject == ""){
          $("#LectureSubjectValidMsg").html(" Subject Name can not be a number or empty!");
         }else{
          $("#LectureSubjectValidMsg").html("");
          validLectureLinkSubject= true;
         }
      });


      var validLectureLinkDate= false;
      $("#session_date").blur(function(){
         var session_date = $("#session_date").val()
         if (session_date == ""){
          $("#LectureDateValidMsg").html(" Date can not be empty!");
         }else{
          $("#LectureDateValidMsg").html("");
          validLectureLinkDate= true;
         }
      });

      var validLectureLinkTheoryLink= false;
      $("#theory_link").blur(function(){
         var theory_link = $("#theory_link").val()
         if (theory_link == ""){
          $("#LectureTheoryLinkValidMsg").html(" Theory link can not be empty!");
         }else{
          $("#LectureTheoryLinkValidMsg").html("");
          validLectureLinkTheoryLink= true;
         }
      });

      var validLectureLinkTheoryTime= false;
      $("#theory_time").blur(function(){
         var theory_time = $("#theory_time").val()
         if (theory_time == ""){
          $("#LectureTheoryTimeValidMsg").html(" Theory time can not be empty!");
         }else{
          $("#LectureTheoryTimeValidMsg").html("");
          validLectureLinkTheoryTime= true;
         }
      });

      var validLectureB1Link= false;
      $("#b1_link").blur(function(){
         var b1_link = $("#b1_link").val()
         if (b1_link == ""){
          $("#LectureB1LinkValidMsg").html(" B1 link can not be empty!");
         }else{
          $("#LectureB1LinkValidMsg").html("");
             validLectureB1Link = true;
         }
      });

      var validLectureLinkB1Time= false;
      $("#b1_time").blur(function(){
         var b1_time = $("#b1_time").val()
         if (b1_time == ""){
          $("#LectureB1TimeValidMsg").html(" B1 time can not be empty!");
         }else{
          $("#LectureB1TimeValidMsg").html("");
          validLectureLinkB1Time= true;
         }
      });

      var validLectureB2Link= false;
      $("#b2_link").blur(function(){
         var b2_link = $("#b2_link").val()
         if (b2_link == ""){
          $("#LectureB2LinkValidMsg").html(" B2 link can not be empty!");
         }else{
          $("#LectureB2LinkValidMsg").html("");
             validLectureB2Link = true;
         }
      });

      var validLectureLinkB2Time= false;
      $("#b2_time").blur(function(){
         var b2_time = $("#b2_time").val()
         if (b2_time == ""){
          $("#LectureB2TimeValidMsg").html(" B2 time can not be empty!");
         }else{
          $("#LectureB2TimeValidMsg").html("");
          validLectureLinkB2Time= true;
         }
      });


      var validLectureB3Link= false;
      $("#b3_link").blur(function(){
         var b3_link = $("#b3_link").val()
         if (b3_link == ""){
          $("#LectureB3LinkValidMsg").html(" B3 link can not be empty!");
         }else{
          $("#LectureB3LinkValidMsg").html("");
             validLectureB3Link = true;
         }
      });

      var validLectureLinkB3Time= false;
      $("#b3_time").blur(function(){
         var b3_time = $("#b3_time").val()
         if (b3_time == ""){
          $("#LectureB3TimeValidMsg").html(" B3 time can not be empty!");
         }else{
          $("#LectureB3TimeValidMsg").html("");
          validLectureLinkB3Time= true;
         }
      });

      var validLectureB4Link= false;
      $("#b4_link").blur(function(){
         var b4_link = $("#b4_link").val()
         if (b4_link == ""){
          $("#LectureB4LinkValidMsg").html(" B4 link can not be empty!");
         }else{
          $("#LectureB4LinkValidMsg").html("");
             validLectureB4Link = true;
         }
      });

      var validLectureLinkB4Time= false;
      $("#b4_time").blur(function(){
         var b4_time = $("#b4_time").val()
         if (b4_time == ""){
          $("#LectureB4TimeValidMsg").html(" B4 time can not be empty!");
         }else{
          $("#LectureB4TimeValidMsg").html("");
          validLectureLinkB4Time= true;
         }
      });

      //Validation : Notice

      var validNoticeName= false;
      $("#noticeName").blur(function(){
         var noticeName = $("#noticeName").val()
         if (noticeName == ""){
          $("#validNoticeNameMsg").html(" Notice name can not be empty!");
         }else{
          $("#validNoticeNameMsg").html("");
          validNoticeName= true;
         }
      });

      var validNoticeLink= false;
      $("#noticeLink").blur(function(){
         var noticeLink = $("#noticeLink").val()
         if (noticeLink == ""){
          $("#validNoticeLinkMsg").html(" Notice link can not be empty!");
         }else{
          $("#validNoticeLinkMsg").html("");
          validNoticeLink= true;
         }
      });

       //Validation : Notice flag

       var validNoticeName= false;
       $("#noticeNameFlag").blur(function(){
          var noticeNameFlag = $("#noticeNameFlag").val()
          if (noticeNameFlag == ""){
           $("#validNoticeNameFlagMsg").html(" Notice name can not be empty!");
          }else{
           $("#validNoticeNameFlagMsg").html("");
           validNoticeName= true;
          }
       });

});