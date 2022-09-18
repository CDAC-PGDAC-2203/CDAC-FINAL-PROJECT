import React from "react";
import { Form } from "react-bootstrap";

function PersonalInfo({ handleChange }) {
  return (
    <div className="d-flex flex-column align-items-center">
      <h2>Personal Info</h2>
      <Form.Group className="w-75 mt-4">
        <Form.Control
          placeholder="First Name"
          onChange={handleChange("first_name")}
          name="first_name"
        />
      </Form.Group>
      <Form.Group className="w-75 mt-4">
        <Form.Control
          placeholder="Last Name"
          onChange={handleChange("last_name")}
          name="last_name"
        />
      </Form.Group>
      <Form.Group className="w-75 mt-4">
        <Form.Control
          placeholder="First Name"
          as="select"
          onChange={handleChange("gender")}
          name="gender"
        >
          <option>Male</option>
          <option>Female</option>
        </Form.Control>
      </Form.Group>
    </div>
  );
};

export default PersonalInfo;