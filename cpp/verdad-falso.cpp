#include <iostream>
using namespace std;

int main()
{
    // valores booleanos
    bool a = true;
    bool b = false;

    // Operación AND
    cout << (a && b) << endl;

    int x = 2;
    int y = 3;
    int c = 4;
    int d = 10;

    cout << (x == y && c < d) << endl;

    // Operación NOT
    cout << (!(x == y) && c > d) << endl;

    return 0;
}