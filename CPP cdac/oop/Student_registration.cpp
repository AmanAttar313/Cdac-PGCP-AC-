#include <iostream>
using namespace std;

class Student
{
private:
	static int count;
	int roll_no;
	string name,gender;
public:
	//Create a `register_student` method 
	//which will accept name and gender from the user 
	//print on screen: "Student successfully registered with a roll number auto-generated." 
    void register_student(string name,string gender)
    {
        count++;
        this->name=name;
        this->gender=gender;
        this->roll_no=count;
        cout<<"\nSuccessfully registered. Remember your roll number is "<<roll_no;
    }
	void display_student()
		{
			cout<<"\nRollno:"<<roll_no<<"\tName:"<<name<<"\tGender:"<<gender;
		}
//get_count():Will return total number of students created so far 
 static int get_count()
    {
		return(count);
    }
//get_roll():Return private data, that is, roll number, to outside the main method. 
 int get_roll()
    {
		return(roll_no);
    }
};


int Student::count;

int main()
{
    Student s[100];
    for (int i=0;i<3;i++)
    	{
    		cout<<"\nYour name:";
    		string name;
    		getline(cin,name);
    		cout<<"\nYour gender:";
    		string gender;
    		cin>>gender;
    		cin.ignore();
    		s[i].register_student(name,gender);
		}
	 cout<<"\nTotal Students Registered till now:"<<Student::get_count();
     cout<<"\nList is:\n";
	 for (int i=0;i<3;i++)
    	{
    	 s[i].display_student();
		}
		
		
		cout<<"/nEnter number to search";
		int r_number;
		cin>>r_number;
		bool found=false;
		for(int i=0;i<Student::get_count();i++){
			if(r_number==s[i].get_roll()){
				found=true;
				break;
			}
		}
		if(found==true){
			cout<<"\nRoll Number found";
		}else{
			cout<<"\nRoll Number Not found";	
		}
    
    return 0;
}
