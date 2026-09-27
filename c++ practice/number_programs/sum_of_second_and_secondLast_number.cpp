#include<iostream>
using namespace std;

int main(){
	int number=12345;
	
	int s=number/1000;
	
	int second=s%10;
	int sl=number/10;
	int second_last=sl%10;
	
	
	int sum=second_last+second;
	cout<<second<<" 2nd number"<<endl;
	cout<<second_last<<" 2nd last number"<<endl;
	cout<<sum<<"   sum";
}