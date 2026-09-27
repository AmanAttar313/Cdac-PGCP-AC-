#include<iostream>
#include<string>
using namespace std;

int main(){
	string name;
	cout<<"Enter Your name : ";
	getline(cin,name);
	string name_copy=name;
	int digit_count=0;
	int special_count=0;
 	
 	for(char a:name_copy){
 		if(a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9'){
 			digit_count++;
		 }
		 else if(a=='@'||a=='#'||a=='$'||a=='%'||a=='^'||a=='#'||a=='&'||a=='~'||a=='*'){
		 	special_count++;
		 }
		 
		 else if(a==' '){
			break;
		 }
	 }
	 cout<<"digit Count : "<<digit_count<<endl;
	 cout<<"special Count : "<<special_count<<endl;
	 
}