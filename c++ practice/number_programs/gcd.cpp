#include<iostream>
using namespace std;
int main(){
	int num1,num2;
	cout<<"enter starting number : "<<endl;
	cin>>num1;
	cout<<"Enter end number : "<<endl;
	cin>>num2;
	
	while(num2>0){
		int remainder = num1%num2;
		num1=num2;
		num2=remainder;
	}
	cout<<num1<<" is GCD";

	
	
	
	 
}