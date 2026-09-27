#include<iostream>
using namespace std;

int main(){
	int size;
	cout<<"Enter Size of Array  :  ";
	cin>>size;
	
	int arr[size];
	
	int temp;
	
	cout << "Enter number into array";
	for(int i=0;i<size;i++){
		cin>>arr[i];
	}
	int arr1[size];
	
		
	for(int i=0;i<size;i++){
		
		arr1[i]=arr[i];
		
			
	}
	for(int i=0;i<size;i++){
		cout<<arr1[i];
	}
	
	
}


