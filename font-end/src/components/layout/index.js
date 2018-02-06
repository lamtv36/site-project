import React, { Component } from 'react';
import "../../assert/css/layout.css"
import Link from 'react-router-dom/Link';
import MainNavigation from "./components/main-navigation";
import DropDownOption from "./components/drop-down-option";
// import MemberCollection from "./components/members";

export default class Layout extends Component {
  render() {
    return (
    <div>
      <header>Header</header>
      <section class="main hbox">
        <MainNavigation />
        <article id="main-content"> 
          {this.props.children}
        </article>
        <aside>Aside</aside>
      </section> 
      {/* <footer>Copyright &copy; NTQ-Solution.com.vn</footer> */}
    </div>
    ); 
  }
}