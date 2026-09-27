#include<iostream>
using namespace std;
int main(){
	

	
	int arr[10];
	
	cout<<"enter numbers : ";
	for(int i=0;i<10;i++){
		cin>>arr[i];
	}
		int max;
	int min;
	for(int i=0;i<10;i++){
		if(arr[i]>max){
	max=arr[i];
		
	}
	else if(arr[i]<min){
	min=arr[i];
			
		
	}
	
	}
	cout<<max<<" : is maximum" <<endl;
		cout<<min<<" : is maximum" ;
	

	
	
}