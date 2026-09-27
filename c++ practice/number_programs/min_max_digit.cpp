#include<iostream>
using namespace std;
int main(){
	int number;
	
	cout<<"Enter number : ";
	cin>>number;
	int number_copy=number;
	int max=0;
	int min=9;
	while(number_copy>0){
		int digit=number_copy%10;
		if(digit>max){
			max=digit;
		}
		 if(digit<min){
			min=digit;
		}
		number_copy/=10;
	}
	cout<<"maximum digit in your number :  "<<max<<endl;
	cout<<"minimum digit in your number :  "<<min;

}