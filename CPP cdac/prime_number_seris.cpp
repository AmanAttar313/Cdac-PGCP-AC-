#include<iostream>
//Write a program Check whether a given number is Prime or not.
using namespace std;
int main()
{

	bool flag=true;//Think positively that it is a prime number. 
	int i;
	
			for( i=1;i<=50;i++)
	{
		for(int j=2;j<i;j++){
		    
	
		if(i%j==0)
			{
			  flag=false;
			  break;
			}
	}
    if(flag==true)
	cout<<endl<<i<<"is prime";
    
	

	return 0;
}



