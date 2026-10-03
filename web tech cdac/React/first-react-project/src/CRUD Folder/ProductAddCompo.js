import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const ProductAddCompo = () => {
  const nav=useNavigate();
  const [myProducts,setMyproducts]=useState({
      pname:"",
      psal:"",
      pprice:""
    })
  const inputChangeHandler=(event)=>{
    const {type,name,value}=event.target;
    setMyproducts({...myProducts,[name]:value})

  }
 const addData=(event1)=>{
      event1.preventDefault();
      axios.post(`http://localhost:2000/user`,myProducts).then(()=>{
        window.alert("Product added successfully");
        nav("/dashboard/productDash")
      }).catch(()=>{})
      
    }
  return (
    <div>
      <h2>Product add component</h2>
      <div className='row'>
        <div className='col-md-3'></div>
        <div className='col-md-6'>

          <form onSubmit={addData}>
            <label className='form-label'>Enter Product Name</label>
            <input type='text' pnam="pname" className='form-control'onChange={inputChangeHandler} value={myProducts.pname}/>

            <label className='form-label'>Enter Salary</label>
            <input type='text' pnam="psal" className='form-control' onChange={inputChangeHandler} value={myProducts.psal}/>

            <label className='form-label'>Price</label>
            <input type='text' pnam="pprice" className='form-control' onChange={inputChangeHandler} value={myProducts.pprice}/>

            <button type='submit' className='btn btn-success mt-3'>Submit</button>
            

          </form>
        </div>
        <div className='col-md-3'></div>


      </div>
    </div>
  )
}

export default ProductAddCompo