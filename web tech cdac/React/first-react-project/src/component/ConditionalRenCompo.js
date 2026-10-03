import { Component } from "react";

class ConditionalRenCompo extends Component{
    constructor(props){
        super(props);
        this.state={
            isCond:true
        }

    }
    render(){
// // //use of is else
//        if(!this.state.isCond==true){
//         return <h2>aman login</h2>
//        }
//        else{
//         return <h2>aqsalogin</h2>
//        }

// //use of is else and element as variable
//     let msg="";
//        if(!this.state.isCond==true){
//       msg="AMAN login"
//        }
//        else{
//          msg="Aqsa login"
//        }
//        return <h2>{msg}</h2>

    // // //using ternary
    // return(this.state.isCond)?<h2>aman login</h2>:<h2>aqsa login</h2>;
    

    // // short-ciruits

    return this.state.isCond && <h2>aman login</h2>
    
}
}
export default ConditionalRenCompo;