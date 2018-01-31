import React, { Component } from 'react';
import './App.css';
import Link from 'react-router-dom/Link'
import {BrowserRouter as Router} from 'react-router-dom'
import Routes from './constants/routes';


class Main extends Component {
  render() {
    return (
      // <Router>
        <div className="app" style={{width:"100%"}}>
        <Routes/>
        </div>
    );
  }
}

export default Main;
