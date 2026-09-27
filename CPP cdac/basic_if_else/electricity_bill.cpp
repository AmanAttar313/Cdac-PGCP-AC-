/*
An electricity company calculates the bill as:
Bill = Units × Rate
Take units consumed and rate per unit as input.
Calculate the bill.
Then:
If the bill is above ₹2,000, display "High Consumption"
Otherwise, display "Normal Consumption"

*/
#include<iostream>
using namespace std;
int main(){
    float unit;
    float rate;

    cout<<"Enter Electricity units : ";
    cin>>unit;
    cout<<"Enter Electricity Bill : ";
    cin>>rate;

    float bill=unit*rate;
    cout<<"bill is : "<<bill;

    if(bill>2000){
        cout<<"High Consumption";
    }else{
        cout<<"Normal Consumption";
    }
    return 0;

}   
