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
	
	
	int even=0,odd=0;
	for(int i=0;i<size;i++){
	
		
		
		if(arr[i]%2==0){
		
			even++;
		}
		else{
			
			odd++;
	}
	cout<<endl;
	}
	
	// printing even odd numbers in array
	
		for(int i=0;i<size;i++){
		cout<<arr[i]<<" ";
		
		
		if(arr[i]%2==0){
			cout<<"Even : "<<arr[i]<<" ";
			
		}
		else{
			cout<<"Odd : "<<arr[i]<<" ";
			
	}
	cout<<endl;
	}
		
	cout<<endl;
	
	cout<<"Even Count is  :  "<<even<<endl;
	cout<<"Odd Count is  :  "<<odd;	
	 
}