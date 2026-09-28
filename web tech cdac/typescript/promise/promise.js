"use strict";
const myPromise = new Promise(() => {
    let succes = true;
    if (succes) {
        console.log("Promise work");
    }
    else {
        console.log("not success");
    }
});
myPromise.then((val) => {
    console.log(val);
}).catch((err) => {
    console.log(err);
});
const myfunction = () => {
    myPromise.then((val) => {
        console.log(val);
    }).catch((err) => {
        console.log(err);
    });
};
myfunction();
