import React from 'react'

const UserCompo = (props) => {
    if(props.userName==="Aman"){
        throw Error("Not user")
    }

    return (
    <div>
        <h2>this is {props.userName}</h2>
    </div>
  )
}

export default UserCompo