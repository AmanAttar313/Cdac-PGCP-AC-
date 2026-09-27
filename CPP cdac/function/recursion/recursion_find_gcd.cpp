#include<iostream>
int gcd(int no1,int no2){
	if(no1%no2==0){
		return 0;
	}
	return gcd(no1,no1%no2);
}
int main(){
	gcd(11,22);
}