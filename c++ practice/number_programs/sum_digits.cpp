#include<iostream>
using namespace std;
int main(){
int number,cube,digit;
int sum=0;
cout<<"enter number : ";
cin>>number;
int number_copy=number;
while(number>0){
	digit=number_copy%10;
	sum+=digit;
	cube=digit*digit*digit;
	number_copy/=10;
	
}
if(number_copy==sum){
	cout<<number<<" is Armstrong";
}else{
	cout<<number<<" is not Armstrong";
}


}