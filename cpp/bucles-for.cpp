#include <iostream>
#include <vector>
#include <map>

using namespace std;

// Estructura para almacenar los datos 
    string nombre;
    int edad;
};

int main() {
    // Parte 1: Uso de for con un arreglo de nombres
    vector<string> nombres = {"camila", "sebastian R", "Cristian", "Andres R", "Anyelo", 
                              "Esteban A", "Felipe", "Fito", "Hanssy R", "Hanz l", 
                              "Jhon", "juan pablo", "Nilo", "Santiago", "Santiago S", "Yuri"};

    // Imprimir todos los nombres
    for (const string& nombre : nombres) {
        cout << nombre << endl;
    }

    cout << "\n\n";

    // Parte 2: Usando un mapa (similitud con diccionario en Python)
    // Se crea un vector de personas
    vector<Persona> personas = {
        {"sebastian R", 24},
        {"Andres R", 26},
        {"Anyelo", 30},
        {"Esteban A", 28},
        {"Felipe", 23},
        {"Fito", 32},
        {"Hanssy R", 27},
        {"Jhon", 26},
        {"juan pablo", 25},
        {"Nilo", 26},
        {"Santiago", 20},
        {"Santiago S", 28},
        {"Yuri", 28}
    };

    // Imprimir el nombre y edad de cada persona
    for (const Persona& persona : personas) {
        cout << persona.nombre << ", " << persona.edad << " años" << endl;
    }

    // Parte 3: Operaciones con valores (ejemplo de aumentar la edad de cada persona)
    cout << "\n\nActualizando edades..." << endl;
    for (Persona& persona : personas) {
        persona.edad += 1;  // Aumentar la edad de cada persona en 1 año
    }

    // Imprimir el nombre y la nueva edad de cada persona
    for (const Persona& persona : personas) {
        cout << persona.nombre << ", " << persona.edad << " años" << endl;
    }

    return 0;
}
