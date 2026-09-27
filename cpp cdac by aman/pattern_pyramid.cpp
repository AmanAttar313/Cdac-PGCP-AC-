#include<iostream>
using namespace std;
int main(){
	for(int space=4,i=1;space>=1&&i<=4;i++,space--){
		for(int s=1;s<=space;s++){
			cout<<" ";
			
			}
			for(int j=1;j<=i;j++){
				cout<<i<<" ";
			}
		
		cout<<"\n";
	}

}