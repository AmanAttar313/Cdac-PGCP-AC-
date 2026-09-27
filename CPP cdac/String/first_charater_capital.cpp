#include<iostream>
#include<string>
//reverse string
using namespace std;
int main()
{
			
	string line;
	cout<<"enter line ";
	string newline;
	getline(cin,line);
	for(int i=0;i<line.length();i++)
  {
	newline=toupper(line[0]);
	if(line[i]==" ")
	{
		
		line[i+1]=char(toupper(line[0]));
		newline=line[i]
		
	}
	
		cout<<line;
   }
	

	return 0;
}
