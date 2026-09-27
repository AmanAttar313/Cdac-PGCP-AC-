#include<iostream>
//A user has been provided with an array of five elements. Accept from the user a number of types `rotation` and perform a clockwise rotation in the given array,
// printing every pass, every rotation in the process.  
using namespace std;
int main()
{
	int a[]={11,22,33,44,55};
	int size=sizeof(a)/sizeof(a[0]);
	cout<<"\nArray length is:"<<size;
	int rotations;
	cout<<"\nEnter the number of times rotation is needed: ";
	cin>>rotations;
	
	
	for(int i=0;i<rotations;i++){
		int temp=a[0];
		for(int j=0;j<size;j++){
		a[i-1]=a[j];
		}
		a[size-1]=temp;
		
	cout<<"\n After rotation : "<<a[i];
		//print
	for(int index=0;index<size;index++)
	{
	cout<<"\na["<<index<<"]:"<<a[index];
	
	}	
	}

	
	return 0;
}


