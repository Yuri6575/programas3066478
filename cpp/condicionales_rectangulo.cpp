
int main()
{
    float ancho, alto;

    // ingrese ancho y el alto del rectángulo
    cout << "Ingrese el ancho del rectángulo: ";
    cin >> ancho;
    cout << "Ingrese el alto del rectángulo: ";
    cin >> alto;

    // Verificar que las dimensiones sean positivas
    if (ancho <= 0 || alto <= 0)
    {
        cout << "Las dimensiones deben ser valores positivos." << endl;
    }
    else
    {
        // si el rectángulo es cuadrado o no
        if (ancho == alto)
        {
            cout << "Es un cuadrado." << endl;
        }
        else
        {
            cout << "Es un rectángulo." << endl;
        }

        // Calcular y mostrar el área y el perímetro
        float area = ancho * alto;
        float perimetro = 2 * (ancho + alto);

        cout << "Área del rectángulo: " << area << endl;
        cout << "Perímetro del rectángulo: " << perimetro << endl;
    }

    return 0;
}