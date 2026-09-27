#include<iostream>
using namespace std;

class Box{

private:
    float length;
    float breadth;
    float height;

public:

    // 1. No argument
    Box(){
        length = 0;
        breadth = 0;
        height = 0;
    }

    // 2. One argument - Cube
    Box(float side){
        length = side;
        breadth = side;
        height = side;
    }

    // 3. Three arguments
    Box(float l, float b, float h){
        length = l;
        breadth = b;
        height = h;
    }

    void volume(){
        float v = length * breadth * height;

        cout << "Length  : " << length << endl;
        cout << "Breadth : " << breadth << endl;
        cout << "Height  : " << height << endl;
        cout << "Volume  : " << v << endl;
    }
};

int main(){

    // No argument
    Box b1;

    cout << "Box 1:" << endl;
    b1.volume();

    cout << endl;

    // One argument - Cube
    Box b2(5);

    cout << "Box 2:" << endl;
    b2.volume();

    cout << endl;

    // Three arguments
    Box b3(10, 5, 4);

    cout << "Box 3:" << endl;
    b3.volume();

    return 0;
}