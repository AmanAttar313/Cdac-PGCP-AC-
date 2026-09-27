#include<iostream>
using namespace std;
int main(){
    int num1;
    int num2;
    cout<<"enter first number : ";
    cin>>num1;
     cout<<"enter second number : ";
    cin>>num2;

    if(num1>num2){
        cout<<"First number is greater";
    }
    else if(num1<num2){
         cout<<"Second number is greater";
    }
    else{
        cout<<"Both Numbers Are Equal";
    return 0;
}
}