function addition() {
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let result= parseInt(num1) + parseInt(num2)
    console.log(result);
    document.getElementById("result").append(result);
}

function multiply() {
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let result= parseInt(num1) * parseInt(num2)
    console.log(result);
    document.getElementById("result").append(result);
}
function subtract() {
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let result= parseInt(num1) - parseInt(num2)
    console.log(result);
    document.getElementById("result").append(result);
}
function divison() {
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;
    let result= parseInt(num1) / parseInt(num2)
    console.log(result);
    document.getElementById("result").append(result);
}