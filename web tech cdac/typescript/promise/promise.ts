// calling promise inside function
const myfunction=(val:any)=>{
    console.log(`result is ${val}`)
}
const myPromise=new Promise(()=>{
    let succes=true;
    if(succes){
        console.log("Promise work")
    }else{
        console.log("not success")
    }
})

myPromise.then((val)=>{
    myfunction(val)
}).catch((err)=>{
    myfunction(err);
})


