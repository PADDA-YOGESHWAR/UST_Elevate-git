
#include<iostream>
using namespace std;
class AccessSpecifierDemo{
   public: 
    void setValue(int priValue)// private public and protected values are set to some value
    {
        cout<<"OK"<<endl;
    }
     
    void setValue()// retrived those set values done in above function
    {
        cout<<"sone"<<endl;
    
    }
};

class c : public AccessSpecifierDemo{
    public:
    void setValue()// retrived those set values done in above function
    {
        cout<<"val"<<endl;
    }
};
//those private and protected values can be used only in that class
int main()
{
     c obj;
     AccessSpecifierDemo demo;
     demo.setValue();
     obj.setValue();
     demo.setValue(7);
     
     return 0;
}