#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter number : ";
    cin>>n;
    // for(int i=2;i<n/2;i++){ 
    //     if(n%i==0){
    //         cout<<"composite "; // compite means number Has factors other than 1 and itself
    //         break;
    //     }
    // }

    bool flag=false;
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            flag = true;
            break;
        }
    }
    if(flag==true){
        cout<<"composite";
    }
    if(n==1){
        cout<<"not prime and not composite";
    }
    else if (flag==false){
        cout<<"prime";
    }
    
    
}