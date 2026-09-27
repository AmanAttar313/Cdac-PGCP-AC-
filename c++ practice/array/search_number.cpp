#include<iostream>
using namespace std;

int main(){
	int size;
	cout<<"Enter Size of Array  :  ";
	cin>>size;
	
	int arr[size];
	
	int number;
	
	bool found=false;
	
	cout << "Enter number into array";
	for(int i=0;i<size;i++){
		cin>>arr[i];
	}
	
	cout<<"Enter Number You want to search : ";
	cin>>number;
		
	for(int i=0;i<size;i++){
		if(arr[i]==number){
			found=true;
			cout << "Number found at index : " << i;
			break;
		
		}
		
	}
	
	if(found==false){
		cout<<"number is not found : ";
	}
}


