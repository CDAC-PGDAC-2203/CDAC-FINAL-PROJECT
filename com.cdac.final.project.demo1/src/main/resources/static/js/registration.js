$(document).ready(() => {
  const image_input = document.querySelector("#image_input");

	image_input.addEventListener("change", function() {
	  const reader = new FileReader();
	  reader.addEventListener("load", () => {
	    const uploaded_image = reader.result;
		$("#photo").val(uploaded_image);
	  });
	  reader.readAsDataURL(this.files[0]);
	});
  const prevBtns = document.querySelectorAll(".btn-prev");
  const nextBtns = document.querySelectorAll(".btn-next");
  const progress = document.getElementById("progress");
  const formSteps = document.querySelectorAll(".form-step");
  const progressSteps = document.querySelectorAll(".progress-step");

  let formStepsNum = 0;

  var userId = 0;
  var ccatNo = 0;
  var fName = "";
  var mName = "";
  var lName = "";
  var course = "";
  var dob = "";
  var gender = "";
  var email = "";
  var phone = 0;
  var qualification = "";
  var photo = "";
  var guardianName = "";
  var guardianPhone = 0;
  var addLine1 = "";
  var addLine2 = "";
  var state = "";
  var city = "";
  var pincode = 0;

  nextBtns.forEach((btn) => {
    btn.addEventListener("click", () => {
      if (formStepsNum == 0) {
        ccatNo = $("#ccatNo").val();
        fName = $("#fName").val();

        if (ccatNo == "" || fName == "") {
         window.alert("All fields are mandatory!");
          return;
        }
        $.ajax({
          type: "POST",
          contentType: "application/json",
          url: "/portal/register/validate",
          data: JSON.stringify({
            "ccatNo": ccatNo,
            "fName": fName,
          }),
          success: function (returnedData) {
            if(returnedData == "" || returnedData == null){
              $("#register_failure").html("<i class='bi bi-info-square'></i>" + " Invalid Credentials!")
              $("#ccatNo").val("");
              $("#fName").val("");
            }
            mName = returnedData.mName;
            lName = returnedData.lName;
            course = returnedData.course;
            dob = returnedData.dob;

            $("#fNamePd").val(fName).prop("disabled", true);
            $("#mName").val(mName).prop("disabled", true);
            $("#lName").val(lName).prop("disabled", true);
            $("#dob").val(dob).prop("disabled", true);
            $("#course").val(course).prop("disabled", true);

            formStepsNum++;
            updateFormSteps();
            updateProgressbar();
          },
          error: (error)=>{
            $("#register_failure").html("<i class='bi bi-info-square'></i>" + " Invalid Credentials!")
            $("#ccatNo").val("");
            $("#fName").val("");
            },
          dataType: "json",
        });
      } else if (formStepsNum == 1) {
        if(validPhone && validGuardianName && validGuardianPhone && validEmail){
          gender = $("input[name='gender']:checked").val();
          email = $("#email").val();
          phone = $("#phone").val();
          qualification = $("#qualification").val();
          photo = $("#photo").val();
          guardianName = $("#guardianName").val();
          guardianPhone = $("#guardianPhone").val();
          $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/portal/register/details",
            data: JSON.stringify({
              "userId": userId,
              "ccatNo": ccatNo,
              "fName": fName,
              "mName": mName,
              "lName": lName,
              "gender": gender,
              "dob": dob,
              "email": email,
              "phone": phone,
              "qualification": qualification,
              "photo": photo,
              "course": course,
              "guardianName": guardianName,
              "guardianPhone": guardianPhone,
            }),
            success: function (returnedData) {
              if(returnedData == "" || returnedData == null){
                window.alert("Internal Server Error!");
                return;
              }
              userId = returnedData.userId;
              formStepsNum++;
              updateFormSteps();
              updateProgressbar();
            },
            error: function (error) {
              console.log(error);
            },
            dataType: "json",
          });
        }else{
          window.alert("Enter Valid Details!");
        }
       }
    });
  });


  prevBtns.forEach((btn) => {
    btn.addEventListener("click", () => {
      formStepsNum--;
      updateFormSteps();
      updateProgressbar();
    });
  });

  function updateFormSteps() {
    formSteps.forEach((formStep) => {
      formStep.classList.contains("form-step-active") &&
        formStep.classList.remove("form-step-active");
    });

    formSteps[formStepsNum].classList.add("form-step-active");
  }

  function updateProgressbar() {
    progressSteps.forEach((progressStep, idx) => {
      if (idx < formStepsNum + 1) {
        progressStep.classList.add("progress-step-active");
      } else {
        progressStep.classList.remove("progress-step-active");
      }
    });

    const progressActive = document.querySelectorAll(".progress-step-active");

    progress.style.width =
      ((progressActive.length - 1) / (progressSteps.length - 1)) * 100 + "%";
  }

  $("#submit").click((e) => {
    e.preventDefault();
    if(validAddress && validState && validCity && validPinCode){
      addLine1 = $("#addL1").val();
      addLine2 = $("#addL2").val();
      state = $("#state").val();
      city = $("#city").val();
      pincode = $("#pincode").val();
    
      $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/portal/register/address",
        data: JSON.stringify({
          "userId": userId,
          "addLine1": addLine1,
          "addLine2": addLine2,
          "state": state,
          "city": city,
          "pincode": pincode
        }),
        success: function (returnedData) {
          if(returnedData == "" || returnedData == null){
            window.alert("Internal Server Error");
            return;
          }
          window.location.href = "/portal/register/success";
        },
        error: function (error) {
          window.alert("Internal Server Error");
        },
        dataType: "json",
      });
    }else{
      window.alert("Enter Valid Details!");
    }
  }); 
   //Validation
   $("#ccatNo").blur(function(){
    var ccatNo = $("#ccatNo").val()
    if (isNaN(ccatNo)){
     $("#register_message_ccatNo").html(" CcatNo must be a number!");
    }else{
     $("#register_message_ccatNo").html("");
     return true;
    }
 });
 
