#include<iostream>
using namespace std;
int main(){
	//right side pattern incresing
	for(int space=4,i=1;space>=1&&i<=4;i++,space--){
		for(int s=1;s<=space;s++){
			cout<<" ";
			
			}
			for(int j=1;j<=i;j++){
				cout<<"*";
			}
		
		cout<<"\n";
	}
	//pyramid
		for(int space=4,i=1;space>=1&&i<=4;i++,space--){
		for(int s=1;s<=space;s++){
			cout<<" ";
			
			}
			for(int j=1;j<=i;j++){
				cout<<"* ";
			}
		
		cout<<"\n";
	}
	//diamond
	
	for(int space=4,i=1;space>=1&&i<=4;i++,space--){
		for(int s=1;s<=space;s++){
			cout<<" ";
			
			}
			for(int j=1;j<=i;j++){
				cout<<"* ";
			}
		
		cout<<"\n";
	}
	for(int space=1,i=4;space<=4&&i>=1;i--,space++){
		for(int s=1;s<=space;s++){
			cout<<" ";
			
			}
			for(int j=1;j<=i;j++){
				cout<<"* ";
			}
		
		cout<<"\n";
	}	
}
