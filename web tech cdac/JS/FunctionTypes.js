// default function
function name(){
    console.log("aman");
}
name();

// Parametrized function

function fullName(fname,mname,lname){
    return "hello"+fname+mname+lname;
}
fullName("aman","sikandar","attar");


// Anonymous function

let add =function (num1,num2){
    return num1+num2;
}
console.log(add(1,3));

// Arrow Function
let multiply=(num1,num2)=>{
 console.log(num1*num2);
}
multiply(2,3);

// short cut arrow function
let sub=(num1,num2)=>num1-num2;
console.log(sub(8,4));

//  rest function with (... )spread operator,Store data in array format
let students=(...std)=>{
    return std;
}
console.log(students("Aman","Humaira"));

// optinal parametrized

let names=(fname,lname="",contact="123")=>{
    return fname+lname+contact;
}
console.log(names("aman"));