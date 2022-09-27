$(document).ready(() => { 
    var totalPerformance = 0.00;
    
    // AJAX to get current performance of student
    $.ajax({
        type: "GET",
            url: "/portal/performance/"+localStorage.getItem("uPrn"),
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                totalPerformance = data.toFixed(2); 
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
    });

    let progressBar1 = document.querySelector(".circular-progress-1");
    let valueContainer1 = document.querySelector(".value-container-1");
 
    var progressValue1 = "0.00";
    progressValue1 = parseFloat(progressValue1);
    var progressEndValue1 = totalPerformance;
    var speed1 = 10;
 
    let progress1 = setInterval(() => {
        progressValue1 = progressValue1 + 0.01;
        console.log(progressValue1);
        valueContainer1.textContent = `${progressValue1}%`;
        progressBar1.style.background = `conic-gradient(
             #804FB3 ${progressValue1 * 0.6}deg,
             #9969C7 ${progressValue1 * 1.2}deg,
                #e91e63 ${progressValue1 * 2.7}deg,
                white ${progressValue1 * 3.6}deg
        )`;
        if(progressValue1 == progressEndValue1){
            clearInterval(progress1);
        }
    }, speed1);

    // AJAX to get current attendance of student
    $.ajax({
        type: "GET",
            url: "/portal/attendance/"+localStorage.getItem("uPrn"),
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
               //$("#currentAttendance").append(data+"%");
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
    });

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
});