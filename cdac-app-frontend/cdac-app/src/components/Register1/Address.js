import React from "react";

function Address(){
    return(
        <div>
      <container-fluid>
        <form>
          <label for="addLine1">Address Line 1</label>
          <input type="text" id="addLine1"/>
          <br/>
          <label for="addLine2">Address Line 2</label>
          <input type="text" id="addLine2"/>
          <br/>
          <label for="state">State</label>
          <input type="text" id="state"/>
          <br/>
          <label for="city">City</label>
          <input type="text" id="city"/>
          <br/>
          <label for="pincode">Pin Code</label>
          <input type="number" id="pincode"/>
          <br/>
          <br/>
          <a href="/" class="btn btn-default btn-lg active" role="button">Previous</a>
          <a href="/final" class="btn btn-default btn-lg active" role="button">View Form</a>
        </form>
      </container-fluid>
    </div>
    );
};

export default Address