$("#fName").blur(function(){
    var fName = $("#fName").val()
    if (!fName.match(/^[a-zA-Z]+$/)){
     $("#register_message_name").html(" For your name please use alphabets only!");
    }else{
     $("#register_message_name").html("");
     return true;
    }
  });
   var validPhone  = false;
    $("#phone").blur(function(){
    var phone = $("#phone").val()
    if (isNaN(phone) || (phone.length != 10)){
     $("#register_message_phone").html(" Please enter a valid phone number!");
    }else{
     $("#register_message_phone").html("");
      validPhone =  true;
    }
 });

var validEmail = false;
$("#email").blur(function(){
  var email = $("#email").val()
  if (!email.match(/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/)){
   $("#register_message_email").html(" Please Enter Valid Email Id!");
  }else{
   $("#register_message_email").html("");
      validEmail = true;
  }
});
var validGuardianName = false;
$("#guardianName").blur(function(){
  var guardianName = $("#guardianName").val()
  if (!guardianName.match(/^[a-zA-Z]+$/)){
   $("#register_message_gName").html(" For your name please use alphabets only!");
  }else{
   $("#register_message_gName").html("");
        validGuardianName = true;
  }
});

var validGuardianPhone  = false;
 $("#guardianPhone").blur(function(){
  var guardianPhone = $("#guardianPhone").val()
  if (isNaN(guardianPhone) || (guardianPhone.length != 10)){
   $("#register_message_gPhone").html(" Please enter a valid phone number!");
   
  }else{
   $("#register_message_gPhone").html("");
      validGuardianPhone = true;
  }
});


//validation : address

var validAddress = false;
$("#addL1").blur(function(){
  var addL1 = $("#addL1").val()
  if ((addL1 == "")){
   $("#register_message_address").html("Address can not be Null!");
  }else{
   $("#register_message_address").html("");
        validAddress = true;
  }
});


var validState = false;
   $("#state").blur(function(){
  var state = $("#state").val()
  if (!state.match(/^[a-zA-Z]+$/)){
   $("#register_message_state").html(" For your state please use alphabets only!");
  }else{
   $("#register_message_state").html("");
     validState = true;
  }
});
 var validCity = false;
   $("#city").blur(function(){
  var city = $("#city").val()
  if (!city.match(/^[a-zA-Z]+$/)){
   $("#register_message_city").html(" For your city please use alphabets only!");
  }else{
   $("#register_message_city").html("");
       validCity = true;
  }
});
var validPinCode  = false;
    $("#pincode").blur(function(){
    var pincode = $("#pincode").val()
    if (isNaN(pincode) || (pincode.length != 6)){
     $("#register_message_pincode").html(" Please enter a valid Pincode!");
    }else{
     $("#register_message_pincode").html("");
      validPinCode =  true;
    }
 });
 $("#image_input").rules("add", {
  accept: "jpg|jpeg|png"
});
});