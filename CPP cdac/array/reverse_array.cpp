
#include<iostream>
//An array is given. Reverse the array without using another array. 
using namespace std;
int main()
{
	int n=5;
	
	int arr[n]={11,22,33,44,55};//Initialize all elements of the array to zero. 
	cout<<"\nArray consists of :\n";
	
	for(int index=0;index<=n;index++)
	{
		cout<<"\n at a["<<index<<"]: "<<arr[index];//Will print garbage values because initially there will be garbage. 
	}
	//reverse
		
	
	for(int i=1,j=n-1;i<j;i++,j--)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp; 
		cout<<arr[i];
	}
	cout<<"\nAfter Reversed Array consists of :\n";
	

	return 0;
}


