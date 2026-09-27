
#include<iostream>
using namespace std;

void area_circle(int radius){
	int area=radius*radius*3.14;
	cout<<"area is "<<area;
}
float area_circle(float radius){
	float area=radius*radius*3.14;
	cout<<"area is "<<area;
}
int main(){
	cout<<"enter radius";
	float r;
	cin>>r;
	area_circle(r);
	cout<<area_circle(r);
}
