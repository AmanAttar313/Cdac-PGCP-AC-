let fs=require('fs');
// read file using read stream
let myreadStream=fs.createReadStream(__dirname+'/writeFile1.txt',"utf8");

// write file using write stream
let myWriteStream=fs.createWriteStream(__dirname+'/writeFile2.txt');
myreadStream.on("data",function(chunk){
    console.log(chunk);
    myWriteStream.write(chunk);
});
