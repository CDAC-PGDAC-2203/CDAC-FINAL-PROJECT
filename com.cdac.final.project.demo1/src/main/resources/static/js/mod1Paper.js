$(document).ready(() => {
    var questionNumber = 1;
    $.ajax({
        url: "/portal/exam/questions/mod1",
        type: "GET",
        beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
        success: (data) => {
            data.forEach((value) => {
                var question = `<div class='question ml-sm-5 pl-sm-5 pt-2' style='margin-left: 10%;'>
                <div class='py-2 h5'>
                    <b id=`+ questionNumber + `>` + value.qId + ` ` + value.question + `</b>
                </div>
                <div class='ml-md-3 ml-sm-3 pl-md-5 pt-sm-0 pt-3' id='options'>
                    <label class='options'>`+ value.option1 + `<input type='radio'
                        name='`+ questionNumber + `' value='` + value.option1 + `'><span class='checkmark'></span>
                    </label> <label class='options'>`+ value.option2 + `<input
                        type='radio' name='`+ questionNumber + `' value='` + value.option2 + `'> <span class='checkmark'></span>
                    </label> <label class='options'>`+ value.option3 + `<input
                        type='radio' name='`+ questionNumber + `' value='` + value.option3 + `'> <span class='checkmark'></span>
                    </label> <label class='options'>`+ value.option4 + `<input
                        type='radio' name='`+ questionNumber + `' value='` + value.option4 + `'> <span class='checkmark'></span>
                    </label>
                </div>
                <hr>
            </div>`;
                questionNumber += 1;
                $("#paperStart").append(question);
            });
        }
    });

    $("#closeExam").click((e) => {
        e.preventDefault();
        $.ajax({
            type: "GET",
            url: "/portal/exam",
            beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
            success: (data) => {
                $("body").html(data);
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
        });
    });

    $("#submitExam").click((e) => {
        e.preventDefault();

        var answerMap = new Map();
        var i = 1;
        $('input:radio:checked').each(function () {
            answerMap.set(i.toString(), $(this).val());
            i += 1;
        });
        var answerJson = Object.fromEntries(answerMap);
        $.ajax({
            type: "POST",
            url: "/portal/exam/attempt",
            beforeSend: function (xhr) { xhr.setRequestHeader('Authorization', localStorage.getItem("token")) },
            contentType: "application/json",
            data: JSON.stringify({
                "module": "mod1",
                "uPrn": localStorage.getItem("uPrn"),
                "map": answerJson
            }),
            success: (data) => {
                if (data == "" || data == null) {
                    return;
                }
                if (data.data == "DONE") {
                    $("#msg").append("<h5 style='color: green;'>Exam Submitted Successfully!</h5>");
                } else {
                    $("#msg").append("<h6 style='color: red;'>Error! Internal Server Error.</h6>");
                }
            },
            error: (error) => {
                alert("Internal Server Error!");
            }
        });
    });
});