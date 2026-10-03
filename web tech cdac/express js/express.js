const express =require('express')
// const fs =require('fs')
const app =express();

const path=require('path')
const publicPath=path.join(__dirname,"/public")
console.log(publicPath)

app.use(express.static(publicPath));

// app.get("/",(req,res,next)=>{
//     // res.send("simple get request")
//     res.sendFile(__dirname+'/')
// });


app.get("/",(req,res,next)=>{
    // res.send("Home is here")
    res.sendFile(__dirname+"/home.html")


});
app.get("/gallery",(req,res,next)=>{
    res.send("gallery is here")
});
app.get("/about",(req,res,next)=>{
    res.send("about is here")
});
app.get("/service",(req,res,next)=>{
    res.send("service is here")
});


app.listen(5050,()=>{
    console.log("server started..")
})