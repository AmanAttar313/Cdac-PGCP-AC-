#include<iostream>
using namespace std;
int main(){
	float salary;
	float bonus;
	cout<<"Enter Your Salary : ";
	cin>>salary;
	bonus=salary*0.1;
	salary +=bonus;
	cout<<"Final salary after adding the bonus : "<<salary ;  
}
