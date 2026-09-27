class students {
    // data member
    stdId = 101;
    sname = "Aman";
    scontact = 12563;
    constructor(_id, _stdId, _contact) {
        this.stdId = _id;
        this.scontact = _contact;
        this.sname = _stdId;
    }
    // member function
    studentdetails() {
        return `Id: ${this.stdId} name: ${this.sname} contact: ${this.scontact}`;
    }
}
;
export class result extends students {
    phy = 0;
    chem = 0;
    maths = 0;
    constructor(_id, _name, _contact, _phy, _chem, _maths) {
        super(_id, _name, _contact);
        this.phy = _phy;
        this.maths = _maths;
        this.chem = _chem;
    }
    total() {
        return this.phy + this.chem + this.maths;
    }
    studentdetails() {
        return `Id ${this.stdId} name: ${this.sname}  contact: ${this.scontact} physics: ${this.phy} chem: ${this.chem} maths: ${this.maths}`;
    }
}
;
let resultObj = new result(112, "aman", 222, 11, 12, 13);
console.log(resultObj.studentdetails());
console.log(resultObj.total());
