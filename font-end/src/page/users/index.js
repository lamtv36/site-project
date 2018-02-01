import React, { Component } from 'react';
import $ from "jquery";
import FullyCustomInsertButtonTable from "./components/table"
import Layout from "../../components/layout" ;

export default class Users extends Component {
  constructor(){
    super();
    this.state = {
      data: [{
        id: 1,
      name: "Product1",
      email: 120
      }],
      formater: {
        name: {

        }
      }
    }
    this.onload();
  }

  onload(){
    const hostAddress = "http://localhost:8080/ns1/users/list";
    const that = this;
    $.get( hostAddress, function( data ) {
      const state = that.state;
      state.data = data.rows;
      that.setState(state);
    });
  }
  render() {
    return (
      <Layout>
        <FullyCustomInsertButtonTable 
        data={this.state.data} 
        formarter = {this.state.formater}
        />
        </Layout>
    );
  }
}
