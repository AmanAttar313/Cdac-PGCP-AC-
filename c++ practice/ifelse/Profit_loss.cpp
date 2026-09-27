#include<iostream>
using namespace std;
int main(){
    int cp;
    int sp;
    cout<<"Enter Cost Price : ";
    cin>>cp;
    cout<<"Enter Selling Price : ";
    cin>>sp;

    if(sp>cp){
        cout<<"You make Profit : " <<sp-cp;
    }
    else if(sp<cp){
        cout<<"Sorry You Getting Loss :"<<cp-sp;
    }
    else{
     cout<<"NO Profit No Loss";
    }
}