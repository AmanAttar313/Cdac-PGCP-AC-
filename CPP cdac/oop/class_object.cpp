#include<iostream>
using namespace std;
class Student{
	private:
	
		float area,radius;
		
		public:
			void set_area(float r){
				radius=r;
			}
			void display_area(){
				area=3.14*radius*radius;
				cout<<area;
			}
};
int main(){
	Student s;
	s.set_area(1.2);
	s.display_area();
	
}