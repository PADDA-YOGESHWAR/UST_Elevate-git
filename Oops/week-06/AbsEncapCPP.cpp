/*Write a C++ class 'AccessSpecifierDemo' with the following members: Member Variables :
1. private int priVar
2. protected int proVar
3. public int pubVar Member Methods:
1. public void setVar(int priValue,int proValue, int pubValue)
2. public void getVar()
Assign values for each member variable(priVar,proVar,pubvar) and using methods(setVar(),getVar()) and disaply them*/
#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private:
        int priVar;
    protected:
        int proVar;
    public:
      int pubVar;
    public:
    void setValue(int priValue,int proValue,int pubValue)// private public and protected values are set to some value
    {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }
     public:
    void getVar()// retrived those set values done in above function
    {
       cout<<priVar <<endl;
        cout<<proVar <<endl;
         cout<<pubVar <<endl;
    }
};
//those private and protected values can be used only in that class
int main()
{
     AccessSpecifierDemo obj;
     obj.setValue(10 ,20 ,30);
     obj.getVar();
     
     return 0;
}