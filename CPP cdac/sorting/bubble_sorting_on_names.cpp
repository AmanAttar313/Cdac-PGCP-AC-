#include <iostream>
#include <string>
//Take a line of string. Print the frequency of every alphabet. 
using namespace std;

int main()
{
    
    cout<<"Enter names";
    string a[10]; 
	for(int i=0;i<10;i++)   {
	cin>>a[10];
   }
    for(int i:a)
    	cout<<i<<", ";
    for(int i=0;i<sizeof(a)/sizeof(a[0]);i++)
    	{
    		for(int j=0;j<sizeof(a)/sizeof(a[0])-1;j++)
    		{
    			if(a[j]>a[j+1])
    			{
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
				}
			}
		}
	cout<<"\nSorted Array:";
    for(int i:a)
    	cout<<i<<", ";	
    
    
    return 0;
}
