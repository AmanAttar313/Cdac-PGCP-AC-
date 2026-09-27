#include <iostream>
using namespace std;

int main() {

    int num;
    cout<<"Enter number: ";
    cin>>num;

    \
    auto checkEvenOdd = [](int n){
        if(n%2==0)
            return "Even";
        else
            return "Odd";
    };

    cout<<num<<" is "<< checkEvenOdd(num);

    return 0;
}