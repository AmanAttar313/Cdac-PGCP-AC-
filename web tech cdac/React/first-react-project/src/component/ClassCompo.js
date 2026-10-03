import React, { Component } from "react";

class ClassCompo extends Component{

    render(){
            const {fname,lname,pin}=this.props;
        return (
            <div>
            <h1>Class Component</h1>
            <p>Hello i am claass compo</p>
            {/* <h1>Fname: {this.props.fname} lname:{this.props.lname} Pin:{this.props.pin}</h1> */}
            {/* or */}
             <h1>Fname: {fname} lname:{lname} Pin:{pin}</h1> 
            </div>
        )
    }
}
export default ClassCompo;