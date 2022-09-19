import React from 'react';
import Login from './components/Login';
import './App.css';
import Validate from './components/Register/Validate';
import { BrowserRouter,Route,Routes} from "react-router-dom";
import PersonalDetails from './components/Register1/PersonalDetails';
import MultistepForm from './components/Register/MultistepForm';

function App() {
  return (
    <div>
      {/* <BrowserRouter>
        <Routes>
              <Route path="/"  element={<Login />}>
              </Route>
              <Route path="/validate"  element={<Validate />}>
              </Route>
        </Routes>
      </BrowserRouter> */}
      <MultistepForm />
    </div>    
  );
}

export default App;