#include<iostream>
using namespace std;
int main(){
	int no,fact=1;
	cout<<"enter number : ";
	cin>>no;
	

	for(int i=1;i<=no;i++){
		fact=fact*i;
	}
	cout<<"Factorial of "<<no<<" is "<<fact;

	
	
}