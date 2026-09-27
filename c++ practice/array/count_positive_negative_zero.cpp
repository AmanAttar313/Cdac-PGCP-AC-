#include<iostream>
using namespace std;

int main(){
	int size;
	cout<<"Enter Size of Array  :  ";
	cin>>size;
	
	int arr[size];
	int positive=0;
	int nagetive=0;
	int zero=0;
	
	for(int i=0;i<size;i++){
		cin>>arr[i];
	}
	
		
	for(int i=0;i<size;i++){
		if(arr[i]>0){
			positive++;
		}
		else if(arr[i]<0){
			nagetive++;
		}
		else{
			zero++;
		}
	}
	
	cout<<"Cout of Positive : "<<positive<<endl;
	cout<<"Cout of nagetive : "<<nagetive<<endl;
	cout<<"Cout of zero : "<<zero;
	
	
}


