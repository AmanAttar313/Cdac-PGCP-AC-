package Oops2;

public class Human {
	private String name,gender,acn;
       
    public void set_Human(String name,String gender,String acn)
    {
        this.name=name;
        this.gender=gender;
        this.acn=acn;
    }
    public void display_Human()
    {
        System.out.print("Adhar Card number"+acn+"\tName : "+name+"\tGender:"+gender);
    }
    public String get_adhar()
    {
        return acn;
    }

}
