// async function getUserData(){
//     try{
//         let result=await fetch("https://jsonplaceholder.typicode.com/users");
//         let users=await result.json();
//         console.log(users);
//     }
//     catch(error)
//     {
//         error="failed to fetch";
//         console.log(error);
//     }
// }
// getUserData();

async function getUserData1(){
    try{
        let result=await fetch("http://localhost:4040/products");
        let users=await result.json();
        console.log(users);
    }
    catch(error)
    {
        error="failed to fetch";
        console.log(error);
    }
}
getUserData1();