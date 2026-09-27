#include<iostream>
using namespace std;

int main(){

	int row,column;
	cout<<"Enter number or Rows And Columns : ";
	cin>>row>>column;
	
	int m[row][column];
	int r_sum=0;
	int c_sum=0;
	
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			cout<<"enter data for m ["<<i<<"]["<<j<<"]";
			cin>>m[i][j];
		}
	}
		//DISPLAY MATRIX
		cout << "\nMatrix is:" << endl;

		for(int i=0;i<row;i++){
			
		for(int j=0;j<column;j++){
			cout<<m[i][j]<<"  ";
			
		}
		 cout << endl;	 
	}
		//SUM OF MATRIX
		int sum=0;
		for(int i=0;i<row;i++){
			
		for(int j=0;j<column;j++){
			sum+=m[i][j];
			
		}
		 cout << endl;	 
	}
		//sum of rows
	
		for(int i=0;i<row;i++){
			
		for(int j=0;j<column;j++){
				c_sum+=m[i][j];
			
		}
		 cout << endl;	 
	}
	
	//SUM OF COLUMNS
	
		for(int i=0;i<row;i++){
			int c_sum=0;
		for(int j=0;j<column;j++){
			c_sum+=m[i][j];
			
		}
		 cout << endl;	 
	}
	
	
	cout<<"Sum of column : "<<c_sum<<endl;
	cout<<"Sum of row : "<<r_sum<<endl;
	cout<<"Sum of matrix : "<<r_sum+c_sum;
	

	
}


