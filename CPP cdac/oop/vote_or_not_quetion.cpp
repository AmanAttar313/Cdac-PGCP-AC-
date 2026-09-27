#include<iostream>
using namespace std;
class Detail{
	private:
	
		string name,gender;
		int age;
		
		
		public:
			void set_detail(string n,string g,int a){
			name=n;
			gender=g;
			age=a;
		
			}
			void display_detail(){
				cout<<"name is : "<<name<<endl;
				cout<<"gender is : "<<gender<<endl;
				cout<<"age is : "<<age<<endl;
			}
			void eligible_vote(){
				if(age>=18){
					cout<<"Congratulations Your age eligible to vote"<<endl;
				}
				else{
					cout<<"Sorry Your age is not eligible to vote"<<endl;
				}
			}
};
int main(){
	Detail d;
	
	d.set_detail("aman","male",18);
	d.display_detail();
	d.eligible_vote();
	
}