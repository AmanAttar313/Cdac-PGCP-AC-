#include<iostream>
using namespace std;
int main(){
	int a=10;
	int* ptr1=&a;
	
	int** ptr2= &ptr1;
	
	cout<<&a<<"<----a address"<<endl;
	cout<<ptr1<<"<----Pointer 1"<<endl;
	
	cout<<&ptr1<<"<----pointer 1 adreess"<<endl;
	cout<<&ptr2<<"<----pointer 2 adreess"<<endl;
	cout<<ptr2<<"<----pointer 2"<<endl;
	
}