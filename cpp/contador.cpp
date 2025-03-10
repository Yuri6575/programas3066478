#include <iostream>
using namespace std;

int main()
{
    // Parte 1: Contador que llega hasta 30
    int contador = 0;
    while (contador < 30)
    {
        contador++;
        cout << "Iteración " << contador << endl;
    }

    // Parte 2: Solicitar al usuario un valor mayor a 10
    int a;
    while (true)
    {
        cout << "Introduzca un valor mayor a 10: ";
        cin >> a;

        if (a > 10)
        {
            cout << "Es correcto" << endl;
            break; // Sale del ciclo si la condición se cumple
        }
        else
        {
            cout << "Es incorrecto, pruebe de nuevo" << endl;
        }
    }

    return 0;
}