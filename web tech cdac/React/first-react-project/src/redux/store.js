import { configureStore } from "@reduxjs/toolkit";
import apiReducer from './ApiSlice'

const store=configureStore({
    reducer:{
        api:apiReducer
    }
})
export default store