// interface created in interface file and then import in person.ts file
class result {
    pid;
    pname;
    pcontact;
    constructor(_pid, _pname, _pcontact) {
        this.pid = _pid;
        this.pname = _pname;
        this.pcontact = _pcontact;
    }
    displayDetails() {
        return `id: ${this.pid} name: ${this.pname} ${this.pcontact}`;
    }
}
let obj1 = new result(1, "aman", 1253);
let obj2 = new result(1, "aman", 1253);
let obj3 = new result(1, "aman", 1253);
console.log(obj1.displayDetails());
console.log(obj2.displayDetails());
console.log(obj3.displayDetails());
export {};
