import { createBrowserRouter } from "react-router-dom";
import Home from "../components/Home";
import Crousel from "../components/Crousel";

const router=createBrowserRouter([
    {
        path:"dashboard",element:<Home/>,
        children:[
            {path:"crousel",element:<Crousel/>}
        ]
    }
])

export default router;