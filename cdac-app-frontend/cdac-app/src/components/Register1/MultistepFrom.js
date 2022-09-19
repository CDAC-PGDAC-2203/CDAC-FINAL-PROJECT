import React from "react";
import PersonalDetails from "./PersonalDetails";
import Address from "./Address";
import Final from "./Final"
import { BrowserRouter,Route,Routes} from "react-router-dom";

function MultistepForm(){
    return(
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path="/"  element={<PersonalDetails />}>
                    </Route>
                    <Route path="/address"  element={<Address />}>
                    </Route>
                    <Route path="/final"  element={<Final />}>
                    </Route>
                </Routes>
            </BrowserRouter>
        </div>
    )

};

export default MultistepForm;