$(document).ready(() => {
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
  
  nextBtns.forEach((btn) => {
    btn.addEventListener("click", () => {
      if(formStepsNum == 0){
        ccatNo = $("#ccatNo").val();
        fName = $("#fName").val();

        if((ccatNo == "")||(fName == "")){
          window.alert("All fields are mandatory!");
          return;
        }
        $.ajax({
          type: "POST",
          contentType: "application/json",
          url: "/portal/register/validate",
          data: JSON.stringify({
                  "ccatNo": ccatNo, 
                  "fName" : fName
              }),
          success: function(returnedData){
                    mName = returnedData.mName;
                    lName = returnedData.lName;
                    course = returnedData.course;
                    dob = returnedData.dob;

                    $("#fNamePd").val(fName).prop('disabled', true);
                    $("#mName").val(mName).prop('disabled', true);
                    $("#lName").val(lName).prop('disabled', true);
                    $("#dob").val(dob).prop('disabled', true);
                    $("#course").val(course).prop('disabled', true);

                    formStepsNum++;
                    updateFormSteps();
                    updateProgressbar();
          },
          error: function(error){
                console.log(error);
          },
          dataType: "json"
          });
      


      }else if(formStepsNum == 1){
                
        gender = $("input[name='gender']:checked").val();
        email = $("#email").val();
        phone = $("#phone").val();
        qualification = $("#qualification").val();
        photo = $("#photo").val();
        guardianName = $("#guardianName").val();
        guardianPhone = $("guardianPhone").val();

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
            "guardianPhone": guardianPhone
          }),
          success: function(returnedData){
                    formStepsNum++;
                    updateFormSteps();
                    updateProgressbar();
          },
          error: function(error){
                console.log(error);
          },
          dataType: "json"
          });
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
  
});