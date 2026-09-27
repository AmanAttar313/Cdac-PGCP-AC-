
#include<iostream>
using namespace std;
int main()
{
	string name;
	string user_character;
	int count=0;
	cout<<"Enter Your name";
	getline(cin,name);
	cout<<"enter charcter which you want of this frequncy : ";
	cin>>user_character;
	
	for(int ch:name){
		if(ch==user_character)
		{
			count++;
		}
	}
	cout<<count;
	
	return 0;
}
