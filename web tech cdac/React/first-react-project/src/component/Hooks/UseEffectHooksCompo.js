import React, { useEffect, useState } from 'react'

const UseEffectHooksCompo = () => {
    const [age,setAge]=useState(18);
    const[sal,setSal]=useState(1000);
    
    //case1: no dependacy value
    // useEffect(()=>{
    //     setAge(age+1)
    // })

    // //case:2 when dependacy value pass as blank array

    // useEffect(()=>{
    //     setAge(age+1)
    // },[])

    //// case 3: when dependancy value pass as state or props
    useEffect(()=>{
        setAge(age+1)
    },[sal])
    
  return (

    <div>
        <h2>UseEffect Hook</h2>
        <strong>age:{age}</strong>
        <strong>Salary:{sal}</strong>
        <button type='button' onClick={()=>{setSal(sal+100)}}>Increament</button>


    </div>
  )
}

export default UseEffectHooksCompo