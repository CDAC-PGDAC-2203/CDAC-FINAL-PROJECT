import React, { useState } from "react";
import { Form, Card, Button } from "react-bootstrap";
import validator from "validator";

// creating functional component ans getting props from app.js and destucturing them
 function PersonalDetails() {

  return (
    <div>
      <container-fluid>
        <form>
          <label for="fName">First Name</label>
          <input type="text" id="fName"/>
          <br />
          <label for="mName">Middle Name</label>
          <input type="text" id="mName"/>
          <br />
          <label for="lName">Last Name</label>
          <input type="text" id="lName"/>
          <br/>
          <br/>
          <label for="gender">Gender</label>
          <br/>
          <input type="radio" name="gender" value="male" /> Male<br/>
          <input type="radio" name="gender" value="female" /> Female<br/>
          <input type="radio" name="gender" value="other" /> Other<br/>
          <a href="/address" class="btn btn-default btn-lg active" role="button">Next</a>
        </form>
      </container-fluid>
    </div>
  );
};

export default PersonalDetails;