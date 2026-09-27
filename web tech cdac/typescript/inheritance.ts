class students {
    // data member
    stdId:number=101;
    sname:string="Aman";
    scontact:number=12563;
    protected pin:number=12563;

    private pass:number=12563;


    constructor(_id:number,_stdId:string,_contact:number){
        
     
        this.stdId=_id;
        this.scontact=_contact;
           this.sname=_stdId;

    }
    // member function
    studentdetails(){
        return `Id: ${this.stdId} name: ${this.sname} contact: ${this.scontact}`;
    }

};
export class result extends students 
{
    phy:number=0;
    chem:number=0;
    maths:number=0;

    constructor(_id:number,_name:string,_contact:number,_phy:number,_chem:number,_maths:number){
        super(_id,_name,_contact);
        this.phy=_phy;
        this.maths=_maths;
        this.chem=_chem;
    }

    total(){
        return this.phy+this.chem+this.maths;
    }
    studentdetails(){
        return `Id ${this.stdId} name: ${this.sname}  contact: ${this.scontact} physics: ${this.phy} chem: ${this.chem} maths: ${this.maths}`
    }

};
let resultObj=new result(112,"aman",222,11,12,13);

console.log(resultObj.studentdetails());
console.log(resultObj.total());
