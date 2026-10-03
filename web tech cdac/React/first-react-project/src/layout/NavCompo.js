import React from 'react'
import { Link } from 'react-router-dom'

const NavCompo = () => {
  return (
    <div>
        <Link to="" className='btn btn-primary btn-sm'>Crousel</Link>
        {""}
        <Link to="list" className='btn btn-primary btn-sm'>Crousel</Link>
            {""}
        <Link to="hooks" className='btn btn-primary btn-sm'>Hooks</Link>
            {""}
        <Link to="mycrousel" className='btn btn-primary btn-sm'>Crousel</Link>
        {""}
        {/* ============================== */}
        <Link to="productAdd" className='btn btn-primary btn-sm'>productAdd</Link>{""}
        <Link to="productDash" className='btn btn-primary btn-sm'>productDash</Link>{""}
        <Link to="productUpdate" className='btn btn-primary btn-sm'>productUpdate</Link>
        <Link to="UserListCompo" className='btn btn-primary btn-sm' >User List</Link>

        


    </div>
  )
}

export default NavCompo