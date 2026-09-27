#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"enter size of array :";
	cin>>n;
	int arr[n];
	cout<<"enter element of array : ";
	for(int i=0;i<n;i++){
		cin>>arr[i];
//	}
//		for(int i=0;i<n;i++){
//		cout<<arr[i];
//	}

		//OR===============
	for(int item:a){
		cout<<item;
	}
	
}
