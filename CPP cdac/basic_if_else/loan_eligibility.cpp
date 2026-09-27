/*
14. 🏦 Loan Eligibility
A bank wants to check whether a person is eligible for a basic loan.
Input:
Age
Monthly salary
Eligibility conditions:
Age must be 21 or above
Salary must be ₹25,000 or above
If both conditions are satisfied, display:
"Loan Eligible"
Otherwise:
"Loan Not Eligible"

*/
#include<iostream>
using namespace std;
int main(){
    int Age;
    float salary;
    
    cout<<"Enter Age : ";
    cin>>Age;
    cout<<"Enter salary : ";
    cin>>salary;

    if(Age >=21 && salary>=25000){
        cout<<"Loan Eligible";

    }
    else{
        cout<<"Loan Not Eligible";
    }
     return 0;
}