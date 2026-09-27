#include<iostream>
#include<string>
using namespace std;

string name(string n,string nat="Indian"){

	cout<<"Name is :"<<n<<endl;
	cout<<"Nationality is :"<<nat;
}
int main(){
	string n;
	cout<<"ENter name";
	cin>>n;
	name(n);
}