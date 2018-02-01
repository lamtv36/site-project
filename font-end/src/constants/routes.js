import React from 'react';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import {
    Dashboard,
    Meeting,
    Resource,
    Schedule,
    Users,
    Topics
} from "../page";

export default () => (
  <Router>
      <div>
        <Route exact path="/" component={Dashboard}/>
        <Route path="/dashboard" component={Dashboard}/>
        <Route path="/meeting" component={Meeting}/>
        <Route path="/resources" component={Resource}/>
        <Route path="/schedule" component={Schedule}/>
        <Route path="/topics" component={Topics}/>
        <Route path="/users" component={Users}/>
      </div>
  </Router>
)

