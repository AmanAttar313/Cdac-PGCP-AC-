#include<iostream>
using namespace std;
int main(){
	float amount;
    
    cout<<"Enter Amount of product : ";
    cin>>amount;
    
    if(amount>=5000){
       float discount=amount*0.1;
        cout<<"Discount you get : "<<discount<<endl;
        float f_amount=amount+discount;
        cout<<"Your final amount to pay : "<<f_amount;
    }else{
        cout<<"Sorry there no discount";
    }
}
