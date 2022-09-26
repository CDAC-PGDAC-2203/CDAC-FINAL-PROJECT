$(document).ready(() => {
    var totalPerformance = 0;
    $.ajax({
        type: "GET",
            url: "/portal/performance/"+localStorage.getItem("uPrn"),
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               totalPerformance = data;
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
    });

    let number1 = document.getElementById("number1");
    let counter1 = 0;
    setInterval(() => {
        if (counter1 == totalPerformance) {
            clearInterval();
        } else {
            counter1 += 1;
            number1.innerHTML = counter1+ "%";
        }
    }, 30);

    $.ajax({
        url: "/portal/moduleAttendance/"+localStorage.getItem("uPrn"),
        type: "GET",
        beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
        success: (data) => {
            data.forEach((item) => {
                let attendacePercentage = (((item.attendedLecture*1.0)/item.totalLecture)*100).toFixed(1);
                var chart = "<li><div class='bar' data-percentage = '" + attendacePercentage + "'></div><span>" + item.module +"</span></li>";
                $("#attendaceBars").append(chart);
            });

            $(function () {
                $('.bars li .bar').each(function (key, bar) {
                  var percentage = $(this).data('percentage');
                  $(this).animate({
                    'height': percentage + '%'
                  }, 1000)
                });
              });
        },
        error: (error) => {
           alert("Internal Server Error! Please contact Administrator");
        }
     });

    $("#dashboardNav").click((e)=>{
        e.preventDefault();
        $.ajax({
            type: "GET",
            url: "/portal/dashboard",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
         });
    });

    $("#student_profile").click((e)=>{
        e.preventDefault();
        $.ajax({
            type: "GET",
            url: "/portal/profile",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
         });
    });

});
