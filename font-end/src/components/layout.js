import React, { Component } from 'react';
import "../assert/css/layout.css"
import {BrowserRouter as Router, Link, Route} from 'react-router-dom'

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
debugger
    const { children } = this.props;
    var childrenWithProps = "";
    if(typeof children == "object"){
      childrenWithProps = React.Children.map(children, child =>
        React.cloneElement(child));
    }
    return (
      <div id="layout">
        <div id="header">
        <Router>
        <ul style={style}>
          <li style={liStyle}><Link to="/dashboard">Dashboard</Link></li>
          <li style={liStyle}><Link to="/meeting">meeting</Link></li>
          <li style={liStyle}><Link to="/resources">resources</Link></li>
          <li style={liStyle}><Link to="/schedule">schedule</Link></li>
          <li style={liStyle}><Link to="/profile">profile</Link></li>
          <li style={liStyle}><Link to="/users">users</Link></li>
        </ul>
        </Router>
        </div>
        <div id="main-wrap">
          <div id="sidebar">Navigation</div>
          <div id="content-wrap">{childrenWithProps}</div>
        </div>
        <div id="footer">Footer</div>
      </div>
    );
  }
}