#include<iostream>
/*
Problem 3: Elements Above and Below Average
Problem Definition
Write a C++ program that accepts into an array.
The program should perform the following operations:
Calculate the of all 10 elements.
Calculate the of the elements.
Print all elements that are .
Print all elements that are .
Also display the number of elements above and below the average.
Elements that are exactly equal to the average do not have to be included in either group.
Sample Input
*/
using namespace std;
int main(){
	int n;
	cout<<"enter size of array : ";
	cin>>n;
	int arr[n];
	int sum=0;
	int avg=0;
	int above_count=0;
	int below_count=0;
	
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	
		for(int i=0;i<n;i++){
		sum+=arr[i];
		avg=sum/n;
		
			
	}

	cout<<"\nsum : \n"<<sum<<endl;
	cout<<"\nAverage : \n"<<avg<<endl;
	cout<<"\nElements above average : \n";
	for(int i=0;i<n;i++){
	if(arr[i]>avg){
	cout<<arr[i]<<" ";
	above_count++;	
	}		
	}
	cout<<"\nElements below average : \n";
		for(int i=0;i<n;i++){
		if(arr[i]<avg){
			cout<<arr[i]<<" ";
			below_count++;
		}
	}
	cout<<"\nnumbers above avg : "<<above_count<<endl;
		cout<<"numbers below avg : "<<below_count;


	

	
	
	
}