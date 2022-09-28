$(document).ready(() => {
    const image_input = document.querySelector("#image_input");
    image_input.addEventListener("change", function () {
        const reader = new FileReader();
        reader.addEventListener("load", () => {
           const upload_image = reader.result;
           $("#photo").val(upload_image);
        });
        reader.readAsDataURL(this.files[0]);
    });

    var totalPerformance = 0.0;
    var totalAttendance = 0.0;

    // AJAX to get current performance of student
    $.ajax({
        type: "GET",
        url: "/portal/performance/" + localStorage.getItem("uPrn"),
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            totalPerformance = parseFloat(data.toFixed(1));
        },
        error: (error) => {
            alert("Internal Server Error!");
        }
    });
    if (totalPerformance != 0) {
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
            if (parseFloat((progressValue1).toFixed(1)) == parseFloat((progressEndValue1).toFixed(1))) {
                clearInterval(progress1);
            }
        }, speed1);
    }


    // AJAX to get current attendance of student
    $.ajax({
        type: "GET",
        url: "/portal/attendance/" + localStorage.getItem("uPrn"),
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            totalAttendance = parseFloat(data.toFixed(1));
        },
        error: (error) => {
            alert("Internal Server Error!");
        }
    });

    if (totalAttendance != 0) {
        // Circular Progress Bar : Overall Attendace
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
            if (parseFloat((progressValue2).toFixed(1)) == parseFloat((totalAttendance).toFixed(1))) {
                clearInterval(progress2);
            }
        }, speed2);
    }

    //AJAX to get module wise attendance and draw the bar graph.
    $.ajax({
        url: "/portal/moduleAttendance/" + localStorage.getItem("uPrn"),
        type: "GET",
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            if (data == "" || data == null) {
                return;
            }
            data.forEach((item) => {
                let attendacePercentage = (((item.attendedLecture * 1.0) / item.totalLecture) * 100).toFixed(1);
                var chart = "<li><div class='bar' data-percentage = '" + attendacePercentage + "'></div><span>" + item.module + "</span></li>";
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

    // AJAX to get notices
    $.ajax({
        type: "GET",
        url: "/portal/notice",
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            if (data == "" || data == null) {
                var notice = "<div class='desc' id='desc'>No New Notices!</div>"
                $("#noticeBoard").append(notice);
                return;
            }
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
            alert("Internal Server Error! Please contact Administrator");
        }
    });

    // AJAX for Schedule
    var today = new Date();
    var dd = String(today.getDate()).padStart(2, '0');
    var mm = String(today.getMonth() + 1).padStart(2, '0');
    var yyyy = today.getFullYear();

    var courseLink = "";
    var uPrnTime = localStorage.getItem("uPrn").split('401')[1].substring(0, 1);
    if (uPrnTime === '2') {
        courseLink = 'PG-DAC';
    } else if (uPrnTime === '3') {
        courseLink = 'PG-DBDA';
    } else {
        courseLink = 'PG-DESD';
    }
    var uPrnLink = localStorage.getItem("uPrn").split('401')[1].substring(2, 5);
    var prn = parseInt(uPrnLink);
    var batch = "";
    if (prn >= 1 && prn < 60) {
        batch = 'B1';
    } else if (prn >= 60 && prn < 120) {
        batch = 'B2';
    } else if (prn >= 120 && prn < 180) {
        batch = 'B3';
    } else {
        batch = 'B4';
    }

    $.ajax({
        url: "/portal/dashboard/time",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify({
            "day": dd.toString(),
            "month": mm.toString(),
            "year": yyyy.toString(),
            "course": courseLink
        }),
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            if (data == "" || data == null) {
                return;
            }
            $("#theory_time").append(data.theory);
            if (batch == "B1") {
                $("#lab_time").append(data.b1);
            } else if (batch == "B2") {
                $("#lab_time").append(data.b2);
            } else if (batch == "B3") {
                $("#lab_time").append(data.b3);
            } else {
                $("#lab_time").append(data.b4);
            }
        },
        error: (error) => {
            alert("Internal Server Error! Please contact Administrator");
        }
    });

    // Fetch Module List for drop down in doubt widget
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
        url: "/portal/modules/" + courseModules,
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            var list = "<option value='" + data.mod1 + "'>" + data.mod1 + "</option>"
                + "<option value='" + data.mod1 + "'>" + data.mod1 + "</option>"
                + "<option value='" + data.mod2 + "'>" + data.mod2 + "</option>"
                + "<option value='" + data.mod3 + "'>" + data.mod3 + "</option>"
                + "<option value='" + data.mod4 + "'>" + data.mod4 + "</option>"
                + "<option value='" + data.mod5 + "'>" + data.mod5 + "</option>"
                + "<option value='" + data.mod6 + "'>" + data.mod6 + "</option>"
                + "<option value='" + data.mod7 + "'>" + data.mod7 + "</option>"
                + "<option value='" + data.mod8 + "'>" + data.mod8 + "</option>"
            $("#moduleList").append(list);
        },
        error: (error) => {
            alert("Internal Server Error!");
        }
    });

    //Functionality to submit doubt
    $("#doubtSubmit").click((e) => {
        e.preventDefault();
        var doubtContent = $("#doubtContent").val();
        var subjectName = $('#moduleList :selected').text();
        var uPrn = localStorage.getItem("uPrn");
        var attachment = $("#photo").val();

        $.ajax({
            url: "/portal/doubt",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                "uPrn": uPrn,
                "subjectName": subjectName,
                "doubtContent": doubtContent,
                "attachment": attachment
            }),
            beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
            success: (data) => {
                if (data == "" || data == null) {
                    return;
                }
                if(data.data == "DONE"){
                    $("#msg").append("<h6 style='color: green;'>Doubt Saved Successfully!</h6>");
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