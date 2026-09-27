#include<iostream>
#include<string>
using namespace std;

class Employee{
	private:
		string name;
		int id;
		float salary;
		float HRA;
		float DA;
		float gross_sal;
		
		public:
			void setDetails(string name,int id,int salary){
				this->name=name;
				this->id=id;
				this->salary=salary;
			}
			
			
			void calculate() {
				HRA=salary*20/100;
		
				DA=salary*10/100;
		
				gross_sal=salary+DA+HRA;
			}
		
			void displayDetails(){
				cout<<"id : "<<id<<endl;
				cout<<"name : "<<name<<endl;
				cout<<"salary : "<<salary<<endl;
				cout<<"HRA : "<<HRA<<endl;
				cout<<"HRA : "<<DA<<endl;
				cout<<"gross salary : "<<gross_sal<<endl;	
			}
};

int main(){
	
    Employee e;
    e.setDetails("aman",12,10000);
    e.calculate();
    e.displayDetails();
		 
	

	
}