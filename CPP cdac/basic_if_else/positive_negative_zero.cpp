#include<iostream>
using namespace std;
int main(){
    int number;
    cout<<"enter number : ";
    cin>>number;

    if(number<0){
        cout<<"-ve number";
    }
    else if(number==0){
        cout<<"number is zero";
    }
    else{
        cout<<"+Ve number";
    }
    return 0;
}