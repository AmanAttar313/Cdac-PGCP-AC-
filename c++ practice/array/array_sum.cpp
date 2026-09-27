#include<iostream>
using namespace std;
int main(){
	int size;
	cout<<"Enter size of array : ";
	cin>>size;
	
	int arr[size];
	int sum=0;
	int avg=0;
	
	cout<<"Enter Element into array : "<<endl;
	for(int i=0;i<size;i++){
		cin>>arr[i];
	}
	for(int i=0;i<size;i++){
		cout<<arr[i]<<" ";
		sum+=arr[i];
		avg=sum/arr[i];
		
		cout<<endl;
		
	}
	cout<<endl;
	cout<<"\nSum is :  "<<sum;
	cout<<"\nAvg is :  "<<avg;
	cout
	
		
	 
}