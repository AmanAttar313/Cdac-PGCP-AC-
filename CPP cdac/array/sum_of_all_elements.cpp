#include<iostream>
using namespace std;
int main(){
	int n;
	
	cout<<"enter size of array : "<<endl;
	cin>>n;
	int arr[n];
	int sum=0;
	cout<<"enter element of array : "<<endl;
	for(int i=0;i<n;i++){
		cin>>arr[i];
		sum+=arr[i];
	}
	int max=arr[0];
	int min=arr[n];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		cout<<arr[i];
	}
	
	cout<<"Sum of array is : "<<sum;
	
}
