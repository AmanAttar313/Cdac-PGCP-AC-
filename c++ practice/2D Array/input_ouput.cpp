#include<iostream>
using namespace std;

int main(){

	int row,column;
	cout<<"Enter number or Rows And Columns : ";
	cin>>row>>column;
	
	int m[row][column];
	
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			cout<<"enter data for m ["<<i<<"]["<<j<<"]";
			cin>>m[i][j];
		}
	}
	
		cout << "\nMatrix is:" << endl;

		for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			cout<<m[i][j]<<"  ";
		}
		 cout << endl;
	}
	
	  cout<<"\n\n\nTranspose matrix : "<<endl;
		for(int j=0;j<column;j++){
		for(int i=0;i<row;i++){
			cout<<m[i][j]<<"  ";
		}
		 cout << endl;
	}
	
}


