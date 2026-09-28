#include<iostream>
using namespace std;
int main(){
	int* ptr; // suppose ptr = 100 (memory address)
	int* ptr2=ptr+2; // adding +2 means addinhg 4 bytes (integer) => 108
	cout<<ptr2-ptr<<endl;
}