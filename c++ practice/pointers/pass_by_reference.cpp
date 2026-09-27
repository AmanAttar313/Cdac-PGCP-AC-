#include<iostream>
using namespace std;
	void changeA(int a){ // Pass By Value
		a=20;
	}
		void changeA1(int* ptr){ // Pass By reference using pointer
		*ptr=20;
	}
		void changeA2(int &b){ // Pass By reference using alias
		b=20;
	}
int main(){
	int a=10;
//	changeA(a);
//	changeA1(&a); // main function ke a ki value change kar di hai using pointer 
	changeA2(a);
	
	
	cout<<"inside main function: "<<a<<endl;
	
	
}