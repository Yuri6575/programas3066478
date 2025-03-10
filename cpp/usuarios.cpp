#include <iostream>
#include <string>
using namespace std;

int main()
{
    // variables
    string a, b, c;
    int d, e;

    // Solicitar datos
    cout << "Escriba sus nombres completos: ";
    getline(cin, a); // permitir nombres con espacios

    cout << "Escriba sus apellidos completos: ";
    getline(cin, b); // permitir apellidos con espacios

    cout << "Escriba su profesion: ";
    getline(cin, c); // permitir profesión con espacios

    cout << "Escriba su año de nacimiento: ";
    cin >> d;

    // Calculo de  edad
    e = 2025 - d;

    cout << "El (La) " << c << " " << a << " " << b << " tiene " << e << " años." << endl;

    return 0;
}
