#include<iostream>
#include<string>
using namespace std;

int main(){
	string name;
	cout<<"Enter Your name : ";
	getline(cin,name);
	string name_copy=name;
	int vowel_count=0;
	int consonant_count=0;
 	
 	for(char a:name_copy){
 		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
 			vowel_count++;
		 }
		 else if(a!=' '){
		 consonant_count++;
		 }
	 }
	 cout<<"Vowel Count : "<<vowel_count<<endl;
	 cout<<"Consonant Count : "<<consonant_count<<endl;
	 cout<<"Total Charater Count : "<<consonant_count+vowel_count;
}