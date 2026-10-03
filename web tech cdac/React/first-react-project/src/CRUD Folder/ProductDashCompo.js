import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import DeleteIcon from '@mui/icons-material/Delete';
import EditIcon from '@mui/icons-material/Edit';
import AddIcon from '@mui/icons-material/Add';

const ProductDashCompo = () => {
    const [products,setProducts]=useState([])
    useEffect(()=>{
        getData()
    },[])
    const getData=()=>{
        axios.get("http://localhost:2000/user").then((res)=>{
            console.log(res.data);
           setProducts(res.data);
            
        }).catch((error)=>{
            
        })
    }
    const deleteData=(id)=>{
        if(window.confirm(`are you sure to delete product id:${id}`)){
            axios.delete(`http://localhost:2000/user/${id}`).then((res)=>{
                window.alert("product deleted successfully")
                getData();
            })
        }
    }
  return (
    <div>
        <h2>ProductDashCompo</h2>
        <Link to={"/dashboard/productAdd"} className='btn btn-success mt-2 mb-2'>
        <AddIcon/>  
            </Link>
        <table className='table table-bordered table-hover'>
            <thead>
                <tr>
                    <th>sr.no</th><th>name</th><th>price</th>
                </tr>
            </thead>
            <tbody>
              {
                products.map((val,index)=>{
                    return <tr key={index}>
                        <td>{val.id}</td>
                        <td>{val.name}</td>
                        <td>{val.price}</td>
                        <td>
                            <button type='button' onClick={()=>{deleteData(val.id)}}>
                                <DeleteIcon/>
                            </button>
                            <Link to={`/dashboard/productUpdate/${val.id}`} className='btn btn-outline-success btn-sm '>
                            <EditIcon/>
                            </Link>
                        </td>
                    </tr>

                    
                })
              }
            </tbody>

        </table>
    </div>
  )
}

export default ProductDashCompo