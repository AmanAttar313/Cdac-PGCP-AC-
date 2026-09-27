#include<iostream>
using namespace std;

int main(){
	int row,column;
	cout<<"enter Row and column : ";
	cin>>row>>column;

	int m[row][column];
	
	for(int r=0;r<row;r++){
		for(int c=0;c<column;c++){
			cout<<"enter mtarix data ["<<r<<"]"<<"["<<c<<"]";
			cin>>m[r][c];
		}
		cout<<endl;
	}
		//sum of matrix
		int m_sum=0;
		for(int r=0;r<row;r++){
		for(int c=0;c<column;c++){
			m_sum+=m[r][c];
		}
	}
		
		//sum of column
		for(int c=0;c<column;c++){
			int c_sum=0;
		for(int r=0;r<row;r++){
			c_sum+=m[r][c];
		}
		
		cout<<"Column"<<" ["<<c <<"] "<<"Sum = "<<c_sum<<endl;
	}
	
	//sum of column
		for(int r=0;r<row;r++){
			int r_sum=0;
		for(int c=0;c<column;c++){
			r_sum+=m[r][c];
		}
		
		cout<<"Row"<< " ["<<r <<"] "<<"Sum = "<<r_sum<<endl;
	}
	cout<<"sum of matrix = "<<m_sum;
	
	
}