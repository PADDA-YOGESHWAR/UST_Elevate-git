
/*"Write a C++ class 'Box' and its members as the following :
* void boxArea(float length, float width) : as a member function defiend inside class
* void boxVolume(float length, float width, float height) : as a member function defined oustide class
* void displayBoxDimensions() : as a friend function
* void displayWelcomeMessage() : as an inline function
Note: Take the input from the user"*/
#include<iostream>
using namespace std;
void boxVolume(float length,float width,float height)//member function defined outside the class
{
    cout<<"The volume of the box is : "<<length*width*height<<endl;
}
class box
{
    protected:
        float p,q,r;
    public:
        friend void display(box obj);//friendline function
        inline void say()//inline function
        {
            cout<<"Lets compute the value : "<<endl;
        }
        void boxArea(float length,float width)//member function defined inside the class
        {
            cout<<"The area of the box is : "<<length*width<<endl;
        }
};
void display(box obj)//function for friendline function
{
    cout<<"Enter the length,breadth and height of private box : ";
    cin>>obj.p>>obj.q>>obj.r;
    cout<<"Lenght of private box is "<<obj.p<<endl;
    cout<<"width of private box is "<<obj.q<<endl;
    cout<<"Height of private box is "<<obj.r<<endl;
}
int main()
{
    int a,b,c;
    cout<<"Enter the length of the box : ";
    cin>>a;
    cout<<"Enter the width of the box : ";
    cin>>b;
    cout<<"Enter the height of the box : ";
    cin>>c;
    box obj;
    obj.say();
   display(obj);
   obj.boxArea(a,b);
   boxVolume(a,b,c);
    return 0;
}