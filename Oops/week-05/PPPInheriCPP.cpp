/*"Demonstrate the following :
1. Private Inheritance
2. Protected Inheritance
3. Public Inheritance"*/
#include<iostream>
using namespace std;
class prvt
{
    void print()
    {
        cout<<"Hello Everyone"<<endl;
    }
};
class pub
{
    public:
        void wish()
        {
            cout<<"Welcome all"<<endl;
        }
};
class prot
{
    protected:
        void write()
        {
            cout<<"It will not work"<<endl;
        }
};
int main()
{
    prvt obj1;
    pub obj2;
    prot obj3;
    cout<<"Private"<<endl;
    obj1.print();
    cout<<"public"<<endl;
    obj2.wish();
    cout<<"protected"<<endl;
    obj3.write();
    return 0;
}