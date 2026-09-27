#include<iostream>
using namespace std;
int main(){
	int p_name,p_price=300;
	cout<<"enter name of produuct :";
	cin>>p_name;
	cout<<"enter price of produuct :";
	cin>>p_price;
	int cost;
	int count=0;
	while(true){
		cout<<"\nguess the price of product ";
		cin>>cost;
			if(p_price==cost){
			cout<<"\nCongratulations Youe guess is correct";
			count++;
			break;			
		}
		else if(p_price<cost){
			cout<<"\nYour guess is more than the actual price";
			count++;
			
		}else if(p_price>cost){
			cout<<"\nYour guess is less than the actual price";
			count++;
		
		}
	
		
	}
	cout<<"\ntotal Number of attempts : "<<count;
	
	
	
}
