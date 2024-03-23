//Demonstrate 'Diamond Problem' in C++ using inheritance.
#include<iostream>
using namespace std;
class Person { //class Person
    public:
        void Persons()
        {
         cout << "Person called" << endl; 
        } //Base constructor
};

class Father : virtual public Person 
{ //class Father inherits Person
    public:
        void Fathers()   
        {
            cout << "Father called" << endl;
        }
};
 
class Mother : virtual public Person 
{ //class Mother inherits Person
    public:
       void Mothers()
        {
            cout << "Mother called" << endl;
        }
};
 
class Child : public Father, public Mother 
{ //class Child inherits Father and Mother
    public:
        void Childs()
        {
            cout << "Child called" << endl;
        }
};
 
int main()  {
    Child obj;
    obj.Persons();
}