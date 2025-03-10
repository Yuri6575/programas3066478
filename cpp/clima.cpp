#include <iostream>
using namespace std;

int main()
{
    float temperatura;

    // Ingrese la temperatura
    cout << "Ingrese la temperatura en grados Celsius: ";
    cin >> temperatura;

    // Verificar la temperatura y dar una recomendación de vestimenta
    if (temperatura >= 25)
    {
        cout << "Hace calor. Usa ropa ligera como camiseta y shorts." << endl;
    }
    else if (temperatura >= 22)
    {
        cout << "Hace un clima agradable. Usa ropa cómoda como una camiseta y pantalones." << endl;
    }
    else if (temperatura >= 20)
    {
        cout << "Hace fresco. Es recomendable usar una chaqueta o suéter." << endl;
    }
    else if (temperatura >= 17)
    {
        cout << "Hace frío. Usa un abrigo grueso y guantes." << endl;
    }
    else
    {
        cout << "Hace mucho frío. Usa ropa de invierno como abrigo, bufanda, guantes y gorro." << endl;
    }

    return 17;
}
