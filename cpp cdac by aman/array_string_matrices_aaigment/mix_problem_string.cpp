#include<iostream>
#include<string>
using namespace std;
int main(){
	string line;
	cout<<"enter line : ";
	getline(cin,line);
	


		int count_number=0;
		int count_upercase=0;
		int count_lower=0;
		int word_count=0;
		bool word = false;
	

	
	for(int i=0;i<line.length();i++){
		if(line[i] >= '0'&& line[i] <= '9'){
			count_number++;
		}
	
		else if(line[i] >= 'A' && line[i] <= 'Z'){
			count_upercase++;
		}
	
		else if(line[i] >= 'a' && line[i] <= 'z'){
			count_lower++;
		}
		if(line[i] != ' ' && word == false){ 
		word_count++; 
		word = true;
		 } 
		if(line[i] == ' '){ 
		word = false; 
		}
		
	}
	
		
	cout<<"\n Number of alphabets = "<<count_lower+count_upercase;
	cout<<"\n Number of capital alphabets = "<<count_upercase;
	cout<<"\n Number of digits = "<<count_number;
		cout<<"\n Number of words = "<<word_count;
	
}


	
	
