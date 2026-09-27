#include<iostream>
using namespace std;
int main(){
int number,digit;
int sum=0;
cout<<"enter number : ";
cin>>number;
int number_copy=number;
while(number_copy>0){
	digit=number_copy%10;
	
	sum=sum+digit*digit*digit;
	number_copy/=10;
	
}
if(number_copy==sum){
	cout<<number<<" is Armstrong";
}else{
	cout<<number<<" is not Armstrong";
}


}