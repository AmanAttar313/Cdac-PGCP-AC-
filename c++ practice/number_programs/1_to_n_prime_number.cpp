#include<iostream>
using namespace std;
int main(){
	int start,end;
	cout<<"enter starting number : ";
	cin>>start;
	cout<<"Enter end number : ";
	cin>>end;
	cout<<"odd numbers are :"<<endl;
	for(int i=start;i<=end;i++){
		if(i%2!=0){
			cout<<i<<"   ";
		}
		
	}
	
	
	 
}