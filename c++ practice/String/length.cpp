#include<iostream>
#include<string>
using namespace std;

int main(){
	string name;
	cout<<"Enter Your name : ";
	cin>>name;
	int left=0;
	int right=name.length()-1;
	
	while(left<right){
		char temp=name[left];
		name[left]=name[right];
		name[right]=temp;
		left++;
		right--;
	}
	cout<<"reverse : "<<name;
}