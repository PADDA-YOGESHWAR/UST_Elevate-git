//Demonstrate Template Functions and classes in C++
#include<iostream>
using namespace std;
template<typename newType>
newType add(newType a, newType b)
{
    return a+b;
}
template<class non>
non sub(non v,non j)
{
    return v-j;
}
int main()
{
    cout<<add<float>(4.2,3.4)<<endl;
     cout<<add<int>(7,3)<<endl;
      cout<<sub<float>(4.2,3.4)<<endl;
     cout<<sub<int>(7,3)<<endl;
     return 0;
}