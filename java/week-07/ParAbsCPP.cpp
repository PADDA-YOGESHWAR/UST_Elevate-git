// Demonstrate partial abstraction in C++.
#include<iostream>
using namespace std;

class impabs
{
    public:
    void display()
    {
        cout<<"hello every one"<<endl;
    }
    virtual void sub() = 0;
    
};
class animpabs
{
    public:
    virtual void wish()
    {
        cout<<"welcome to c++"<<endl;
    }
};
class de:public impabs,public animpabs
{
    public:
  
    void sub()
    { 
         cout<<"enter a  value:";
        int a;
        cin>>a;
        cout<<"enter  b value:";
        int b;
        cin>>b;
        cout<<a-b<<endl;

    }

};
int main()
{
    de a;
    
    a.sub();
    a.wish();

}