/*
15. 🏆 Student Grade Calculator
Take marks as input and display the grade:
Marks
Grade
90–100
A
75–89
B
60–74
C
40–59
D
Below 40
F

Also handle marks outside the valid range 0–100 by displaying:
"Invalid Marks"

*/

#include<iostream>
using namespace std;
int main(){
    int marks;
    cout<<"Enter Your Marks : ";
    cin>>marks;

    if(marks<0 || marks>100){
        cout<<"invalid number";
    }
    else if(marks>=90){
         cout<<"A Grade";
    }
     else if(marks>=75){
         cout<<"B Grade";
    }
     else if(marks>=60){
         cout<<"C Grade";
    }
    else if(marks>=40){
        cout<<"D Grade";
    }
    else{
        cout<<"F Grade";
    }
    return 0;

}