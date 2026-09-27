#include<iostream>

using namespace std;
int main()
{
	int number,digit;
	cout<<"Enter a number:";
	cin>>number;
	int temp=0;
	while(number>0)
	{
		digit=number%10;
        temp=temp*10+digit;
		number=number/10;
		
		
	
	}
	cout<<temp;
	return 0;
}


