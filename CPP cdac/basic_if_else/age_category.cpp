#include<iostream>
using namespace std;
int main(){
    int age;
    cout<<"Enter Your age : ";
    cin>>age;

    if(age<13){
        cout<<"child";
    }
    else if(age>=13 && age<=19){
        cout<<"Teenager";

    }
    else if(age>=20){
        cout<<"Adult";
    }
    return 0;
}