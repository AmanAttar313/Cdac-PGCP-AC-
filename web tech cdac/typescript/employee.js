"use strict";
class employee {
    empId;
    ename;
    empPost;
    empSal;
    constructor(empId, ename, empPost, empSal) {
        this.empId = empId;
        this.ename = ename;
        this.empPost = empPost;
        this.empSal = empSal;
    }
    set _setId(_id) {
        this.empId = _id;
    }
    get _getId() {
        return this.empId;
    }
    set _setEname(_ename) {
        this.ename = _ename;
    }
    get _getEname() {
        return this.ename;
    }
    set _setPost(_Post) {
        this.empPost = _Post;
    }
    get _gePost() {
        return this.empPost;
    }
    set _setSal(_sal) {
        this.empSal = _sal;
    }
    get _getSal() {
        return this.empSal;
    }
    empDetails() {
        return `Id: ${this.empId} name: ${this.ename} post: ${this.empPost} salary: ${this.empSal}`;
    }
}
let e1 = new employee(1, "Aman", "developer", 12000);
let e2 = new employee(2, "Aqsa", "CEO", 160000);
let e3 = new employee(3, "humaira", "Founder", 150000);
console.log(e1.empDetails());
console.log(e2.empDetails());
console.log(e3.empDetails());
e1._setId = 101;
e1._setEname = "aman";
e1._setPost = "jr manager";
e1._setSal = 101;
console.log(e1._getId);
console.log(e1._getEname);
console.log(e1._gePost);
console.log(e1._getSal);
