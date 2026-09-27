class students {
    // data member
    stdId:number=101;
    sname:string="Aman";
    scontact:number=12563;

    constructor(_id:number,stdId:string,_contact:number){
        
     
        this.stdId=_id;
        this.scontact=_contact;
           this.sname=stdId;

    }
    // member function
    studentdetails(){
        return `Id: ${this.stdId} name: ${this.sname} contact: ${this.scontact}`;
    }

}


let obj=new students(12,"Aman",12);
let obj2=new students(13,"don",255);

let obj3=new students(14,"babu",12222);


console.log(obj.sname);
console.log(obj.studentdetails());
