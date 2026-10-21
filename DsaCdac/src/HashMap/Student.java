package HashMap;

public class Student {
private String name;
private int roll;
private char gender;
private float pointer;

public void setData(int roll,String name,char gender,float pointer){
	this.name=name;
	this.roll=roll;
	this.gender=gender;
	this.pointer=pointer;
}

public int getRoll() {
	return this.roll;
}
	public void DisplayData(){
		
		System.out.println("Roll No"+roll);
		System.out.println("name "+name);
		System.out.println("gender "+gender);
		System.out.println("pointer"+pointer);
	}
	public boolean Search(int key) {
		if(key==roll) {
			DisplayData();
			return true;
		}else {
			return false;
		}
	}
	public void Upadate(int newRoll,int key) {
		Search(key);
		
	}
}
