import React from 'react'
import Title from './Title'
import Crousel from './Crousel'
import Images from './Images'

const Home = () => {
  return (
    <div className='container'>
        <div><Title/></div>

        <div> <nav/> </div>

        <div><Crousel/></div>
        <div> <Images/> </div>
        

    </div>
  )
}

export default Home