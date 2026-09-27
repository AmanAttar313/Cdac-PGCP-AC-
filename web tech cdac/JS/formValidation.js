function check() {
    let checkName = document.myform.fname.value;
    let regname = "^[a-zA-Z ]{2,20}$";
    let email = document.myform.mail.value;
    let regmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$";

    let uedu = document.myform.edu;
    let ucourse=document.myform.course.value;

    if (checkName == "") {
        window.alert("Full Name is required");
        document.myform.fname.focus();
        return false;
    }
    if (!checkName.match(regname)) {
        window.alert("Full Name must be min 2 and max 20 character and not digit required");
        document.myform.fname.focus();
        return false;
    }
    if (email == "") {
        window.alert("Email is required");
        document.myform.mail.focus();
        return false;
    }
    if (!email.match(regmail)) {
        window.alert("Invalid Email");
        document.myform.mail.focus();
        return false;
    }

    if (uedu[0].checked==false && uedu[1].checked==false && uedu[2].checked==false && uedu[3].checked==false) {
       window.alert("Select Qualification");
        return false;
    }
    if(ucourse==""){
        window.alert("Course is required")
        document.myform.course.focus();
        return false;
    }

}