#include <iostream>
#include <string>
using namespace std;

int main()
{
    // Variables
    int a = 2;
    string nombre = "ana";
    int edad = 28;
    string ciudad = "Medellin";

    // Primeras condiciones
    if (a == 2)
    {
        cout << "a vale 2" << endl;
    }
    else
    {
        cout << "a es diferente de 2" << endl;
    }

    // condiciones (nombre y edad)
    if (nombre == "ana" && edad == 28)
    {
        cout << "su nombre es ana y tiene 28 años" << endl;
    }
    else if (nombre == "ana" && !(edad == 28))
    {
        cout << "su nombre es ana y no tiene 28 años" << endl;
    }
    else if (nombre != "ana" && edad == 28)
    {
        cout << "su nombre no es ana y tiene 28 años" << endl;
    }

    // condiciones (nombre y ciudad)
    if (nombre == "ana" && ciudad == "Medellin")
    {
        cout << "su nombre es ana y la ciudad donde vive es Medellin" << endl;
    }
    else if (nombre == "ana" && ciudad != "Medellin")
    {
        cout << "su nombre es ana y la ciudad donde vive no es Medellin" << endl;
    }
    else if (nombre != "ana" && ciudad != "Medellin")
    {
        cout << "su nombre no es ana y la ciudad donde vive no es Medellin" << endl;
    }
    else
    {
        cout << "No se llama ana ni tiene 28 años" << endl;
    }

    return 0;
}
