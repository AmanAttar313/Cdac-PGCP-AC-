import React, { useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { fetchData } from '../redux/ApiSlice';

const UserListCompo = () => {
    const dispatch=useDispatch();
    const data =useSelector((state)=>state.api.data)
    const status =useSelector((state)=>state.api.status)
    const error =useSelector((state)=>state.api.error)
    useEffect(()=>{
        if(status==='idle'){
            dispatch(fetchData())
        }
    },[status,dispatch])

    let content=[];

    if(status==="loading"){
        content=<div>Loading</div>
    }
    else if(status==="succeded"){
        content=data;
    }
    else if(status==="failed"){
        content=<div>{error}</div>
    }
  return (
    <div>
        <h2>UserListCompo</h2>
        <table className='table table-bordered'>
            <thead>
                    <tr>
                        <th>id</th><th>name</th><th>price</th><th>sal</th>
                    </tr>
            </thead>
            <tbody>
                    {
                        content.length > 0 && content.map((val,index)=>{
                            return <tr key={index}>
                                <td>{val.id}</td>
                                <td>{val.name}</td>
                                <td>{val.sal}</td>
                                <td>{val.price}</td>
                            </tr>
                        })
                    }
            </tbody>
        </table>
    </div>
  )
}

export default UserListCompo