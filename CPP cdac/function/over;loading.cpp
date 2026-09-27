#include<iostream>
using namespace std;
void area(float r){

	float area=r*r*3.14;
		cout<<area<<" is area of circle"<<endl;
	
}
void area(int breadth,int length){

	int area=length*breadth;
	cout<<area<<" is area of circle";
}
int main(){
	area(3);
	area(3,2);
}