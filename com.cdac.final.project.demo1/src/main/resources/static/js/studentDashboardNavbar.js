$(document).ready(()=>{
    


//AJAX To Fetch Links To Join Lecture & Labs
var today = new Date();
var dd = String(today.getDate()).padStart(2, '0');
var mm = String(today.getMonth() + 1).padStart(2, '0');
var yyyy = today.getFullYear();
var courseLink = "";
var uPrnLink = localStorage.getItem("uPrn").split('401')[1].substring(0,1);
if(uPrnLink === '2'){
    courseLink='PG-DAC';
}else if(uPrnLink === '3'){
    courseLink='PG-DBDA';
}else{
    courseLink='PG-DESD';
}

$.ajax({
    url: "/portal/dashboard/links",
    type: "POST",
    contentType: "application/json",
    data: JSON.stringify({
        "day": dd.toString(),
        "month": mm.toString(),
        "year": yyyy.toString(),
        "course": courseLink
    }),
    beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
    success: (data) => {
        var tag = "<li><a id='theoryLink' class='dropdown-item' target='_blank' href='" + data.theory + "'>Theory</a></li>" 
                + "<li><a class='dropdown-item'> Lab &raquo; </a>"
                        +"<ul class='dropdown-menu dropdown-submenu'>"
                            +"<li><a id='b1Link'  class='dropdown-item' href='" + data.b1 + "'>B1</a></li>"
                            +"<li><a id='b2Link' target='_blank' class='dropdown-item' href='" + data.b2 + "'>B2</a></li>"
                            +"<li><a id='b3Link' target='_blank' class='dropdown-item' href='" + data.b3 + "'>B3</a></li>"
                            +"<li><a id='b4Link' target='_blank' class='dropdown-item' href='" + data.b4 + "'>B4</a></li>"
                        +"</ul>"
                    +"</li>"

        $("#lectureLinkDropdown").append(tag);
    },
    error: (error) => {
       alert("Internal Server Error! Please contact Administrator");
    }
 });


//Dashboard Navigation
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

//My Profile Page
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

//Exam Home Page
$("#examNav").click((e)=>{
    e.preventDefault();
    $.ajax({
        type: "GET",
        url: "/portal/exam",
        beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
        success: (data) => {
            $("body").html(data);
        },
        error: (error) => {
            alert("Internal Server Error!");
        }
     });
});

//Result Page
$("#resultNav").click((e)=>{
    e.preventDefault();
    $.ajax({
        type: "GET",
        url: "/portal/result",
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