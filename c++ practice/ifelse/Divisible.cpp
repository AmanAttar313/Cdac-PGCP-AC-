#include<iostream>
using namespace std;
int main(){
    int number;
    cout<<"Enter Number : ";
    cin>>number;
    if(number%5==0||number%3==0){
        cout<<"Number Divisible by 5 and 3";
    }else{
        cout<<"not divisible by 5 and 3";
    }
}

