
//Ambiguity resolution. 
#include <iostream>
using namespace std;

class Human{
	private :
		string name,gender;
		public:
			void set_s_details(string name,string gender){
				this->name=name;
				this->gender=gender;
			}
			void display_s_detail(){
				cout<<"\nName : ";
				cout<<"\nGender : ";
			}
};

class Student:Human{
	private : string degree;
	public:
		void set_degree(string degree){	
			this->degree=degree;
		}
		void display_degree(){
			
			cout<<"\nDegree : ";
		}
};
class Employee:Student{
	private : float salary;
	public :
			public:
		void set_sal(string name,string gender,string degree,float salary){
			set_s_details(name,gender);
			display_degree(degree);
			
			this->salary=salary;
			
			
		}
		void display_salary(){
			
			cout<<"\nsalary : ";
		}
		
};
int main()
{
   Employee e;
   e.set_s_details("Aman","Male");
   e.set_degree("BE Copm");
   e.set_sal(123355.122);
   
   e.display_s_detail();
   e.display_degree();
   e.display_salary();
   
   
   

    return 0;
}

2