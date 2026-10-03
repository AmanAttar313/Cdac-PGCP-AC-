import React, { Component, PureComponent } from "react";
class PureCompo extends PureComponent{ 
    // prevent un necessary re rendering  using pure component
    render(){
        console.log("pure Componet render")
        return(
            <div>
                <p>Item:{this.props.newItem}</p>
            </div>
        )
    }
}
export default PureCompo;