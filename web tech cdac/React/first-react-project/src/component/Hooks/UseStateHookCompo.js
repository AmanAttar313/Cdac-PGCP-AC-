import React, { useState } from 'react'
import imgpath from '../../shared/constant/constant';
import { Outlet } from 'react-router-dom';

const UseStateHookCompo = () => {
    
    const [myName, setMyName] = useState("AMAN");
    const [count, setCount] = useState(0);
    const [item, setItem] = useState(["mango", "banana", "graphes"]);

    const [menu, setMenu] = useState([
        { id: 1, Name: "chicken", price: 1020 },
        { id: 2, Name: "panner",  price: 6020 },
        { id: 3, Name: "dosa", price: 5020 },
        { id: 4, Name: "idli", price: 4020 },

    ]);
    const [menu1, setMenu1] = useState([
        { id: 1, Name: "chicken", img: imgpath.breadGulab, price: 1020 },
        { id: 2, Name: "panner", img: imgpath.chocolategulabjamun, price: 6020 },
        { id: 3, Name: "dosa", img: imgpath.classicgulabjamun, price: 5020 },
        { id: 4, Name: "idli", img: imgpath.rabdigulabjamun, price: 4020 },

    ]);

    return (
        <div>
            <h2>This is Use STATE HOOK</h2>
            <h3><strong>Name:{myName}</strong></h3>
            <button type='button' onClick={() => setMyName("AMAN ATTAR")}>Change Name</button>

            <h3><strong>Count:{count}</strong></h3>
            <button type='button' onClick={() => setCount(count + 1)}>Count Increment</button>
            {/* ================================================= */}
            {/* <ul>
       {
            menu.map((val,index)=>{
                return <li key={index}>{val.id}-{val.Name}-{val.price}</li>

            })
        }
        </ul> */}

            {/* ================================================= */}
            {/* <ul>
       {
            item.map((val,index)=>{
                return <li key={index}>{val}</li>

            })
        }
        </ul> */}
            {/* ================================================= */}


            {/* with short circuity */}
            {/* 
         <ul>
       {
            item.length>0 && map((val,index)=>{
                return <li key={index}>{val}</li>

            })
        }
        </ul> */}

            {
                menu.length > 0 && menu1.map((val, index) => {


                    <div className='card border-primary' key={index} style={{ width: "300px", height: "350px" }}>
                        <img src={val.img} alt={val.Name} style={{ width:"300px", height:"350px" }} />
                        <div className='card-body border-primary'>
                            <h3>Name:{val.Name} , Price:{val.price}</h3>
                        </div>

                    </div>
                })
            }



    <Outlet/>
        </div>
        
    )
}

export default UseStateHookCompo