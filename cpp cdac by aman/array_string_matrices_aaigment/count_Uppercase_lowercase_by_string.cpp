#include<iostream>
#include<string>
using namespace std;
int main(){
	string line;
	cout<<"enter line : ";
	getline(cin,line);
	

		int count_upercase=0;
		int count_lower=0;
	

	
	for(int i=0;i<line.length();i++){
		if(line[i] >= 'A' && line[i] <= 'Z'){
			count_upercase++;
		}
	
		else if(line[i] >= 'a' && line[i] <= 'z'){
			count_lower++;
		}
		else if(line[i]==' '){
			line[i]=line[i]+1;
		}
		
		
	 }
	cout<<"\n lower count : "<<count_lower;
	cout<<"\n upercase count : "<<count_upercase;
	
	
	
}