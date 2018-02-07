import React from 'react';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import {
    Dashboard,
    Meeting,
    Resource,
    Schedule,
    Users,
    Topics,
    Profile
} from "../page";

const RouteUsersGroup = ({match}) => (
	<div> 
	    <Route exact path={match.url} component={Users}/>
	    <Route path={`${match.url}/:userId`} component={Profile}/>
    </div>
)

export default () => (
  <Router>
      <div>
        <Route exact path="/" component={Dashboard}/>
        <Route path="/dashboard" component={Dashboard}/>
        <Route path="/meeting" component={Meeting}/>
        <Route path="/resources" component={Resource}/>
        <Route path="/schedule" component={Schedule}/>
        <Route path="/topics" component={Topics}/>
        <Route path="/users" component={RouteUsersGroup}/>
      </div>
  </Router>
)

