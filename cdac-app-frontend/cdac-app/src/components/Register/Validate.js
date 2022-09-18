import React from 'react';
import Container from 'react-bootstrap/Container';
import Form from 'react-bootstrap/Form';
 
function Validate() {
    return (
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
        <br/>
        <button>Next</button>
      </Form>
    </Container>
    );       
}
export default Validate;