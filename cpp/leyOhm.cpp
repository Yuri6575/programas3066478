#include <iostream>
using namespace std;

int main()
{
    // variables
    int v, r;
    float res;

    // valor del voltaje y la resistencia
    cout << "Ingrese el valor del voltaje del circuito (V): ";
    cin >> v;

    cout << "Ingrese el valor de la resistencia del circuito (R): ";
    cin >> r;

    // Calcular la corriente (ley de Ohm: I = V / R)
    if (r != 0)
    {
        res = static_cast<float>(v) / r;
        cout << "Al conectar un resistor de R = " << r << " ohm a una fuente de V = " << v
             << " voltios, circulará una corriente de " << res << " amperios." << endl;
    }
    else
    {
        cout << "Error: La resistencia no puede ser cero." << endl;
    }

    return 0;
}
