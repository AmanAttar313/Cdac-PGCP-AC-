import React from 'react'
import { Outlet } from 'react-router-dom'
import NavCompo from '../layout/NavCompo'
import FooterCompo from '../layout/FooterCompo'

const DashboardCompo = () => {
  return (
    <div className='container'>
        <div className='card border-primary' >
            <div className='card-header'>
                <NavCompo/>
            </div>
            <div className='card-body'>
                <Outlet/>
            </div>
            <div className='card-footer'>
                <FooterCompo/>
            </div>

        </div>
        
    </div>
  )
}

export default DashboardCompo;