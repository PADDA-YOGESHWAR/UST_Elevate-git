//Demonstrate Simple Inheritance using a real time example.
#include<iostream>
using namespace std;
class Library
{
    public:
        void facility()
        {
            cout<<"College Library contains books"<<endl;
        }
};
class student : public Library
{
    public:
        void resource()
        {
            cout<<"Students can use Library"<<endl;
        }
};
int main()
{
    student obj;//we have created object for student class only
    obj.facility();//using facility function in Library class without creating object for Library class, this is done by object created for student
    obj.resource();//using resource function in student class using the object
    return 0;
}