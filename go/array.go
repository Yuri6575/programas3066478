package main

import "fmt"

func main() {
	// todos los valores son de tamaño fijo y mismo tipo de datos

	var animales [5]string
	animales[0] = "Delfin"
	animales[1] = "Leon"
	animales[2] = "Conejo"
	animales[3] = "Caballo"
	animales[4] = "Gallina"

	fmt.Println(animales)

	alimentos := [5]string{"moluscos", "carne", "borraja", "pasto", "maiz"}

	fmt.Println(alimentos)
	fmt.Println(animales[1], alimentos[1])

	//arreglo para concer el tamaño
	size := len(animales)
	fmt.Println("tamaño del arreglo es: ", size)

	//fmt.PrintIn(animales[inicio:final(excluyente)])
	fmt.Println(animales[0:2])

}
