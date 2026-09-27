#include<iostream>
using namespace std;
int main(){
    float speed;
    cout<<"Enter your car speed : ";
    cin>>speed;
    if(speed>80){
        cout<<"Fine is 2000";
    }else{
        cout<<"No Fine";
    }
    return 0;
}