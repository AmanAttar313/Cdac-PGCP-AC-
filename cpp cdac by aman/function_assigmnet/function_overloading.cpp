#include<iostream>
using namespace std;
class Display{
	public:
		void show(int no){
			
			cout<<"Integer value = "<<no<<endl;
		}
			void show(double d){
			cout<<"Decimal value = "<<d<<endl;
		}
			void show(char ch){
			cout<<"Character value = "<<ch<<endl;
		}
};

int main(){
	int no;
	double d;
	char ch;
	
	Display o;
	
	cout<<"enter interger : ";
	cin>>no;
	o.show(no);
	
		cout<<"enter Decimal : ";
	cin>>d;
	o.show(d);
	
		cout<<"enter Character : ";
	cin>>ch;
	o.show(ch);
	
}