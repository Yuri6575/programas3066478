#include <iostream>
using namespace std;

int main()
{
    // Imprimir los números del 10 al 15
    for (int i = 10; i <= 15; i++)
    {
        cout << "Número: " << i << endl;
    }

    // Imprimir números pares entre 2 y 10
    for (int i = 2; i <= 10; i += 2)
    {
        cout << "Número par: " << i << endl;
    }

    return 0;
}