#include<iostream>
#include<string>
using namespace std;
int main(){
	string line;
	cout<<"enter line : ";
	getline(cin,line);
	
		int word_count=1;
	
	for(int i=0;i<line.length();i++){
		if(line[i] ==' '){
			word_count++;
} }

	cout<<"\n word count is : "<<word_count;	
}