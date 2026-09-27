
#include <iostream>
using namespace std;

class Operation
{
public:
    // Declare pure virtual function add()
    public:
    virtual void add(int a,int b) = 0; 


    // Declare pure virtual function sub()
    virtual void sub(int a,int b) = 0; 

class Calculator : public Operation
{
public:

    // Override add() and display addition
    void add(int a,int b) override
    {
    	
        cout << "\nAddition = " <<(a+b);
    }
   

    // Override sub() and display subtraction
     void sub(int a,int b) override
    {
    	
        cout << "\nSubtraction = " << subra;
    }
};

int main()
{
    int a, b;

    cout << "Enter first number: ";
    cin >> a;

    cout << "Enter second number: ";
    cin >> b;

    Calculator obj;

    // Parent pointer referring to Child object
    Operation *p =&obj;

    p->add(30,25);

    p->sub(30,25);

    return 0;
}
