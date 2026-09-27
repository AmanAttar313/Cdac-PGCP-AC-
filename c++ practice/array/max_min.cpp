#include<iostream>
using namespace std;
int main(){
	int size;
	cout<<"Enter size of array : ";
	cin>>size;
	
	int arr[size];
	
	
	cout<<"Enter Element into array : "<<endl;
	for(int i=0;i<size;i++){
		cin>>arr[i];
	}
	int max=arr[0],min=arr[0];
	for(int i=0;i<size;i++){
		cout<<arr[i]<<" ";
		cout<<endl;
		
		if(arr[i]>max){
			max=arr[i];
		}
		if(arr[i]<min){
			min=arr[i];
		}	
		
	}
	cout<<endl;
	
	cout<<"Max is  :  "<<max<<endl;
	cout<<"Min is  :  "<<min;	
	 
}