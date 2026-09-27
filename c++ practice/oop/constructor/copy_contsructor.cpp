#include<iostream>
#include<string>
using namespace std;

class Student{

private:
    string name;
    int age;

public:

    // Parameterized Constructor
    Student(string n, int a){
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student &s){
        name = s.name;
        age = s.age;
    }

    void display(){
        cout << "Name : " << name << endl;
        cout << "Age  : " << age << endl;
    }
};

int main(){

    // Original object
    Student s1("Aman", 21);

    // Copy constructor
    Student s2(s1);

    cout << "Original Object:" << endl;
    s1.display();

    cout << "\nCopied Object:" << endl;
    s2.display();

    return 0;
}