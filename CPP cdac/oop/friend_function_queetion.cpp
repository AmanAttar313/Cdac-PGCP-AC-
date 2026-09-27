#include <iostream>
using namespace std;



class Inr{
	private:
		float inr;
		float dollar;
		 
	public:
		 Inr()
    {
        inr = dollar/90;
    }

		
};

class Dollar{
	private:
		float dollar;
		float inr;
			public:
	  Dollar(float dollar,float inr)
    {
        dollar = inr*90;
    }

    friend void display(Inr i, Dollar d);
		
};

void display(Inr i, Dollar d)
{
    cout << " Inr is :  " << i.Inr << endl;
    cout << " Dollar is : " << d.Dollar << endl;
}

int main()
{
  Inr i;
    Dollar d;

    display(i, d);


    return 0;
}
