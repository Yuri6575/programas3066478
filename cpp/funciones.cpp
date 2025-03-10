#include <iostream>
using namespace std;

// Función sin retorno (void) que imprime un mensaje
void saludar()
{
    cout << "¡Hola, bienvenido al programa!" << endl;
}

// int  toma dos parámetros enteros y devuelve su suma
int sumar(int a, int b)
{
    return a + b;
}

// Ffloat toma dos números flotantes y devuelve su producto
float multiplicar(float x, float y)
{
    return x * y;
}

int main()
{
    // Llamar a la función saludar
    saludar();

    // Llamar a la función sumar y mostrar el resultado
    int resultadoSuma = sumar(5, 3);
    cout << "La suma de 5 y 3 es: " << resultadoSuma << endl;

    // Llamar a la función multiplicar y mostrar el resultado
    float resultadoMultiplicacion = multiplicar(4.5, 2.3);
    cout << "El producto de 4.5 y 2.3 es: " << resultadoMultiplicacion << endl;

    return 0;
}
