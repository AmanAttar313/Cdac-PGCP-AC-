import Iperson from "./interface.js";
// interface created in interface file and then import in person.ts file
class result implements Iperson {
    pid: number;
    pname: string;
    pcontact: number;

    constructor(_pid:number,_pname:string,_pcontact:number){
        this.pid=_pid;
        this.pname=_pname;
        this.pcontact=_pcontact;
    }
    displayDetails(){
        return `id: ${this.pid} name: ${this.pname} contact: ${this.pcontact}`
    }
}
let obj1 =new result(1,"aman",1253);
let obj2 =new result(1,"aman",1253);
let obj3 =new result(1,"aman",1253);

console.log(obj1.displayDetails());
console.log(obj2.displayDetails());
console.log(obj3.displayDetails());