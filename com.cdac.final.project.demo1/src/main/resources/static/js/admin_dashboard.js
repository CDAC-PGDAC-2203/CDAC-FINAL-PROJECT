$(document).ready(() => {
    $("#g_prn").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/gprn",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#getDoubts").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/doubts",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#updateDoubt").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/doubts/flag",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#attendance").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/attendance",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#result").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/result",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#feedBackList").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/feedback",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#facultyList").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/faculty",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#facultyFlag").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/faculty/flag",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#questions").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/questions",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#links").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/links",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#notice").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/notice",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

    $("#notice").click((e)=>{
        e.preventDefault();
        $.ajax({
            url: "/portal/admin/noticeFlag",
            type: "GET",
            beforeSend: function(xhr){xhr.setRequestHeader('Authorization', localStorage.getItem("token"))},
            success: (data) => {
                $("body").html(data);
            }
         });
    });

});