package main

import "fmt"

func main() {
	// el diccionario es un mapa que se denomina a la coleccion de
	//pares clave-valor (agregar elementos y acceder a valore)

	edades := map[string]int{
		"Juan": 25,
		"Ana":  30,
		"Luis": 22,
	}
	//Acceso a un valor del mapa usando clave
	fmt.Println("Edad de Ana:", edades["Ana"])

	//Añadir par Clave-valor
	edades["Carlos"] = 28

	//imprimir mapa completo
	fmt.Println("mapa de edades:", edades)

	//comprobacion de existencia de una clave en el mapa
	edad, existe := edades["Maria"]
	if existe {
		fmt.Println("Edad de Maria", edad)
	} else {
		fmt.Println(("Maria no esta en el mapa"))
	}
}
