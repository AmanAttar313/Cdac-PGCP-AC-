#include<iostream>

using namespace std;
int main()
{
	int number;
	while(true)
	{
		cout<<"Enter number even or odd or 0 to stop:";
		cin>>number;
		
		if(number%2==0){
			cout<<"even number"<<endl;
			
		}
		
	
		else
			{
				cout<<"odd number "<<endl;
			
			}
			if(number<=0){
				cout<<"ending system";
			}
	}
	cout<<"outside loop :bye bye";
	return 0;
}

