#include<iostream>
using namespace std;

class username {
public:
    void print(string name) {
        cout << "hello " + name << endl;
    }

    void print(int regno) {
        cout << "registration no: " << regno << endl;
    }
};

int main() {
    username obj;
    obj.print(14);
    obj.print("Lucky");
    return 0;
}
