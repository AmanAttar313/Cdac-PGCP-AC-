#include<iostream>
//Take a number from the user. Print each digit separately. 
//Output is individual digits printed. 
//Process % to extract the last digit and / to remove the last digit. 
//Input is: read the number from the user. 
using namespace std;
int main()
{
	int number,digit,sum=0;
	cout<<"Enter a number:";
	cin>>number;
	while(number>0)
	{   
       

		digit=number%10;
        digit=number/10;
		 sum+=digit;

		
	}
    cout<<"\nNumber left:"<<number<<"\tDigit:"<<digit<<"\tsum";
	return 0;
}
