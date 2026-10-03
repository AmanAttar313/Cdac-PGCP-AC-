import React, { Component } from "react"
class CountCompo extends Component{
constructor(props){
    super(props);
    this.state={
        count:0
    }
}
    countIncremet=()=>{
         this.setState((prevstate)=>({count:prevstate.count+1}))
        
    }
    countDecremet=()=>{
         this.setState((prevstate)=>({count:prevstate.count-1}))
        
    }
    countReset=()=>{
          this.setState({
            count: 0
        });
    }

render(){
    
    return(
        
        <div>
            <span >Count  : {this.state.count}  </span>
            <button type="button" onClick={()=>this.countIncremet()}>Increment</button>
            <button type="button" onClick={()=>this.countDecremet()}>Decrement</button>
            <button type="button" onClick={()=>this.countReset()}>Reset</button>

            
        </div>
    )
}
}
export default CountCompo;