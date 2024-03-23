//Demonstrate pure abstraction using virtual functions in C++
#include<iostream>
using namespace std;
class pabs
{
    public:
    virtual void add() = 0;


};

class de:public pabs
{
    public:
    void add()
    {
        cout<<"enter a  value:";
        int a;
        cin>>a;
        cout<<"enter  b value:";
        int b;
        cin>>b;
        cout<<a+b<<endl;
    }
   

};
int main()
{
    de a;
    a.add();
   
}