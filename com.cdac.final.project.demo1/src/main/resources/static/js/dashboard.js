$(document).ready(() => {
    var totalPerformance = 0.0;
    var totalAttendance = 0.0;
    
    // AJAX to get current performance of student
    $.ajax({
        type: "GET",
            url: "/portal/performance/"+localStorage.getItem("uPrn"),
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                totalPerformance = parseFloat(data.toFixed(1)); 
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
    });

	// Circular Progress Bar : Current Performance
    var progressBar1 = document.querySelector(".circular-progress-1");
    var valueContainer1 = document.querySelector(".value-container-1");
 
    var progressValue1 = 0.0;
    progressValue1 = parseFloat(parseFloat(progressValue1).toFixed(1));
    var progressEndValue1 = parseFloat((totalPerformance).toFixed(1));
    var speed1 = 0.1;
 
    var progress1 = setInterval(() => {
        progressValue1 = parseFloat((progressValue1 + 0.1).toFixed(1));
        valueContainer1.textContent = `${progressValue1}%`;
        progressBar1.style.background = `conic-gradient(
             #804FB3 ${progressValue1 * 0.6}deg,
             #9969C7 ${progressValue1 * 1.2}deg,
             #e91e63 ${progressValue1 * 2.7}deg,
             white ${progressValue1 * 3.6}deg
        )`;
        if(parseFloat((progressValue1).toFixed(1)) == parseFloat((totalPerformance).toFixed(1))) {
            clearInterval(progress1);
        }
    }, speed1);

    // AJAX to get current attendance of student
    $.ajax({
        type: "GET",
            url: "/portal/attendance/"+localStorage.getItem("uPrn"),
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               totalAttendance =  parseFloat(data.toFixed(1));
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
    });

    // Circular Progress Bar : Overall Performance
    var progressBar2 = document.querySelector(".circular-progress-2");
    var valueContainer2 = document.querySelector(".value-container-2");
 
    var progressValue2 = 0.0;
    progressValue1 = parseFloat(parseFloat(progressValue2).toFixed(1));
    var progressEndValue1 = parseFloat((totalAttendance).toFixed(1));
    var speed2 = 0.5;
 
    var progress2 = setInterval(() => {
        progressValue2 = parseFloat((progressValue2 + 0.1).toFixed(1));
        valueContainer2.textContent = `${progressValue2}%`;
        progressBar2.style.background = `conic-gradient(
             #804FB3 ${progressValue2 * 0.6}deg,
             #9969C7 ${progressValue2 * 1.2}deg,
             #e91e63 ${progressValue2 * 2.7}deg,
             white ${progressValue2 * 3.6}deg
        )`;
        if(parseFloat((progressValue2).toFixed(1)) == parseFloat((totalAttendance).toFixed(1))) {
            clearInterval(progress2);
        }
    }, speed2);

    //AJAX to get module wise attendance and draw the bar graph.
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

            $(function(){
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

     // AJAX to get notices
    $.ajax({
        type: "GET",
            url: "/portal/notice",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               data.forEach((map) => {
                    var notice = "<div class='desc' id='desc'><a href='" 
                                + map.noticeLink 
                                + "' target='_blank'>" 
                                + map.noticeName 
                                + "</a></div>"
                    
                    $("#noticeBoard").append(notice);
               });
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
    });
});