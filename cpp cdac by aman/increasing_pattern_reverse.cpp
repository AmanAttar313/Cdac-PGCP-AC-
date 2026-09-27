#include<iostream>
using namespace std;
int main(){
	for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			cout<<"*";
		}
		cout<<"\n";
	}
	//// printing incresing  number
		for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			cout<<j;
		}
		cout<<"\n";
	}
	// printing incresing row number
		for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			cout<<i;
		}
		cout<<"\n";
	}
		
		for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			cout<<j%2;
		}
		cout<<"\n";
	}
		// % operator incresing pattern
		for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			cout<<(j+1)%2;
		}
		cout<<"\n";
		
	}
	//odd incresing pattern
		for(int i=1;i<=1;i++){
		for(int j=1;j<=i;j++){
			cout<<2*j-1;
		}
		cout<<"\n";
	}
	
	//even incresing pattern
		for(int i=5;i>=1;i--){
		for(int j=1;j<=i;j++){
			cout<<2*j;
		}
		cout<<"\n";
	}
	
	// nnumber series
			int c=0;		
		for(int i=5;i>=1;i--){
		for(int j=1;j<=(i+1);j++){
			cout<<c;
			c++;
		}
		cout<<"\n";
	}
}
