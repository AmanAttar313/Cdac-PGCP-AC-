#include<iostream>
//1,2,3...,10
using namespace std;
int main()
{		int num;
	cout<<"Enter number : ";
	cin>>num;
	for (int i=1;i<=10;i++)
	{
		cout<<i*num<<",";
	}	
	return 0;
}
