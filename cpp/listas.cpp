#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main()
{
    // el vector  días de la semana
    vector<string> lista = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};

    // Imprimir el tercer elemento de la lista
    cout << lista[2] << endl;

    // Imprimir toda la lista
    for (const string &dia : lista)
    {
        cout << dia << " ";
    }
    cout << endl;

    // Imprimir los primeros tres elementos de la lista
    for (int i = 0; i < 3; ++i)
    {
        cout << lista[i] << " ";
    }
    cout << endl;

    // Lista con elementos mixtos
    vector<vector<string>> listaCompleta = {
        {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado"},
        {"manuel", "0", "2", "0.25", "True"}};

    for (int i = 0; i < 4; ++i)
    {
        cout << listaCompleta[0][i] << " ";
    }
    cout << endl;

    for (int i = 0; i < 3; ++i)
    {
        cout << listaCompleta[1][i] << " ";
    }
    cout << endl;

    return 0;
}
