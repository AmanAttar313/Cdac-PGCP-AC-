const fs=require('fs');

////read write file synchronously 
// let writedata=fs.writeFileSync('./writeFile1.txt',"Go Corona Go");
// let readData=fs.readFileSync('./writeFile1.txt',"utf8");
// console.log(readData)
// fs.appendFileSync('./writeFile1.txt',"Go Ajinkya Go");

/// // read write file asynchronously

// let write=fs.writeFile('./writeFile2.text'," FIle write ",(err,result)=>{
//     console.log("Write file successfully");
    
// });
// let read=fs.readFile('./writeFile2.text',"utf8",(err,result)=>{
//     console.log("read file successfully"+result);
    
// });
// let readfile2=fs.readFile('./writeFile0.text',"utf8",(err,result)=>{
//     console.log("read file successfully"+result);
//     console.log(err.message)
   
// });
// let readfile3=fs.readFile('./writeFile2.text',"utf8",(err,result)=>{
//     console.log("read file successfully"+result);
//     fs.appendFile('./writeFile2.text',' new daata append',()=>{})
// });

// fs.unlink('./writeFile2.text',()=>{
//     console.log(" file deleted successfully");
   
// });

// // mkdir() : created new directory / folder
// fs.mkdir('./NewDir1',(err,res)=>{
//     console.log("new directory created");
// })
// new directory inside create file
// fs.mkdir('./NewDir2',(err,res)=>{
//     fs.writeFile('./NewDir2/newFile.text',"this is new file in new directory",(err,res)=>{
//         console.log("new file write/created successfullly")
//     })
// })


// fs.rmdir('./NewDir1',(err,res)=>{
//     console.log("directory deleted")
// })

// fs.rmdir('./NewDir1',(err,res)=>{
//     console.log("directory deleted")
// })

// fs.unlink('./NewDir2/newFile.text',()=>{
//     console.log(" file deleted successfully");
   
// });

// //  directory and file also deleted

fs.rmdir('./NewDir2', (err, res) => {

    fs.unlink('./NewDir2/newFile.text', (err, res) => {

        console.log("new file deleted successfully");

        fs.rmdir('./NewDir2', (err, res) => {

            if (err) {
                console.log("Directory delete error:", err.message);
                return;
            }

            console.log("Directory deleted successfully");

        });

    });

});

