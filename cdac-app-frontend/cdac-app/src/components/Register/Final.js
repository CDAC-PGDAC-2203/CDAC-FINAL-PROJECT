import React from "react";
import { Card } from "react-bootstrap";

const Final = ({ values }) => {

    //destructuring the object from values
  const { firstName,middleName, lastName,dob, email,qualification,adr1 ,adr2,state,city,pincode} = values;
  return (
    <>
      <Card style={{ marginTop: 100, textAlign: "left" }}>
        <Card.Body>
          <p>
            <strong>First Name :</strong> {firstName}{" "}
          </p>
          <p>
            <strong>Middle Name :</strong> {middleName}{" "}
          </p>
          <p>
            <strong>Last Name :</strong> {lastName}{" "}
          </p>
          <p>
            <strong>Date of birth :</strong> {dob}{" "}
          </p>
          <p>
            <strong>Email :</strong> {email}{" "}
          </p>
          <p>
            <strong>Qualification :</strong> {qualification}{" "}
          </p>
          <p>
            <strong>AddressLine 1 :</strong> {adr1}{" "}
          </p>
          <p>
            <strong>AddressLine 2 :</strong> {adr2}{" "}
          </p>
          <p>
            <strong>State :</strong> {state}{" "}
          </p>
          <p>
            <strong>City :</strong> {city}{" "}
          </p>
          <p>
            <strong>Pincode :</strong> {pincode}{" "}
          </p>
         
        </Card.Body>
      </Card>
    </>
  );
};

export default Final;