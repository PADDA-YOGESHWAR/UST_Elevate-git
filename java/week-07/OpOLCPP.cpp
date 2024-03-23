//Demonstrate Operator overlaoding in C++.
#include<iostream>
using namespace std;
class assign
{
    public:
    int ip,dp;
    assign()
    {
        ip=0;
        dp=0;
    }
    assign(int i, int j)
    {
        ip=i;
        dp=j;

    }
    void operator = (assign obj)
    {
        ip=obj.ip;
        dp=obj.dp;

    }
    void show()
    {
        cout<<"number is:"<<ip<<dp<<endl;
    }
};
int main()
{
    assign a(1,2),b(3,4);
    a.show();
    b.show();
    a=b;
    a.show();

}