import React, { useState } from 'react'

const MyFormCompo = () => {
    const[user,setUser]=useState({
        uname:"",
        upass:"",
        term:""
    })
    const inputChangeHandle=(event)=>{
        const {type,name,value,checked}=event.target;
        setUser({...user,[name]:type=="checkbox"?checked:value});
    }
    const checkData=(event)=>{
        event.preventDefault();
        if(user.uname===""){
            window.alert("User name is required");
            return false;
        }
        if(!user.uname.match("^[a-zA-Z]{3,20}$")){
            window.alert("user name must contain char min-3 max-20")
            return false;
        }
        if(user.upass===""){
            window.alert("password is requied")
            return false;
        }
        if(!user.term){
            window.alert("pls accept term and condition")
            return false;
        }
        window.alert(JSON.stringify(user));
    }


  return (
    <div>
        <h2>my foerm compo</h2>
        <form onSubmit={checkData}>
            <label className='form-label'>Enter User name</label>
            <input type='text' name="uname" onChange={inputChangeHandle} value={user.uname}/>
             <label className='form-label'>Enter password</label>
            <input type='password' name="upass" onChange={inputChangeHandle} value={user.upass}/>
            <label className='form-label'>
                <input type='checkbox' name="term" onChange={inputChangeHandle} />I agree terms condition
            </label><br/><br/>
            <button type='submit'>submit</button>
        </form >
    </div>
  )
}

export default MyFormCompo