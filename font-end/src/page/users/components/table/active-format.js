import React from "react";

class ActiveFormatter extends React.Component {
    render() {
      return (
        <input type='checkbox' checked={ this.props.active }/>
      );
    }
  }

export var activeFormatter = function(cell, row) {
    return (
      <ActiveFormatter active={ cell } />
    );
  }