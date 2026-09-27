#include<iostream>
using namespace std;
int main(){
	int number;
	
	cout<<"Enter number : ";
	cin>>number;
	int  number_copy=number;
	int reverse=0;
	
	while (number_copy>0){
		int digit=number_copy%10;
		reverse=reverse*10+digit;
		number_copy/=10;
	}
	if(reverse==number){
		cout<<number<<" is palindrome";
	}
	else{
			cout<<number<<" is not palindrome";
	}
	
	 
}