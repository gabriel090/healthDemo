import React, { Component } from 'react'
import { Navbar, NavDropdown, Form, FormControl, Button, Nav } from 'react-bootstrap'
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";

import Diagnosis from './DiagnosisComponent';
import Symptoms from './SymptomsComponent';

export default class NavbarComp extends Component {
    render() {
        return (
            <Router>
                <div>

                    <Navbar bg="dark" variant={"dark"} expand="lg">
                      
                        <Navbar.Toggle aria-controls="navbarScroll" />
                        <Navbar.Collapse id="navbarScroll">
                            <Nav
                                className="mr-auto my-2 my-lg-0"
                                style={{ maxHeight: '100px' }}
                                navbarScroll >
                                <Nav.Link as={Link} to="/symptoms">Symptoms</Nav.Link>
                                
                                <Nav.Link as={Link} to="/diagnosis">Diagnosis</Nav.Link>

                            </Nav>

                        </Navbar.Collapse>
                    </Navbar>
                </div>
                <div>
                    <Switch>
                      
                        <Route path="/diagnosis">
                            <Diagnosis />
                        </Route>
                        <Route path="/">
                            <Symptoms />
                        </Route>
                    </Switch>
                </div>
            </Router>
        )
    }
}
