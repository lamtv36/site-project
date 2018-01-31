
import React from "react";
import {BootstrapTable, TableHeaderColumn} from "react-bootstrap-table";
import 'react-bootstrap-table/dist/react-bootstrap-table-all.min.css';

export default class FullyCustomInsertButtonTable extends React.Component {
    constructor(){
        super();
        this.products = [{
            id: 1,
            name: "Product1",
            email: 120
        }];
        
    }
    createCustomDeleteButton = (onBtnClick) => {
      return (
        <button style={ { color: 'red' } } onClick={ onBtnClick }>Delete it!!!</button>
      );
    }
  
    render() {
      const options = {
        deleteBtn: this.createCustomDeleteButton
      };
      const selectRow = {
        mode: 'checkbox'
      };
      return (

        <BootstrapTable selectRow={ selectRow } data={ this.products } options={ options } deleteRow pagination insertRow >
          {/* <TableHeaderColumn dataField='id' isKey={ true } width='35'>ID</TableHeaderColumn> */}
          <TableHeaderColumn dataField='name'>Name</TableHeaderColumn>
          <TableHeaderColumn dataField='email' isKey={true}>Email</TableHeaderColumn>
          <TableHeaderColumn dataField='nick_name'>Nick Name</TableHeaderColumn>
          <TableHeaderColumn dataField='point'>Danh Vọng</TableHeaderColumn>
          <TableHeaderColumn dataField='email'>Email</TableHeaderColumn>
          <TableHeaderColumn dataField='email'>Email</TableHeaderColumn>
          <TableHeaderColumn dataField='email'>Email</TableHeaderColumn>
          
        </BootstrapTable>
      );
    }
  }