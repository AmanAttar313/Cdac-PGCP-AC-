#include<iostream>
using namespace std;

int main(){
	int size;
	cout<<"Enter Size of Array  :  ";
	cin>>size;
	
	int arr[size];
	

	
	cout << "Enter number into array :"<<endl;
	for(int i=;i<size;i++){
		cin>>arr[i];
	}
	
	int largest=arr[0];
	int second_largest=arr[0];
	
	int minimum=arr[0];
	int second_minimum=arr[0];
	
		
	for(int i=0;i<size;i++){
	//largest and second largest		
	if(arr[i]>largest){
		second_largest=largest;	
		largest = arr[i];
	}
	else if(arr[i]>second_largest && arr[i]!=largest){
		second_largest=arr[i];
	}
	
	//minimum and second minimum
	if(arr[i]<minimum){
	
		second_minimum=minimum;
		minimum = arr[i];   
			
	}
		else if(arr[i]<second_minimum && arr[i]!=minimum){
		second_minimum=arr[i];
	}
}
	cout<<"largest is : "<<largest<<endl;
	cout<<"second largest is : "<<second_largest<<endl;
	
	cout<<"minimum is : "<<minimum<<endl;
	cout<<"second minimum is : "<<second_minimum;
	
}


