$(document).ready(()=>{

    var courseModules = "";
    var uPrnModules = localStorage.getItem("uPrn").split('401')[1].substring(0, 1);
    if (uPrnModules === '2') {
        courseModules = 'PG-DAC';
    } else if (uPrnModules === '3') {
        courseModules = 'PG-DBDA';
    } else {
        courseModules = 'PG-DESD';
    }

    $.ajax({
        type: "GET",
        url: "/portal/faculty/" + courseModules,
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            data.forEach((value)=>{
                var faculty = "<option value='"+ value.facultyName +"'>"+ value.facultyName +"</option>"
                $("#facultyDropDown").append(faculty);
            });
        },
        error: (error) => {
            alert("Internal Server Error!");
        }
    });

    $.ajax({
        type: "GET",
        url: "/portal/faculty/" + courseModules,
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            data.forEach((value)=>{
                var feedbackModule = "<option value='"+ value.course +"'>"+ value.course +"</option>"
                $("#moduleDropDown").append(feedbackModule);
            });
        },
        error: (error) => {
            alert("Internal Server Error!");
        }
    });

    $("#submitFeedback").click((e)=>{
        e.preventDefault();
        var uPrn = localStorage.getItem("uPrn");
        var faculty = $('#facultyDropDown :selected').text();
        var course = $('#moduleDropDown :selected').text();
        var parameter1 = $("input[name='1rate']:checked").val(); 
        var parameter2 = $("input[name='2rate']:checked").val();
        var parameter3 = $("input[name='3rate']:checked").val();
        var parameter4 = $("input[name='4rate']:checked").val();
        var parameter5 = $("input[name='5rate']:checked").val();
        var parameterTotal = 0;
        parameterTotal = parseInt(parameter1) + parseInt(parameter2) + parseInt(parameter3) + parseInt(parameter4) + parseInt(parameter5);
        var suggestion = $("#feedbackSuggestion").val();

        $.ajax({
            url: "/portal/feedback",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "uPrn": uPrn,
                "course": course,
                "parameter1": parameter1,
                "parameter2": parameter2,
                "parameter3": parameter3,
                "parameter4": parameter4,
                "parameter5": parameter5,
                "parameterTotal": parameterTotal,
                "suggestion": suggestion
            }),
            beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
            success: (data) => {
                if (data == "" || data == null) {
                    return;
                }
                if(data.data == "DONE"){
                    $("#msg").append("<h6 style='color: green;'>Feedback Saved Successfully!</h6>");
                }else{
                    $("#msg").append("<h6 style='color: red;'>Error! Please try after some time.</h6>");
                }
            },
            error: (error) => {
                alert("Internal Server Error! Please contact Administrator");
            }
        });
    });
});