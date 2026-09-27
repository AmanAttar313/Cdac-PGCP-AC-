#include <iostream>
using namespace std;
int main()
{
    float P;
    float R;
    float T;

    cout<<"Enter Pricipal : ";
    cin>>P;
    cout<<"Enter Rate : ";
    cin>>R;
    cout<<"Enter time : ";
    cin>>T;

    float SI = (P * R * T) / 100;
    cout<<"Simple Interest is : "<<SI<<endl;
    float amount=P+SI;
    cout<<"total amount is : "<<amount;

}