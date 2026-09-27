#include<iostream>
#include<string>
using namespace std;

class Student{
	private:
		string name;
		int roll;
		int age;
		
		public:
			void setDetails(string name,int roll,int age){
				this->name=name;
				this->roll=roll;
				this->age=age;
			}
			void displayDetails(){
				cout<<"age : "<<age<<endl;
				cout<<"roll : "<<roll<<endl;
				cout<<"name : "<<name;		
			}
};

int main(){
	
    Student s;
    s.setDetails("aman",12,23);
    s.displayDetails();
		 
	

	
}