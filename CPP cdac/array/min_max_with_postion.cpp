#include<iostream>
using namespace std;
int main(){
	
	int arr[]={66,11,55,22,99,88,77,12,45,67,89,34,28,19};
	int min,max,min_position,max_position;
	int size=sizeof(arr)/sizeof(arr[0]);



      min=max=arr[0];
	 min_position=max_position=0;

		for(int i=0;i<size-1;i++){
			if(arr[i]>max){
				max=arr[i];
				max_position=i;
			}
			if(arr[i]<min){
				min=arr[i];
				min_position=i;
			}
		
	}
	
	
	cout<<"max of array is : "<<max<<"  "<<max_position<<endl;
	cout<<"min of array is : "<<min<<" "<<min_position;

	
}
