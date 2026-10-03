import React from 'react'
import { createBrowserRouter } from 'react-router-dom'
import MyListCompo from '../component/MyListCompo'
import MyCrouselCompo from '../component/MyCrouselCompo';
import UseStateHookCompo from '../component/Hooks/UseStateHookCompo';
import UseEffectHooksCompo from '../component/Hooks/UseEffectHooksCompo';
import DashboardCompo from '../layout/DashboardCompo'
import PageNotFound from '../layout/PageNotFound'
import ProductUpdateCompo from '../CRUD Folder/ProductUpdateCompo';
import ProductDashCompo from '../CRUD Folder/ProductDashCompo';
import ProductAddCompo from '../CRUD Folder/ProductAddCompo';
import UserListCompo from '../component/UserListCompo';
const router=createBrowserRouter([
    {
        path:"dashboard",element:<DashboardCompo/>,
        children:[
            // // default routing
     {path:"",element:<MyCrouselCompo/>},

     // // naming routing
    {path:"list",element:<MyListCompo/>},

    /// // parameterize routing
    {path:"list/:id",element:<MyListCompo/>},
    
    // children routing
    {path:"hooks",element:<UseStateHookCompo/>,
        children:[
            {path:"useEffect",element:<UseEffectHooksCompo/>}
        ]
        
    },
    {path:"list/:id",element:<MyListCompo/>},
    {path:"productAdd", element:<ProductAddCompo/>},
    {path:"productDash", element:<ProductDashCompo/>},
    {path:"productUpdate/:id", element:<ProductUpdateCompo/>},
    {path:"UserListCompo",element:<UserListCompo/>}
        ]
        
    },
  // // wild card routing
    {path:"*",element:<PageNotFound/>}

])
export default router;
