import React, { Component } from "react";

class StateCompo extends Component{
    constructor(props){
         super(props)
         this.state={
            fname:"AMAN",
            sal:1234
         };
    };

     changeState=()=>{
            this.setState((prevState)=>({fname:"ATTAR",sal:prevState.sal+1000}))
        }
    render(){
       
        return(
            <div>
                <h2>STATE COMPONENT</h2>
                <p>Name:{this.state.fname} , sal:{this.state.sal}</p>
                <button type="button" onClick={()=>{this.changeState()}}>Change State DATA</button>
                <br/>
                <button type="button" onClick={()=>{this.setState((prevState)=>({fname:"ATTAR",sal:prevState.sal+1000}))}}>Change State DATA</button>


            </div>
        )
    }
}
export default StateCompo;