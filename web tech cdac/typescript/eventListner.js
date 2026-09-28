let myButton = document.getElementById("btn1");

myButton.addEventListener("click", () => {

    let inputTxt = document.getElementById("txt1");

    console.log(inputTxt.value);

    inputTxt.addEventListener("focus", () => {
        console.log("Input focused");
    });

});