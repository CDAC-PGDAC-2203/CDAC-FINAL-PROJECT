import { Component } from 'react';
import { Link, Route, Router } from 'react-router-dom';
import {
  Button,
  Form,
  FormGroup,
  Input,
  Label
} from 'reactstrap';
import '../App.css';
import Validate from './Register/Validate';

function Login() {
    return (
      <div className="App">
        <h2>Sign In</h2>
        <Form className="form">
          <FormGroup>
            <Label for="exampleEmail">Username</Label>
            <Input
              type="email"
              name="email"
              id="exampleEmail"
              placeholder="example@example.com"
            />
          </FormGroup>
          <FormGroup>
            <Label for="examplePassword">Password</Label>
            <Input
              type="password"
              name="password"
              id="examplePassword"
              placeholder="********"
            />
          </FormGroup>
        <Button>Submit</Button>
      </Form>
      <br/>
      <span>Not a user? </span>
      <Router>
      <Route path="/Register/Validate">
        <Validate />
      </Route>
      <Link
        to={{
          pathname: "/Register/Validate",
          state: { fromDashboard: true },
        }}
      >
        Register
      </Link>
    </Router>
    </div>
  );
}

export default Login