import React from 'react'
import logo from '../assets/logo.png'

const Title = () => {
  return (
    <div style={{display: "flex",flexDirection: "column",alignItems: "center"}}>
      <img src={logo} alt="logo" style={{ width: "100px" }} />

      <h2
        style={{
          fontFamily: "Oleo Script",
          color: "#fff700f5",
          fontSize: "58px"
        }}
      >
        Aman Cafe
      </h2>
    </div>
  )
}

export default Title