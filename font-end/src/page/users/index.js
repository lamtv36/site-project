import React, { Component } from 'react';
import $ from "jquery";
import FullyCustomInsertButtonTable from "./components/table"
import Layout from "../../components/layout" ;
import {formater} from "./user-table-formater";

export default class Users extends Component {
  constructor(){
    super();
    this.state = {
      data: [],
      formater: formater
    }
    this.hostAddress = "http://localhost:8080/ns1/users/list";
    this.onload();
  }

  onload(){
    
    const that = this;
    $.get( this.hostAddress, function( data ) {
      const state = that.state;
      state.data = data.rows;
      that.setState(state);
    });
  }

  addUser(data){
    const hostAddress = "http://localhost:8080/ns1/users";
    $.ajax({
      url: hostAddress,
      headers: {
        'Content-Type':'application/json'
      },
      type: "post",
      data: JSON.stringify(data),
      success: function(msg){
          debugger
      },
      error: function(msg){
         debugger
      },
      complete: function(msg){
          debugger
      }
    });
  }

  render() {
    const options = {
      insertBtn: this.addUser,

    }
    return (
      <Layout>
        <FullyCustomInsertButtonTable 
        data={this.state.data}
        formater={this.state.formater}
        events = {
          {
            onAfterInsertRow: this.addUser
          }
        }
        options = {options}
        />
        </Layout>
    );
  }
}
