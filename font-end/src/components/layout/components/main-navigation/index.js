import React, { Component } from 'react';
import Link from 'react-router-dom/Link'
import UserPanel from "./user-panel";

export default class MainNavigation extends Component {
  render() {
    return (
    <div>
        <UserPanel />
        <nav>
          <ul>
          <li><Link to="/dashboard">Dashboard</Link></li>
          <li><Link to="/meeting">Meeting</Link></li>
          <li><Link to="/resources">Resources</Link></li>
          <li><Link to="/schedule">Schedule</Link></li>
          <li><Link to="/topics">Topics</Link></li>
          <li><Link to="/users">Users</Link></li>
          </ul>
        </nav>
    </div>
    );
  }
}