#include<iostream>
using namespace std;
class Calculator{
public:	

void add(int no1,int no2){
	int a=no1+no2;
	cout<<"Addition is : "<<a<<endl;
}
void sub(int no1,int no2){
		int a=no1-no2;
		cout<<"Subtraction is : "<<a<<endl;
}
void mul(int no1,int no2){
		int a=no1*no2;
		cout<<"Multiplication is : "<<a<<endl;
}
void divi(int no1,int no2){
		int a=no1/no2;
		cout<<"Division is : "<<a<<endl;
}
};
int main(){
	int n1,n2;
	cout<<"Enter Two Numbers : ";
	cin>>n1>>n2;
	Calculator c;
	c.add(n1,n2);
	c.sub(n1,n2);
	c.mul(n1,n2);
	c.divi(n1,n2);
	
	
}