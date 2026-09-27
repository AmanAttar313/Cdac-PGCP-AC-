#include<iostream>
#include<string>
using namespace std;
int main(){
	string line;
	cout<<"enter line : ";
	getline(cin,line);
	
		int count_number=0;
	
	for(int i=0;i<line.length();i++){
		if(line[i] >= '0'&& line[i] <= '9'){
			count_number++;
		}
}

	cout<<"\n number count is : "<<count_number;	
}