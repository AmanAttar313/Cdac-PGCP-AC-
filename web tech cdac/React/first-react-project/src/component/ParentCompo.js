import React, { Component } from "react";
import ChildCompo from "./ChildCompo";
import PureCompo from "./PureCompo";
import UseMemo from "./UseMemo";
class ParentCompo extends Component{
    constructor(props){
        super(props)
        this.state={
            item:"VADAPAV",
            price:25
        }
    }
    ChangeData=()=>{
        this.setState((prevState)=>({item:"Vadapav with chatni",price:prevState.price+5}))
    }   
    render(){
        console.log("parent compo render")
        return(
            <div>
                <h1>Parent Compo</h1>
                <div>Samosa:{this.state.item} </div>
                <div>price:{this.state.price} </div>
                <button type="button" onClick={()=>{this.ChangeData()}}>Change Item Data</button>
                <hr/>
                <ChildCompo newItem={this.state.item} newPrice={this.state.price} parentMethod={()=>this.ChangeData()}></ChildCompo>
                <hr/>
                <PureCompo newItem={this.state.item} />
                <hr/>
                <UseMemo newItem={this.state.item}/>

            </div>
        )
    }
}
export default ParentCompo;