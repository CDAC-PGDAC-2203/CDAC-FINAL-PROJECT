import React, {useContext, useState} from "react";
import Container from 'react-bootstrap/Container';
import Form from 'react-bootstrap/Form';
import { CcatContext } from "./CcatContext"; 
import PersonalDetails  from "./PersonalDetails";

function Validate() {
    var [ccatNo,setCcatNo] = useState("");
    var handleblur=function(e){
      setCcatNo(e.target.value);
    }
    var [compState, setCompState] = useState();
    return (
    <CcatContext.Provider value={ccatNo}>
    <Container>
      <Form>
        <Form.Group>
            <Form.Label>CCAT Number</Form.Label>
            <Form.Control type="text" placeholder="CCAT Number" />
        </Form.Group>
        <Form.Group>
            <Form.Label>First Name</Form.Label>
            <Form.Control type="text" placeholder="First Name" />
        </Form.Group>
      </Form>
      <button onClick={()=>{setCompState(<PersonalDetails />)}}>Next</button>
    </Container>
    </CcatContext.Provider>
    );       
}
export default Validate;