
import React from "react";
import {BootstrapTable, TableHeaderColumn} from "react-bootstrap-table";
import {activeFormatter} from "./active-format";
import 'react-bootstrap-table/dist/react-bootstrap-table-all.min.css';

export default class FullyCustomInsertButtonTable extends React.Component {
    constructor(props){
        super(props);
        this.props = props;
    }
    createCustomDeleteButton = (onBtnClick) => {
      return (
        <button style={ { color: 'red' } } onClick={ onBtnClick }>Delete it!!!</button>
      );
    }
  
    render() {
      const cellEditProp = {
        mode: 'dbclick',
        blurToSave: true
      };

      const options = {
        insertText: 'Add',
        deleteText: 'Delete',
        exportCSVText: 'Export',
        saveText: 'Save',
        clearSearch: true
        }
      return (

        <BootstrapTable
        search={ true }
        multiColumnSearch={true}
        data={ this.props.data } 
        options={ options } 
        deleteRow 
        pagination 
        insertRow
        cellEdit={cellEditProp} 
        keyBoardNav
        exportCSV={ true }
        >
          <TableHeaderColumn dataField='id'hidden>ID</TableHeaderColumn>
          <TableHeaderColumn dataField='name' dataSort={ true }>Name</TableHeaderColumn>
          <TableHeaderColumn dataField='email' isKey={ true } dataSort={ true }>Email</TableHeaderColumn>
          <TableHeaderColumn dataField='nickname' dataSort={ true }>Nick Name</TableHeaderColumn>
          <TableHeaderColumn dataField='team'>Team</TableHeaderColumn>
          <TableHeaderColumn dataField='division'>Division</TableHeaderColumn>
          <TableHeaderColumn dataField='joindate'>Join Date</TableHeaderColumn>
          <TableHeaderColumn dataField='point'>Danh Vọng</TableHeaderColumn>
          <TableHeaderColumn dataField='codefight'>Code Fight Username</TableHeaderColumn>
          <TableHeaderColumn dataField='active' dataFormat={ activeFormatter} width="80">Active</TableHeaderColumn>
          <TableHeaderColumn dataField='action' dataFormat={ activeFormatter} width="80">Action</TableHeaderColumn>
        </BootstrapTable>
      );
    }
  }