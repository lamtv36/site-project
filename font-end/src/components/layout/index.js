import React, { Component } from 'react';
import "../../assert/css/layout.css"
import Link from 'react-router-dom/Link'

export default class Layout extends Component {
  render() {

    let style = {
      display: "inline-flex",
      listStyleType: "none",
      margin: "0px",
      paddingLeft: "10px",
    };
    
    let liStyle = {
      padding: "10px",
    }
    return (
    <div class="container">
      <header>
        <h1>Site project</h1>
      </header>
      <nav>
        <img src="#" alt="avatar" width ="30" height = "30" />
        <ul>
        <li><Link to="/dashboard">Dashboard</Link></li>
        <li><Link to="/meeting">Meeting</Link></li>
        <li><Link to="/resources">Resources</Link></li>
        <li><Link to="/schedule">Schedule</Link></li>
        <li><Link to="/topics">Topics</Link></li>
        <li><Link to="/users">Users</Link></li>
        </ul>
      </nav>
      <article>
        {this.props.children}
      </article>
      <footer>Copyright &copy; NTQ-Solution.com.vn</footer>
    </div>
    );
  }
}