#include<iostream>
using namespace std;
int main(){
    float distance;
    float time;
    float speed;
    cout<<"Enter distance you travel : ";
    cin>>distance;
    cout<<"Enter Time you taking : ";
      cin>>time;
     if(time!=0){
        
            speed=distance/time;
     cout<<"Speed is : "<<speed;


    }else{
        cout<<"pls write valid time";
    }
   
   return 0;
   
}
