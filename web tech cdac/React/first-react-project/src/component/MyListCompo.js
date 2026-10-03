import React, { Component } from 'react'

class MyListCompo extends Component {
  constructor(props) {
    super(props)
  
    this.state = {
       courses:[
        {id:1,name:"html",price:200},
        {id:1,name:"react",price:300},
        {id:1,name:"css",price:400},
        {id:1,name:"js",price:500},

       ],
       emp:[
        {empid:1,name:"aman",post:"developer",salary:10000},
        {empid:2,name:"aqsa",post:"CEO",salary:30000},
        {empid:3,name:"ajinkya",post:"Manager",salary:50000},
        {empid:4,name:"Bhairavi",post:"founder",salary:40000},

       ]
    }
  }
  render() {
    const {courses}=this.state;
    return (
      
      <div>
        <h2 className='text-primary'>my List Component</h2>
        <ul>
          {
            courses.map((val,index)=>{
              return <li key={index}>{val.name}--{val.price}</li>
            })
          }
        </ul>
      </div>
    )
  }
}

export default MyListCompo