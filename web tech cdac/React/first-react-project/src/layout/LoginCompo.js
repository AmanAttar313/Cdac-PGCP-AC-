import React, { useRef } from 'react'

const LoginCompo = () => {
  let uid=useRef();
  let upass=useRef();
  const getDetail=()=>{
    console.log(uid.current.value)
    
  }
  return (
    <div style={{width:"400px",border:"2px solid blue", margin:"auto",padding:"10px"}}>
      <h2>This is LoginComp</h2>
      <form>
        <label>Enter User Id:</label>
        <input type="text" name="uid" ref={uid} placeholder="enter user id" className='form-control'/><br/>
        <label>Enter User Password:</label>
        <input type="text" name="upass" ref={upass} placeholder="enter user password" className='form-control'/><br/>
        <button type="button" className='btn btn-primary'>Login</button>
      </form>
    </div>
  )
}

export default LoginCompo