#include<iostream>
//Take a number from the user. Print each digit separately. 
//Output is individual digits printed. 
//Process % to extract the last digit and / to remove the last digit. 
//Input is: read the number from the user. 
using namespace std;
int main()
{
	int number,digit;
	cout<<"Enter a number:";
	cin>>number;
	while(number>0)
	{
		digit=number%10;
		number=number+digit;

		cout<<"\nNumber left:"<<number<<"\tDigit:"<<digit;
	}
	return 0;
}
