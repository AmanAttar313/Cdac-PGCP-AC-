#include<iostream>
#include<string>
using namespace std;

class Student{
	private:
		string name;
		int id;
		int age;
		
	
		
		public:
			Student(string name,int id,int age){
				this->name=name;
				this->id=id;
				this->age=age;
			}
		
			void display(){
				cout<<"id : "<<id<<endl;
				cout<<"name : "<<name<<endl;
				cout<<"age : "<<age<<endl;			
			}
};

int main(){
	
    Student s("Aman", 101, 85);
    s.display();
    
    
		 
	

	
}