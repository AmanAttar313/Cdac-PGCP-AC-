import { createSlice,createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";

const API_URL="http://localhost:2000/user";

export const fetchData=createAsyncThunk("api/fetchdata",()=>{
    const resposnse=axios.get(API_URL);
    return resposnse.data;

})
const apiSlice=createSlice({
    name:"api",
    initialState:{
        data:[],
        status:"idle",// idle,successded,failed
        error:null 
    },
    reducers:{},
    extraReducers:(builder)=>{
        builder.addCase(fetchData.pending,(state)=>{
            state.status="loading";
        })
        builder.addCase(fetchData.fulfilled,(state,action)=>{
            state.status="succeded";
            state.data=action.payload;
        })
        builder.addCase(fetchData.rejected,(state,action)=>{
            state.status="failed";
                state.error=action.error.message;
        })  
    }
})
export default apiSlice.reducer;
