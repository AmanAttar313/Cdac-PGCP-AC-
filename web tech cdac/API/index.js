require('dotenv').config();

const express=require('express');
const app= express();

const port= process.env.PORT;
const host= process.env.HOST;

app.get('/',(req,res,next)=>{
    res.send("simple get request");

});

// naming routing
app.get('/user',(req,res,next)=>{
    res.send("simple get request for user");

});
// parameter routing
app.get('/user/:id',(req,res,next)=>{
    res.send(`simple get request for user for single Id: ${req.params.id}`);

});

// delete request
app.delete('/user',(req,res,next)=>{
    res.send("simple delete request for user");

});

// post request
app.post('/user',(req,res,next)=>{
    res.send("simple post request for user");

});

// put request
app.put('/user',(req,res,next)=>{
    res.send("simple post request for user");

});

app.listen(port,()=>{
    console.log(`server is started on ${host}:${port}`);

});