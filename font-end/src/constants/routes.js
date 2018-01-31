import React from 'react';
import {BrowserRouter as Router, Link, Route} from 'react-router-dom'

import {
    Dashboard,
    Meeting,
    Resource,
    Schedule,
    Users,
    Profile
} from "../page";
let style = {
  display: "inline-flex",
  listStyleType: "none",
  margin: "0px",
  paddingLeft: "10px",
};

let liStyle = {
  padding: "10px",
}
export default () => (
  <div>
    <Router>
      <div >
        <div>
          <Route exact path="/" component={Dashboard}/>
          <Route path="/dashboard" component={Dashboard}/>
          <Route path="/meeting" component={Meeting}/>
          <Route path="/resources" component={Resource}/>
          <Route path="/schedule" component={Schedule}/>
          <Route path="/profile" component={Profile}/>
          <Route path="/users" component={Users}/>
        </div>
      </div>
    </Router>
  </div>
)

