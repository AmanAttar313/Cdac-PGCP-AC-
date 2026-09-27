#include<iostream>
#include<string>
using namespace std;

class Employee{
	private:
		string name;
		int id;
		float salary;
		
	
		
		public:
			void setDetails(string name,int id,int salary){
				this->name=name;
				this->id=id;
				this->salary=salary;
			}
			
			
			void updateSalary(float newsalary) {
				salary=newsalary;
			}
		
			void displayDetails(){
				cout<<"id : "<<id<<endl;
				cout<<"name : "<<name<<endl;
				cout<<"salary : "<<salary<<endl;
				
					
			}
};

int main(){
	
    Employee e;
    e.setDetails("aman",12,10000);
    e.displayDetails();
    e.updateSalary(12000);
    
    cout<<"\n\nAfter Updated Salary :";
    e.displayDetails();
    
		 
	

	
}