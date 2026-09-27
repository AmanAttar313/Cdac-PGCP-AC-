#include <iostream>
using namespace std;

 inline int square(int n){
 	return n*n;
 }
int main() {
int num;
cout<<"enter number : ";
cin>>num;
cout<<"square is :"<<square(num);


    return 0;
}