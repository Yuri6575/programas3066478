#include <iostream>
#include <typeinfo> // Para obtener el tipo de la variable
using namespace std;

int main()
{

    int a = 5, b = 2;
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de operacion es: +" << endl;
    cout << "La segunda variable es: " << b << endl;
    int c = a + b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl; // Muestra el tipo de la variable

    a = 3;
    b = 4;
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de operacion es: -" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a - b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    a = 8;
    b = 6;
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de operacion es: *" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a * b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    a = 4;
    b = 6;
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de operacion es: /" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a / b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    a = 15;
    b = 3;
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de operacion es: **" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = 1;
    for (int i = 0; i < b; i++)
    {
        c *= a;
    }
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    a = 236;
    b = 22;
    cout << "La primera variable es: " << a << endl;
    cout << "El signo de operacion es: %" << endl;
    cout << "La segunda variable es: " << b << endl;
    c = a % b;
    cout << "El resultado es: " << c << endl;
    cout << "Tipo de c: " << typeid(c).name() << endl;

    // Operaciones con entrada del usuario
    cout << "Ingrese el valor para a: ";
    cin >> a;
    cout << "Ingrese el valor para b: ";
    cin >> b;

    res = a + b;
    cout << "La suma de los numeros es: " << res << endl;

    res = a - b;
    cout << "La resta de los numeros es: " << res << endl;

    res = a * b;
    cout << "La multiplicacion de los numeros es: " << res << endl;

    return 0;
}
