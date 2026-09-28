"use strict";
function getData() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Data departed");
        }, 2000);
    });
}
// getData().then((val) => {
//     console.log(val);
// }).catch((error) => {
//     console.log(error);
// })
async function displayresult() {
    try {
        let result = await getData();
        console.log(result);
    }
    catch (error) {
        console.log(error);
    }
}
displayresult();
