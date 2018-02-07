import React, { Component } from 'react';
import $ from "jquery";
import Layout from "../../../../components/layout" ;

export default class Profile extends Component {
	constructor(props){
	    super(props);
	    this.state = {}
	    this.hostAddress = "http://localhost:8080/ns1/users/?id=" + this.props.match.params.userId;
	    this.onload();
	  }

	  onload(){
	    
	    const that = this;
	    $.get( this.hostAddress, function( data ) {
	      const state = that.state;
	      state.name = data.name;
	      state.email = data.email;
	      state.team = data.team.name;
	      state.division = data.team.division.name;
	      that.setState(state);
	    });
	  }

  render() {
    return (
      <Layout>
	      <div className="profile container">
	      	<div className="row">
	      		<div className="col-sm-2 col-md-2 col-lg-2">
	      		<img width="150px" height="150px" 
	      			src="http://petandbirdclinic.com/wp-content/uploads/2015/12/facebook-profile-blank-face-300x225.jpeg" 
	      				alt="John"/>
	      		</div>
	      		<div className="col-sm-10 col-md-10 col-lg-10">
		      		<div className="row">
		      		<div className="col-sm-2 col-md-2">
		      			Name:
		      		</div>
		      		<div className="col-sm-6 col-md-6">
		      			{this.state.name}
		      		</div>
		      	</div>
		      	<div className="row">
	      		<div className="col-sm-2 col-md-2">
	      				Email:
	      				</div>
	      			<div className="col-sm-6 col-md-6">
	      				{this.state.email}
	      			</div>
	      		</div>
	      		<div className="row">
	  				<div className="col-sm-2 col-md-2">
	  					Team:
	  				</div>
	  				<div className="col-sm-6 col-md-6">
	  					{this.state.team}
	  				</div>
	  			</div>
	  			<div className="row">
	  				<div className="col-sm-2 col-md-2">
	  					Division:
	  				</div>
	  				<div className="col-sm-6 col-md-6">
	  					{this.state.division}
	  				</div>
	  			</div>
	      		</div>
	      	</div>
	      	<div className="row pull-right">
	      		<button className="btn btn-primary">Edit</button>
	      		<button className="btn btn-danger">Delete</button>
	      	</div>
		</div>
      </Layout>
    );
  }
}
