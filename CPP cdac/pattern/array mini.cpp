#include<iostream>
using namespace std;

int main() {
	int arr[] = {201,10,20,30,100,1,200,0};
	int min = arr[0];
	int max= arr[0];
	int sum=0;
	int avg=0;
	int secondmax=0;
	
	int length= sizeof(arr)/sizeof(arr[0]);
	
	for(int i=0; i<length;i++)
	{
		sum= sum+ arr[i];
		avg= sum/length;
		
		if(arr[i]<min){
			min= arr[i];

		}
		else if (arr[i]>max) {
			secondmax= max;
			max= arr[i];
		
		}
	
		
		if(secondmax<arr[i] && arr[i]!=max) {
			secondmax= arr[i];
		}
	}
	cout<<"secondmax is "<<secondmax<<endl;
	cout<<"sum is "<<sum<<endl;
	cout<<"avg is "<<avg<<endl;
	cout<<"min is "<<min<<endl;
	cout<<"max is "<<max;
return 0;	
}