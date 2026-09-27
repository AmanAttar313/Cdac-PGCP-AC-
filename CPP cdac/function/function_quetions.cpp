#include<iostream>
using namespace std;

//without modifying fucntion find min of 4 and print it
   //assume no duplicates
int min(int no1,int no2)
{
	if(no1<no2)
		return no1;
	else
		return no2;
}

int main()
{
   int no1,no2,no3,no4;
   cout<<"enter four numbers";
   cin>>no1>>no2>>no3>>no4;
   cout<<min(min(no1,no2),min(no3,no4));
  
   
   return 0;
}
