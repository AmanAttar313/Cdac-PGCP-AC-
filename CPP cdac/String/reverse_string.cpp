#include<iostream>
#include<string>
//reverse string
using namespace std;
int main()
{
			
	string s1="",s2="abcdefgh";
	string temp=s2;
	for(int i=s2.length()-1;i>0;i--)
	{
		
	s1+=s2[i];
	
}
cout<<s1;

	

	return 0;
}
