import React, { Component } from 'react';
import FullyCustomInsertButtonTable from "../../components/table"

import Layout from "../../components/layout";

export default class Users extends Component {
  constructor(){
    super();
    this.state = {
      data: []
    }
  }

  render() {
    let divStyle1 = {
      display: "inline-block",
      width: "150px",
      height: "100%",
      border: "1px solid gray"
    }
    let divStyle2 = {
      display: "inline-block",
      width: "800px",
      border: "1px solid gray",
    }
    return (
      <Layout><FullyCustomInsertButtonTable style={{margin: "20px"}}/></Layout>
    );
  }
}
