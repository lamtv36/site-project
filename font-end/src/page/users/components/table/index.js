
import React from "react";
import {BootstrapTable, TableHeaderColumn} from "react-bootstrap-table";
import {activeFormatter} from "./active-format";
import 'react-bootstrap-table/dist/react-bootstrap-table-all.min.css';

export default class FullyCustomInsertButtonTable extends React.Component {
    constructor(props){
        super(props);
        this.props = props;
        this.state = {
          formater: this.props.formater,
          events: {
            onAfterInsertRow: this.props.events.onAfterInsertRow
          }
        }
    }
    createCustomDeleteButton = (onBtnClick) => {
      return (
        <button style={ { color: 'red' } } onClick={ onBtnClick }>Delete it!!!</button>
      );
    }

    getTableHeaderCollum(headers){
      if(headers.length > 0){
        return headers.map((header, index) => {
            return (
            <TableHeaderColumn isKey={header.isKey ? true : false} dataField={header.dataField}> {header.name}</TableHeaderColumn>
            )
        }) 
      }
      return [];
    }
  
    render() {
      const options = {
        insertText: 'Add',
        deleteText: 'Delete',
        exportCSVText: 'Export',
        saveText: 'sdfasdfasdfasdf',
        clearSearch: true,
        afterInsertRow: this.state.events.onAfterInsertRow
        }
      return (

        <BootstrapTable
        data={ this.props.data } 
        options={ options } 
        deleteRow 
        insertRow
        >
        {this.getTableHeaderCollum(this.state.formater)}
        </BootstrapTable>
      );
    }
  }