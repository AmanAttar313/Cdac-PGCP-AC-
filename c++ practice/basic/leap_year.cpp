#include<iostream>
using namespace std;
int main(){
/*  // first solution
	char c;
	cout<<"enter Alphabet : ";
	cin>>c;
	
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
		cout<<c<<"  is Vowel ";
	}else{
		cout<<c<<"\t is Consonant ";
	}
*/

// // best solution

	char c;

	cout<<"enter Alphabet : ";
	cin>>c;
		c=tolower(c); 
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		cout<<"  is Vowel ";
	}else{
		cout<<"is Consonant ";
	}

	
	
}