#include<iostream>
#include<string>
using namespace std;

int main(){
	string name;
	cout<<"Enter Your name : ";
	getline(cin,name);
	string name_copy=name;
	int left=0;
	int right=name_copy.length()-1;
	
	while(left<right){
		char temp=name_copy[left];
		name_copy[left]=name_copy[right];
		name_copy[right]=temp;
		left++;
		right--;
	}
	if(name_copy==name){
		cout<<"String is Palindrome";
	}
	else{
		cout<<"String is NOt Palindrome";
	}
}