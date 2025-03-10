#include <iostream>
using namespace std;

class Figura
{
private:
    int num_lados;
    int longitud;

public:
    // Constructor de la clase Figura
    Figura(int num_lados, int longitud)
    {
        this->num_lados = num_lados;
        this->longitud = longitud;
    }

    // Método para calcular el perímetro
    int hallar_perimetro()
    {
        return num_lados * longitud;
    }
};

int main()
{
    Figura piramide(4, 8);

    // Calcular el perímetro de la piramide
    int res = piramide.hallar_perimetro();

    // Mostrar el resultado
    cout << "El perímetro de la figura es: " << res << endl;

    return 0;
}