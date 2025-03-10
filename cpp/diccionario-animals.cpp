#include <iostream>
#include <map>
#include <string>
using namespace std;

int main()
{
    // Diccionario nombre de animales y  una descripción
    map<string, string> diccionarioAnimales;

    // Agregar 5 animales y sus descripciones
    diccionarioAnimales["Perro"] = "Un animal doméstico conocido por su lealtad y compañía.";
    diccionarioAnimales["Gato"] = "Un animal doméstico que es independiente y a menudo tiene un comportamiento juguetón.";
    diccionarioAnimales["Elefante"] = "El mamífero terrestre más grande, conocido por su trompa y orejas grandes.";
    diccionarioAnimales["Tigre"] = "Un gran felino conocido por su fuerza y su hermosa piel rayada.";
    diccionarioAnimales["Delfín"] = "Un mamífero marino conocido por su inteligencia y habilidades sociales.";

    // Imprimir todos los animales en el diccionario
    cout << "Diccionario de animales:" << endl;
    for (const auto &animal : diccionarioAnimales)
    {
        cout << "Animal: " << animal.first << ", Descripción: " << animal.second << endl;
    }

    // Solicitar al usuario un animal para obtener su descripción
    string animalBuscado;
    cout << "\nIntroduce el nombre de un animal para obtener su descripción: ";
    cin >> animalBuscado;

    // Verificar si el animal existe en el diccionario
    if (diccionarioAnimales.find(animalBuscado) != diccionarioAnimales.end())
    {
        cout << "Descripción de " << animalBuscado << ": "
             << diccionarioAnimales[animalBuscado] << endl;
    }
    else
    {
        cout << "El animal no se encuentra en el diccionario." << endl;
    }

    return 0;
}