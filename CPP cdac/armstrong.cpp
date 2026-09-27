#include<iostream>
//Write a program Check whether a given number is Armstrong or not. 
//Given a three-digit number, an Armstrong number is a number where, 
//if the individual digits are cubed and added together, 
//the number itself will be regenerated. 
//153--->1^3+5^3+3^3-->153
//If sum = number then it is Armstrong. 
//We need to maintain a number. 
//Accept a number--->create a copy of it, 
//calculate the sum, and then compare with the original. 
using namespace std;
int main()
{
	int number,sum,digit;
	
	int cube=0;
	cout<<"Enter a number:";
	cin>>number;
	int temp=number;
	while(number>0)
	{
		digit=temp%10;
		number=temp/10;
		int cube=temp*temp*temp;
		sum=temp+digit;
	
	}
		if(sum==number){
			cout<<"number is armstrong";
		}else{
			cout<<"not armstrong";
		}

	return 0;
}



